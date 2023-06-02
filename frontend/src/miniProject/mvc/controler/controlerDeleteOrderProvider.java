package miniProject.mvc.controler;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.deleteOrderProvider;
public class controlerDeleteOrderProvider extends Test implements  ActionListener {
	
    
	deleteOrderProvider deleteOrderProvider;
    String name ="";
    String lastName ="";
    String mobile ="";
    Object id;
    String id1;
    boolean ok=true;

    
    
    public controlerDeleteOrderProvider (deleteOrderProvider deleteOrderProvider ) {
    	
    	this.deleteOrderProvider=deleteOrderProvider;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerDeleteOrderProvider(deleteOrderProvider deleteOrderProvider, String id1) {
		// TODO Auto-generated constructor stub
		this.deleteOrderProvider=deleteOrderProvider;
		this.id1=id1;
		
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if (id1!=null) {
		 Routing ro = new Routing (deleteOrderProvider,"home");
	     ro.actionPerformed(e);
	}

    
	/*id =order.id.getSelectedItem() ;
	System.out.print(id);
    
    */
    

	}
}