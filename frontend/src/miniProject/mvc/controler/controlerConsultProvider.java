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
import miniProject.mvc.view.consultProvider;
import miniProject.mvc.view.createClient;
public class controlerConsultProvider extends Test implements  ActionListener {
	
    
	consultProvider provider;
   
	String id1;
    Object id;

    
    
    public controlerConsultProvider (consultProvider provider ) {
    	
    	this.provider=provider;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerConsultProvider(consultProvider provider, String id1) {
		// TODO Auto-generated constructor stub
		this.provider=provider;
		this.id1=id1;
		
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	if (id1!=null) {
		Routing ro =new Routing(provider, id1);
		ro.actionPerformed(e);
	}

   id=provider.id.getSelectedItem();
   provider.name.setText("-");
   provider.mobile.setText("aa");
   provider.E_mail.setText("aa");
 
		
		 
		   

	}
}