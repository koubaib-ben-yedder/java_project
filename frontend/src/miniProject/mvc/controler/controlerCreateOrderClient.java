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
import miniProject.mvc.view.createOrderChose;
import miniProject.mvc.view.createOrderClient;
public class controlerCreateOrderClient extends Test implements  ActionListener {
	
    
    createOrderClient createOrderClient;
    String nameO ="";
    String dateO ="";
    Object id ="";
    String id1;
    String namePR="";
    String quantity="";
    String quality="";
    
    boolean ok=true;

    
    
    public controlerCreateOrderClient (createOrderClient createOrderClient ) {
    	
    	this.createOrderClient=createOrderClient;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerCreateOrderClient (createOrderClient createOrderClient, String id1) {
		// TODO Auto-generated constructor stub
		this.createOrderClient=createOrderClient;
		this.id1=id1;
		
	}
















	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
     if (id1!=null) {
				Routing ro = new Routing(createOrderClient,id1);
				ro.actionPerformed(e);
				return ;
			}
	nameO =createOrderClient.nameO.getText();
    dateO =createOrderClient.dateO.getText();
    id =createOrderClient.id.getSelectedItem();
    namePR=createOrderClient.namePR.getText();
    quantity=createOrderClient.quantity.getText();
    quality=createOrderClient.quality.getText();
    System.out.print(quality);
    
   
    
	Test test= new Test();
    JFrame frame = new JFrame();
	 frame.setSize(500,100);
	 frame.setLocation(300,150);

	 new WindowEvent(createOrderClient, WindowEvent.WINDOW_CLOSED);
	 frame.setTitle("error");
	 frame.setVisible(true);
	 frame.setLayout(new FlowLayout());  
	if (test.testIfIsEmpty(nameO)) {
		

		 Label error=new Label("name is empty");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     ok=false;
	     
	     
		
	}
	
	if (test.testIfIsEmpty(dateO)) {
		

		 Label error=new Label("date  is empty");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     
	     ok=false;

	}
	
	if (test.testIfIsEmpty(namePR)) {
		
		

		 Label error=new Label("name product is empty");
		 error.setForeground(Color.red);
	     frame.add(error);
	     ok=false;

	}
	
	if (test.testIfIsEmpty(quantity)) {
		

		Label error=new Label("quantity is empty");
		 error.setForeground(Color.red);
	     frame.add(error);
	     ok=false;

	}
	
	if (test.testIfIsEmpty(quality)) {
		

		Label error=new Label("quality is empty");
		 error.setForeground(Color.red);
	     frame.add(error);
	     ok=false;

	}
	
	if (test.testIfISLeterres(nameO)==false) {
		

		Label error=new Label("name  is not alphabite");
		 error.setForeground(Color.red);
	     frame.add(error);
	     ok=false;

	}
	
	if (test.testIfISLeterres(namePR)==false) {
		

		Label error=new Label("name product is not aplhabite");
		 error.setForeground(Color.red);
	     frame.add(error);
	     ok=false;


	}
	

	if (test.testIfISLeterres(quality)==false) {
		

		Label error=new Label("quality  is not aplhabite");
		 error.setForeground(Color.red);
	     frame.add(error);
	     ok=false;

	}
	

	System.out.print(ok);
	 if (ok==true) {
	    	
		 Label error=new Label("insert with sucess");
		 error.setForeground(Color.green);
	     frame.add(error);
	     ok=true;
	     createOrderClient.nameO.setText("");
	     createOrderClient.dateO.setText("");
	     createOrderClient.id.getSelectedItem();
	     createOrderClient.namePR.setText("");
	     createOrderClient.quantity.setText("");
	     createOrderClient.quality.setText("");
	    System.out.print(quality);
	   
	    }
   

	 ok=true;

	}
}