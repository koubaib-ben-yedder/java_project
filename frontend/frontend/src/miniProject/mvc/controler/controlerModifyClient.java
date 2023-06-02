package miniProject.mvc.controler;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.createClient;
import miniProject.mvc.view.modifyClient;
public class controlerModifyClient extends Test implements  ActionListener {
	
    
	modifyClient client;
    String name ="";
    String lastName ="";
    String mobile ="";
    Object id;
    String id1;
    boolean ok=true;

    
    
    public controlerModifyClient (modifyClient client ) {
    	
    	this.client=client;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerModifyClient(modifyClient client, String id1) {
		// TODO Auto-generated constructor stub
		this.client=client;
		this.id1=id1;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if (id1!=null) {
		Routing ro = new Routing(client,id1);
		ro.actionPerformed(e);
		return ;
	}

	
	name =client.name.getText();
	id =client.id.getSelectedItem() ;
    lastName =client.lastName.getText();
    mobile =client.mobile.getText();
    JFrame frame = new JFrame();
	 frame.setSize(500,100);
	 frame.setLocation(300,150);

	 new WindowEvent(client, WindowEvent.WINDOW_CLOSED);
	 frame.setTitle("error");
	 frame.setVisible(true);
	 frame.setLayout(new FlowLayout()); 
    System.out.println(id);
  
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

		System.out.println("lastName is empty");
	}
	
	if (test.testIfIsEmpty(mobile)) {
		
		Label error=new Label("mobile is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("mobile is empty");
	}
	
	if (test.testIfISLeterres(name)==false) {
		
		Label error=new Label("name is not alphabite");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("name is not alphabite");
	}
	
	if (test.testIfISLeterres(lastName)==false) {
		
		Label error=new Label("lastName is not aplhabite");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("lastName is not aplhabite");
	}
	
	if (test.testIfIsNumber(mobile)==false) {
		
		Label error=new Label("mobile  is not numeric");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("mobile  is not numeric");
	}
	
	 if (ok==true) {
	    	
		 Label error=new Label("update with sucess");
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