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
import miniProject.mvc.view.createClient;
import miniProject.mvc.view.deleteProvider;
import miniProject.mvc.view.modifyClient;
public class controlerDeleteProvider extends Test implements  ActionListener {
	
    
	deleteProvider provider;
   
    Object id;
    String id1;

    
    
    public controlerDeleteProvider (deleteProvider provider ) {
    	
    	this.provider=provider;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerDeleteProvider(deleteProvider provider, String id1) {
		// TODO Auto-generated constructor stub
		this.provider=provider;
		this.id1=id1;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if (id1!=null) {
		Routing ro = new Routing(provider,id1);
		ro.actionPerformed(e);
	}

	
	/*id =provider.id.getSelectedItem() ;
	System.out.print(id);
    */
    
    

	}
}