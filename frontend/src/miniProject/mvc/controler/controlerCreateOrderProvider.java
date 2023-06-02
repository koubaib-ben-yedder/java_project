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
import miniProject.mvc.view.createOrderProvider;
public class controlerCreateOrderProvider extends Test implements  ActionListener {
	
    
    createOrderProvider createOrderProvider;
    String nameO ="";
    String dateO ="";
    Object id ="";
    String id1;
    String namePR="";
    String quantity="";
    String quality="";
    
    boolean ok=true;

    
    
    public controlerCreateOrderProvider (createOrderProvider createOrderProvider ) {
    	
    	this.createOrderProvider=createOrderProvider;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerCreateOrderProvider(createOrderProvider createOrderProvider, String id1) {
		// TODO Auto-generated constructor stub
		this.createOrderProvider=createOrderProvider;
		this.id1=id1;
		
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
     if (id1!=null) {
				Routing ro = new Routing(createOrderProvider,"home");
				ro.actionPerformed(e);
				return ;
			}
	nameO =createOrderProvider.nameO.getText();
    dateO =createOrderProvider.dateO.getText();
    id =createOrderProvider.id.getSelectedItem();
    namePR=createOrderProvider.namePR.getText();
    quantity=createOrderProvider.quantity.getText();
    quality=createOrderProvider.quality.getText();
    System.out.print(quality);
    
   
    
	Test test= new Test();
    JFrame frame = new JFrame();
	 frame.setSize(500,100);
	 frame.setLocation(300,150);

	 new WindowEvent(createOrderProvider, WindowEvent.WINDOW_CLOSED);
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
	     createOrderProvider.nameO.setText("");
	     createOrderProvider.dateO.setText("");
	     createOrderProvider.id.getSelectedItem();
	     createOrderProvider.namePR.setText("");
	     createOrderProvider.quantity.setText("");
	     createOrderProvider.quality.setText("");
	    System.out.print(quality);
	   
	    }
   

	 ok=true;

	}
}