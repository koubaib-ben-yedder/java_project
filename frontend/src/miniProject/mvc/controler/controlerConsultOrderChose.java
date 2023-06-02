package miniProject.mvc.controler;

import java.awt.event.ActionEvent;
import miniProject.mvc.view.consultOrderChose;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.routing.*;
public class controlerConsultOrderChose extends Test implements  ActionListener {
	
    
	consultOrderChose consultOrderChose;
	String id;
 

    
    
    public controlerConsultOrderChose (consultOrderChose consultOrderChose,String id ) {
    	
    	this.consultOrderChose=consultOrderChose;
    	this.id=id;
    	
    }
    
	
	 
	
    
   
   
 
	








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	System.out.println(id);
	Routing r = new Routing (consultOrderChose,id);
	r.actionPerformed(e);
  
		 
		 
   

	}

















	
}