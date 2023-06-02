package miniProject.mvc.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import miniProject.mvc.routing.Routing;
import miniProject.mvc.view.Home;

public class controlerHome implements ActionListener {
	
	Home home;
	String id;
	
	

	public controlerHome(Home home, String id) {
		this.id=id;
		this.home=home;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
			Routing ro = new Routing(home,id);
			ro.actionPerformed(e);
		
		
	}

}
