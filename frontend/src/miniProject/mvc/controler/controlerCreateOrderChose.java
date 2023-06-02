package miniProject.mvc.controler;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.*;
public class controlerCreateOrderChose extends Test implements  ActionListener {
	
    
	createOrderChose createOrderChose;
	String id1;
   

    
    public controlerCreateOrderChose (createOrderChose createOrderChose, String id1 ) {
    	
    	this.createOrderChose=createOrderChose;
    	this.id1=id1;
    	
    }
    
	
	 
	
    
   
   







	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	
		
		Routing ro = new Routing(createOrderChose,id1);
		ro.actionPerformed(e);
		
	}
	
}