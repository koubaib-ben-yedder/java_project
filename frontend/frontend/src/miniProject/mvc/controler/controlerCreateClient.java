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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.createClient;
public class controlerCreateClient extends Test implements  ActionListener {
	
    
    createClient client;
    String name ="";
    String lastName ="";
    String mobile ="";
    String id;
    int i=0;
    boolean ok=true;
    
    
    public controlerCreateClient (createClient client ) {
    	
    	this.client=client;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerCreateClient(createClient client, String id) {
		// TODO Auto-generated constructor stub
		this.client=client;
		this.id=id;
		
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if (id!=null) {
		Routing ro = new Routing(client,id);
		ro.actionPerformed(e);
		return ;
	}
	
	
	name =client.name.getText();
    lastName =client.lastName.getText();
    mobile =client.mobile.getText();
    JFrame frame = new JFrame();
	 frame.setSize(500,100);
	 frame.setLocation(300,150);

	 new WindowEvent(client, WindowEvent.WINDOW_CLOSED);
	 frame.setTitle("error");
	 frame.setVisible(true);
	 frame.setLayout(new FlowLayout()); 
	
	Test test= new Test();
	
	if (test.testIfIsEmpty(name)) {
		
		 
		 
		 Label error=new Label("name is empty");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     
	     ok=false;


	}
	
	if (test.testIfIsEmpty(lastName)) {
	
		 Label error=new Label("lastName is empty");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     
	     ok=false;

	}
	
	if (test.testIfIsEmpty(mobile)) {
		
		 Label error=new Label("mobile is empty");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     ok=false;

	}
	
	if (test.testIfISLeterres(name)==false) {
		
		 Label error=new Label("name is not alphabite");
		 error.setForeground(Color.red);
	     frame.add(error);  

	}
	
	if (test.testIfISLeterres(lastName)==false) {
		
		 Label error=new Label("lastName is not aplhabite");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     ok=false;


	}
	
	if (test.testIfIsNumber(mobile)==false) {
		
		 Label error=new Label("mobile  is not aplhabite");
		 error.setForeground(Color.red);
	     frame.add(error);
	     ok=false;


	}
	

	 if (ok==true) {
	    	
		 Label error=new Label("insert with sucess");
		 error.setForeground(Color.green);
	     frame.add(error);
	     ok=true;
	 	 client.name.setText("");
	     client.lastName.setText("");
	     client.mobile.setText("");	    
	   
	    }
   ok=true;


	}
}