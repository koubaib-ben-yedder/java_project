package miniProject.mvc.controler;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;
import miniProject.mvc.view.*;
public class controlerModifyOrderChose extends Test implements  ActionListener {
	
	
	modifyOrderChose modifyOrderChose;
    
    String id1;

    
    
    public controlerModifyOrderChose (modifyOrderChose modifyOrderChose, String id1 ) {
    	
    	this.modifyOrderChose=modifyOrderChose;
    	this.id1=id1;
    	
    }
    
	
	 
	
    
   














	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		Routing ro = new Routing(modifyOrderChose,id1);
		ro.actionPerformed(e);
	
	}
	
}
	