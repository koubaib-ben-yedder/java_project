package miniProject;

import org.springframework.beans.factory.annotation.Autowired;

import com.buisness.manageclient;
import com.buisness.manageorder;
import com.buisness.manageorderclient;
import com.buisness.manageorderme;
import com.buisness.manageproduct;
import com.buisness.manageproductorderclient;
import com.buisness.manageproductorderme;
import com.buisness.manageprovider;
import com.buisness.manageproviderorderme;
import com.buisness.manageproviderproduct;
import com.entity.client;
import com.example.demo.Demo1Application;

import miniProject.mvc.view.Home;
public class main {

	
	public static void main(String[] args) {
		

		Home home  = new Home();
		home.main(args);

	}

}
