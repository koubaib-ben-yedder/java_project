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
public class controlerDeleteClient extends Test implements  ActionListener {
	
    
    deleteClient client;
    Object id;
    String id1;

    
    
    public controlerDeleteClient (deleteClient client ) {
    	
    	this.client=client;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerDeleteClient(deleteClient client, String id1) {
		// TODO Auto-generated constructor stub
		this.client=client;
		this.id1=id1;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	if (id1!=null) {
		Routing ro = new Routing(client,id1);
		ro.actionPerformed(e);
	}
	
	/*id = client.id.getSelectedItem();
	System.out.println(id);
  */
	
		 
		 
		   

	}
}