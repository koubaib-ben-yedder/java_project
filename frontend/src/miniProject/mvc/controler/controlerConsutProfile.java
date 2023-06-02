package miniProject.mvc.controler;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.test.Test;

import miniProject.mvc.view.profileConsult;
public class controlerConsutProfile extends Test implements  ActionListener {
	
    
	profileConsult profile;
    String name ="";
    String mobile ="";
    String E_mail ="";
    String role="";
    String password="";
    String id1;
    boolean ok=true;

    
    
    public controlerConsutProfile (profileConsult profile ) {
    	
    	this.profile=profile;
    	
    }
    
	
	 
	
    
   
   
 
	public controlerConsutProfile(profileConsult profile, String id1) {
		// TODO Auto-generated constructor stub
		this.profile=profile;
		this.id1=id1;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	if (id1!=null) {
		Routing ro = new Routing(profile,"home");
		ro.actionPerformed(e);
	}

	/*name =profile.name.getText();
	role=profile.role.getText();
    mobile =profile.password.getText();
    E_mail =profile.E_mail.getText();
    password=profile.password.getText();
  
    profile.password.setText("-");
    profile.E_mail.setText("-");
    profile.role.setText("-");
    profile.name.setText("-");

	*/
	}
}