package miniProject.mvc.controler;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.*;
public class controlerDeleteOrderChose extends Test implements  ActionListener {
	
    
	deleteOrderChose deleteOrderChose;
   
    String id1;
    

    
    
  
	
    
   
   
 
	public controlerDeleteOrderChose(deleteOrderChose deleteOrderChose, String id1) {
		// TODO Auto-generated constructor stub
		this.deleteOrderChose=deleteOrderChose;
		this.id1=id1;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
  


		    	Routing ro = new Routing(deleteOrderChose,id1);
				ro.actionPerformed(e);
	
	
	}

}