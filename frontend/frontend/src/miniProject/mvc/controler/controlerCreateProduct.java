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
import miniProject.mvc.view.createProduct;
public class controlerCreateProduct extends Test implements  ActionListener {
	
    
	createProduct product;
    String name ="";
    String quantity ="";
    String quality ="";
    String fd ="";
    String ed ="";
    String id;
    boolean ok=true;

    
    public controlerCreateProduct (createProduct product ) {
    	
    	this.product=product;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerCreateProduct(createProduct product, String id) {
		// TODO Auto-generated constructor stub
		this.product=product;
		this.id=id;
		
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	if (id!=null) {
		
		Routing ro = new Routing(product,"home");
		ro.actionPerformed(e);
		return ;
		
	}

	
	name =product.name.getText();
    quality= product.quality.getText();
    quantity= product.quantity.getText();
    fd= product.fd.getText();
    ed= product.ed.getText();
	System.out.println(name);
	System.out.println(quality);
	System.out.println(quantity);
	System.out.println(fd);
	System.out.println(ed);


    JFrame frame = new JFrame();
  	 frame.setSize(500,100);
	 frame.setLocation(300,150);

	 new WindowEvent(product, WindowEvent.WINDOW_CLOSED);
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
	
	if (test.testIfIsEmpty(quality)) {
		

		Label error=new Label("quality is empty");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     
	     ok=false;

		System.out.println("lastName is empty");
	}
	
	if (test.testIfIsEmpty(quantity)) {
	
		

		Label error=new Label("quantity is empty");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     ok=false;



		System.out.println("mobile is empty");
	}
	if (test.testIfIsEmpty(fd)) {
		

		Label error=new Label("date de farication is empty");
		 error.setForeground(Color.red);
	     frame.add(error);  
	     ok=false;

		System.out.println("name is empty");
		
	}
	
	if (test.testIfIsEmpty(ed)) {
		

		Label error=new Label("expiraton de farication is empty");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("lastName is empty");
	}
	
	if (test.testIfISLeterres(name)==false) {
		

		Label error=new Label("name is not alphabite");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("name is not alphabite");
	}
	

	
	if (test.testIfISLeterres(quality)==false) {
		

		Label error=new Label("quality is not alphabite");
		 error.setForeground(Color.red);
	     frame.add(error); 
	     ok=false;

		System.out.println("lastName is not aplhabite");
	}
	


	
		 
	 if (ok==true) {
	    	
		 Label error=new Label("insert with sucess");
		 error.setForeground(Color.green);
	     frame.add(error);
	     ok=true;
	     product.name.setText("");
	     product.quality.setText("");
	     product.quantity.setText("");
	     product.ed.setText("");
	     product.quantity.setText("");
	     product.fd.setText("");
	    System.out.print(quality);
	   
	    }
   

	 ok=true;

		   

	}
}