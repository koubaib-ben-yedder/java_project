package miniProject;

import java.io.IOException;
import java.net.http.HttpResponse;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
public class main {

	
	public static void main(String[] args) {
		/*
		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpGet getRequest = new HttpGet(
				"http://localhost:8080/client/get/2	");
			//getRequest.addHeader("accept", "application/json");

			HttpResponse response = (java.net.http.HttpResponse) httpClient.execute(getRequest);

			if (((org.apache.http.HttpResponse) response).getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
				   + ((org.apache.http.HttpResponse) response).getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(
	                         new InputStreamReader((((org.apache.http.HttpResponse) response).getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			httpClient.getConnectionManager().shutdown();

		  } catch (ClientProtocolException e) {
		
			e.printStackTrace();

		  } catch (IOException e) {
		
			e.printStackTrace();
		  }
*/
		

		Home home  = new Home();
		home.main(args);

	}

}
