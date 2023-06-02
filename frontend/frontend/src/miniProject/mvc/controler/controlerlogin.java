package miniProject.mvc.controler;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.Login;

public class controlerlogin extends Test implements ActionListener{
	

    Login login;
	String E_mail;
	String password;
	String id;
    boolean ok=true;

	
	public controlerlogin(Login login,String id ) {
		this.login=login;
		this.id=id;
	}



	public controlerlogin(Login login) {
		// TODO Auto-generated constructor stub
		this.login=login;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (id!=null) {
			Routing ro =new Routing(login,id);
			ro.actionPerformed(e);
			return ;
		}
		E_mail=login.E_mail.getText();
		password=login.password.getText();
		
		 JFrame frame = new JFrame();
		 frame.setSize(500,200);
		 frame.setLocation(300,150);

		 new WindowEvent(login, WindowEvent.WINDOW_CLOSED);
		 frame.setLocation(550,100);
		 frame.setTitle("error");
		 frame.setVisible(true);
		 frame.setLayout(new FlowLayout()); 

		Test test = new Test();
		
		if (test.testIfIsEmpty(E_mail)) {
			

			Label error=new Label("E_mail is empty");
			 error.setForeground(Color.red);
		     frame.add(error); 
		     ok=false;
			System.out.println("E_mail is empty");
			
		}
		
		if (test.testIfIsEmpty(password)) {

			Label error=new Label("password is empty");
			 error.setForeground(Color.red);
		     frame.add(error); 
		     ok=false;

			System.out.println("password is empty");
		}
		
		if (test.testIFIsvalidEmail(E_mail)) {
			

			Label error=new Label("E_mail is empty");
			 error.setForeground(Color.red);
		     frame.add(error); 
		     ok=false;
			System.out.println("role is empty");
		}
		
		if (test.testIfIsNumber(password) && password.length()==8) {
			

			Label error=new Label("password is empty");
			 error.setForeground(Color.red);
		     frame.add(error); 
		     ok=false;
			System.out.println("name is empty");
		}
	
		
		
		 if (ok==true) {
		    	
			 Label error=new Label("update with sucess");
			 error.setForeground(Color.green);
		     frame.add(error);
		     ok=true;
		     login.E_mail.setText("");
		     login.password.setText("");
		  
		   
		    }
	   

		 ok=true;
			 
			   
		
	}



	
	

}
