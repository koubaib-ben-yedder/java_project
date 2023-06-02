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
import miniProject.mvc.view.inscription;

public class controlerInscription extends Test implements ActionListener {
	
	
	String E_mail;
	String password;
	String role;
	String name;
	String lastName;
	inscription inscription;
    boolean ok=true;

	String id;

	
	public controlerInscription(inscription inscription,String id) {
		this.inscription=inscription;
		this.id=id;
		
	}
	


	public controlerInscription(inscription inscription) {
		// TODO Auto-generated constructor stub
		this.inscription=inscription;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	if (id!=null) {
		Routing ro= new Routing(inscription,id);
		ro.actionPerformed(e);
		return ;
	}
	
	E_mail=inscription.E_mail.getText();
	password=inscription.password.getText();
	role=inscription.role.getText();
	name=inscription.name.getText();
	lastName=inscription.lastName.getText();
	JFrame frame = new JFrame();
	frame.setSize(500,100);
	frame.setLocation(300,150);

	new WindowEvent(inscription, WindowEvent.WINDOW_CLOSED);
	frame.setTitle("error");
	frame.setVisible(true);
	frame.setLayout(new FlowLayout());  
	
	
	Test test = new Test();
	if (test.testIfIsEmpty(E_mail)) {
		
		Label error=new Label("E_mail is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
		System.out.println("E_mail is empty");
	     ok=false;

	}
	
	if (test.testIfIsEmpty(password)) {
		
		Label error=new Label("password is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("password is empty");
	}
	
	if (test.testIfIsEmpty(role)) {
		
		Label error=new Label("role is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("role is empty");
	}
	
	if (test.testIfIsEmpty(name)) {
		
		Label error=new Label("name is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;


		System.out.println("name is empty");
	}
	
	if (test.testIfIsEmpty(lastName)) {
		
		
		Label error=new Label("lastname is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;


		System.out.println("lastname is empty");
	}
	if (test.testIFIsvalidEmail(E_mail)) {
		
		
		 Label error=new Label("E_mail is not valid");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("E_mail is not alphabite");
	}
	
	if (test.testIfISLeterres(role)==false) {
		
		
		 Label error=new Label("role is not aplhabite");
		 error.setForeground(Color.red);
	     frame.add(error); 
		
	     ok=false;

		System.out.println("role is not aplhabite");
	}
	
	if (test.testIfIsNumber(password) || password.length()==8) {
		
		
		 Label error=new Label("passowrd  is not aplhabite");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("passowrd  is not aplhabite");
	}
	

	
	 if (ok==true) {
	    	
		 Label error=new Label("insert with sucess");
		 error.setForeground(Color.green);
	     frame.add(error);
	     ok=true;
	     inscription.name.setText("");
	     inscription.E_mail.setText("");
	     inscription.password.setText("");
	     inscription.role.setText("");
	     inscription.lastName.setText("");

	   
	    }
   

	 ok=true;
	
	
	
	
	}
	
	

}
