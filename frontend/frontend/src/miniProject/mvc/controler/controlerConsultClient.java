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
import miniProject.mvc.view.createClient;
public class controlerConsultClient extends Test implements  ActionListener {
	
    
	consultClient client;
    String name ="";
    String lastName ="";
    String mobile ="";
    Object id;
    String id1;
    boolean ok=true;

    
    
    public controlerConsultClient (consultClient client ) {
    	
    	this.client=client;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerConsultClient(consultClient client, String id1) {
		// TODO Auto-generated constructor stub
		this.client=client;
		this.id1=id1;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
  
	if (id1!=null ) {

		    	Routing ro = new Routing(client,id1);
				ro.actionPerformed(e);
	}  
	
	

    client.name.setText("aa");
    client.lastName.setText("aa");;
    client.mobile.setText("aa");;
		 
		 
   

	}
}