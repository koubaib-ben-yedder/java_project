package miniProject.mvc.controler;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.createClient;
import miniProject.mvc.view.createProvider;
public class controlerCreateProvider extends Test implements  ActionListener {
	
    
	createProvider provider;
    String name ="";
    String mobile ="";
    String E_mail ="";
    String id;
    boolean ok=true;

    
    
    public controlerCreateProvider (createProvider provider ) {
    	
    	this.provider=provider;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerCreateProvider(createProvider provider, String id) {
		// TODO Auto-generated constructor stub
		this.provider=provider;
		this.id=id;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if (id!=null) {

		Routing ro = new Routing(provider,"home");
		ro.actionPerformed(e);
		return ;
	}

	name =provider.name.getText();
    mobile =provider.mobile.getText();
    E_mail =provider.E_mail.getText();
    
    JFrame frame = new JFrame();
 	 frame.setSize(500,100);
	 frame.setLocation(300,150);

	 new WindowEvent(provider, WindowEvent.WINDOW_CLOSED);
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
	
	if (test.testIfIsEmpty(mobile)) {

		

		Label error=new Label("name is empty");
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
	
	if (test.testIfISLeterres(name)==false) {
		

		Label error=new Label("name is not alphabite");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     ok=false;

		System.out.println("name is not alphabite");
	}
	
	if (test.testIfIsNumber(mobile)==false) {
		

		Label error=new Label("mobile is not numeric");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     ok=false;

		System.out.println("mobile is not aplhabite");
	}
	
	if (test.testIFIsvalidEmail(E_mail)==false) {
		

		Label error=new Label("E_mail  is not aplhabite");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     ok=false;

		System.out.println("E_mail  is not aplhabite");
	}
	
	 if (ok==true) {
	    	
		 Label error=new Label("insert with sucess");
		 error.setForeground(Color.green);
	     frame.add(error);
	     ok=true;
	     provider.name.setText("");
	     provider.E_mail.setText("");
	     provider.mobile.setText("");
	  
	   
	    }
   

	 ok=true;
		   

	}
}