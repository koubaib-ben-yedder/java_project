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
import javax.swing.text.JTextComponent;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.createClient;

import miniProject.mvc.view.modifyOrderProvider;
public class controlerModifyOrderProvider extends Test implements  ActionListener {
	
    
    modifyOrderProvider orderProvider;
    String nameO ="";
    String dateO ="";
    Object order_id ="";
    Object product_id ="";
    String namePR="";
    String quantity="";
    String quality="";
    String id1;
    
    boolean ok=true;

    
    
    public controlerModifyOrderProvider (modifyOrderProvider orderProvider ) {
    	
    	this.orderProvider=orderProvider;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerModifyOrderProvider(modifyOrderProvider orderProvider, String id1) {
		// TODO Auto-generated constructor stub
		this.orderProvider=orderProvider;
		this.id1=id1;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if (id1!=null) {
		Routing ro = new Routing(orderProvider,"home");
		ro.actionPerformed(e);
		return ;

	}
	
	nameO =orderProvider.nameO.getText();
    dateO =orderProvider.dateO.getText();
    order_id =orderProvider.order_id.getSelectedItem();
    product_id =orderProvider.product_id.getSelectedItem();
    namePR=orderProvider.namePR.getText();
    quantity=orderProvider.quality.getText();
    quality=orderProvider.quality.getText();
    JFrame frame = new JFrame();
  	 frame.setSize(500,100);
	 frame.setLocation(300,150);

	 new WindowEvent(orderProvider, WindowEvent.WINDOW_CLOSED);
  	 frame.setTitle("error");
  	 frame.setVisible(true);
  	 frame.setLayout(new FlowLayout()); 
	Test test= new Test();
	
	if (test.testIfIsEmpty(nameO)) {
		
		Label error=new Label("name is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("name order is empty");
		
	}
	
	if (test.testIfIsEmpty(dateO)) {
	
		Label error=new Label("date is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("date of order is empty");
	}
	
	if (test.testIfIsEmpty(namePR)) {
		
		Label error=new Label("name product is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("name product is empty");
	}
	
	if (test.testIfIsEmpty(quantity)) {
		
		Label error=new Label("quantity  is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("quantity is empty");
	}
	
	if (test.testIfIsEmpty(quality)) {
		
		Label error=new Label("quality  is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("quality is empty");
	}
	
	if (test.testIfISLeterres(nameO)==false) {
		
		Label error=new Label("name order  is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("name order is not alphabite");
	}
	
	if (test.testIfISLeterres(namePR)==false) {
		
		Label error=new Label("name product is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("name product is not aplhabite");
	}
	
	if (test.testIfISLeterres(quantity)==false) {
		
		
		Label error=new Label("quantity product is empty");
		 error.setForeground(Color.red);
	     frame.add(error);
	     ok=false;

		System.out.println("quantity  is not aplhabite");
	}
	
	
	
	 if (ok==true) {
	    	
		 Label error=new Label("update with sucess");
		 error.setForeground(Color.green);
	     frame.add(error);
	     ok=true;
	     orderProvider.nameO.setText("");
	     orderProvider.dateO.setText("");
	     orderProvider.namePR.setText("");
	     orderProvider.quality.setText("");
	     orderProvider.quantity.setText("");

	   
	    }
   

	 ok=true;

		 
		   

	}
}