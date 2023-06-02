package miniProject.mvc.controler;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.createClient;
import miniProject.mvc.view.deleteClient;
import miniProject.mvc.view.deleteProduct;
public class controlerDeleteProduct extends Test implements  ActionListener {
	
    
	deleteProduct product;
    Object id;
    String id1;

    
    
    public controlerDeleteProduct (deleteProduct product ) {
    	
    	this.product=product;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerDeleteProduct(deleteProduct product, String id1) {
		// TODO Auto-generated constructor stub
		this.product=product;
		this.id1=id1;
		
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if (id1!=null) {
		Routing ro =new Routing(product,id1);
		ro.actionPerformed(e);
	}

	
	/*id = product.id.getSelectedItem();
	System.out.println(id);
  */
	
		 
		 
		   

	}
}