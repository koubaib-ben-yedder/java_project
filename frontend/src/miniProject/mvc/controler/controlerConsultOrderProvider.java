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
import miniProject.mvc.view.consultOrderProvider;
public class controlerConsultOrderProvider extends Test implements  ActionListener {
	
    
	consultOrderProvider consultOrderProvider;
    String name ="";
    String date ;
    String quantity ="";
    String fd ="";
    String ed ;
    String quality ="";
    Object id;
    String id1;


    
    
    public controlerConsultOrderProvider (consultOrderProvider consultOrderProvider ) {
    	
    	this.consultOrderProvider=consultOrderProvider;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerConsultOrderProvider(consultOrderProvider consultOrderProvider, String id1) {
		// TODO Auto-generated constructor stub
		this.consultOrderProvider=consultOrderProvider;
		this.id1=id1;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		   System.out.print("----------");

	if (id1!=null) {
		
		Routing ro =new Routing(consultOrderProvider, id1);
		ro.actionPerformed(e);
	}
	
    // get data
		
	id =consultOrderProvider.id.getSelectedItem() ;

    
    // set data
    
	consultOrderProvider.name.setText("--");
	consultOrderProvider.date.setText("--");
	consultOrderProvider.quantity.setText("--");
	consultOrderProvider.quality.setText("--");
	consultOrderProvider.fd.setText("--");
	consultOrderProvider.ed.setText("--");
	
		 
		   

	}
}