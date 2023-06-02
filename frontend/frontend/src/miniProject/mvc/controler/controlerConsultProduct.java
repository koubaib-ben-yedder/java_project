package miniProject.mvc.controler;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.consultClient;
import miniProject.mvc.view.consultProduct;
import miniProject.mvc.view.createClient;
public class controlerConsultProduct extends Test implements  ActionListener {
	
    
	consultProduct product;
   

    Object id;
    String id1;

    
    
    public controlerConsultProduct (consultProduct product ) {
    	
    	this.product=product;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerConsultProduct(consultProduct product, String id1) {
		// TODO Auto-generated constructor stub
		this.product=product;
		this.id1=id1;
		
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

   if (id1!=null) {
	   Routing ro = new Routing(product,"home");
	   ro.actionPerformed(e);
   }
  
   id=product.id.getSelectedItem();
   product.name.setText("-");
   product.quality.setText("aa");
   product.quantity.setText("aa");
   product.fd.setText("-");
   product.ed.setText("-");
		 
	
		   

	}
}