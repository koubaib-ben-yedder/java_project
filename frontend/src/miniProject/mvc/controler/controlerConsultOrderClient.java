package miniProject.mvc.controler;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.consultOrderClient;
public class controlerConsultOrderClient extends Test implements  ActionListener {
	
    
	consultOrderClient consultOrderClient;
    String name ="";
    String date ;
    String quantity ="";
    String fd ="";
    String ed ;
    String quality ="";
    Object id;
    String id1;


    
    
    public controlerConsultOrderClient (consultOrderClient consultOrderClient ) {
    	
    	this.consultOrderClient=consultOrderClient;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerConsultOrderClient(consultOrderClient consultOrderClient, String id1) {
		// TODO Auto-generated constructor stub
		this.consultOrderClient=consultOrderClient;
		this.id1=id1;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		   System.out.print("----------");

	if (id1!=null) {
		
		Routing ro =new Routing(consultOrderClient, id1);
		ro.actionPerformed(e);
	}
	
    // get data
		
	id =consultOrderClient.id.getSelectedItem() ;

    
    // set data
    
	consultOrderClient.name.setText("--");
	consultOrderClient.date.setText("--");
	consultOrderClient.quantity.setText("--");
	consultOrderClient.quality.setText("--");
	consultOrderClient.fd.setText("--");
	consultOrderClient.ed.setText("--");
	
		 
		   

	}
}