package miniProject.mvc.controler;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.createClient;
import miniProject.mvc.view.createProvider;
import miniProject.mvc.view.modifyProvider;
import miniProject.mvc.view.profileModify;
public class controlerModifyProfile extends Test implements  ActionListener {
	
    
	profileModify profile;
    String E_mail ="";
    String password ="";
    String role ="";
    String name ="";
    String lastName ="";
    String id1;
   
    boolean ok=true;

    
    
    public controlerModifyProfile (profileModify profile ) {
    	
    	this.profile=profile;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerModifyProfile(profileModify profile, String id1) {
		// TODO Auto-generated constructor stub
		this.profile=profile;
		this.id1=id1;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	if (id1!=null) {
		
		Routing ro = new Routing(profile,"home");
		ro.actionPerformed(e);
		return ;
	}


	password =profile.password.getText();
    role =profile.role.getText();
    E_mail =profile.E_mail.getText();
    name =profile.name.getText();
    lastName =profile.lastName.getText();
    JFrame frame = new JFrame();
	 frame.setSize(500,200);
	 frame.setLocation(300,150);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setTitle("error");
	 frame.setVisible(true);
	 frame.setLayout(new FlowLayout()); 
	Test test= new Test();
	
	if (test.testIfIsEmpty(name)) {
		
		Label error=new Label("name is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("name is empty");
		
	}
	
	if (test.testIfIsEmpty(lastName)) {
	
		Label error=new Label("lastName is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("mobile is empty");
	}
	
	if (test.testIfIsEmpty(E_mail)) {
		
		Label error=new Label("E_mail is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("E_mail is empty");
	}
	
	if (test.testIfIsEmpty(	role)) {
		
		Label error=new Label("role is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;


		System.out.println("role is empty");
	}
	
	if (test.testIfIsEmpty(	password)) {
		

		Label error=new Label("password is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("password is empty");
	}
	
	if (test.testIfISLeterres(name)==false) {
		
		Label error=new Label("name is not alphabite");
		 error.setForeground(Color.red);
	     frame.add(error); 

	     ok=false;

		System.out.println("name is not alphabite");
	}
	
	if (test.testIfISLeterres(lastName)==false) {
		
		Label error=new Label("lastName is not alphabite");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("mobile is not aplhabite");
	}
	
	if (test.testIfISLeterres(role)==false) {
		
		Label error=new Label("role  is not aplhabite");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("role  is not aplhabite");
	}
	
	if (test.testIfIsNumber(password)==false || password.length()<8) {
		
		Label error=new Label("password  is not numeric");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("role  is not aplhabite");
	}
	
	if (test.testIFIsvalidEmail(E_mail)==false) {
		
		
		Label error=new Label("E_mail not valid");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("role  is not aplhabite");
	}
	

	 if (ok==true) {
	    	
		 Label error=new Label("insert with sucess");
		 error.setForeground(Color.green);
	     frame.add(error);
	     ok=true;
	     profile.name.setText("");
	     profile.E_mail.setText("");
	     profile.password.setText("");
	     profile.role.setText("");
	     profile.lastName.setText("");

	   
	    }
  

	 ok=true;
		   

	}
}