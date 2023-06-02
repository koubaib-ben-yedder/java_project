package miniProject.mvc.test;

import java.util.ArrayList;
import java.util.regex.Pattern;

public  class Test {
	

	public Test() {
		
	}
	
	public boolean testIfISLeterres(String st) {
		
		  boolean ok=false;
		  
		  String letters="azertyuiopqsdfghjklmwxcvnAZERTYUIOPQSDFGHJKLMWXCVBN";
		
		 
		   for (int i=0;i<st.length()  ;i++) {
			   
			   for (int j=0;j<letters.length()  ;j++) {
				   
				   if (st.charAt(i)==letters.charAt(j)) {
					   
					   
					 
					   ok=true;
					   
					   
					

					   break;
				   }
				   
				 
				   
			   }
						   
					   } 
				   
			
			
		   return ok;
		
		
		
	}
	
	public boolean testIfIsEmpty (String st) {
		
	  return st.toString().isEmpty();
		
	}
	

	
	public boolean testIfISSpecialCaractere (String st) {
		
		  String sp ="~`!@#$%^&*()-_+={}[]|/:;`<>,.?";
		 
		   
		   
		   boolean ok =false;
		   for (int i=0;i<st.length()  ;i++) {
			   
			   for (int j=0;j<sp.length()  ;j++) {
				   
				   if (st.charAt(i)==sp.charAt(j)) {
					   
					   
					 
					   ok=true;
					   
					   
					

					   break;
				   }
				   
				  
				 
				   
			   }
						   
					   } 
				   
			
		   
		return ok;

		
		
	}
	

	public boolean testIfIsNumber (String st) {
		
		   String np ="1234567890";
		   
		   boolean ok=false;
		   
		   for (int i=0;i<st.length()  ;i++) {
			   
			   for (int j=0;j<np.length()  ;j++) {
				   
				   if (st.charAt(i)==np.charAt(j)) {
					   
					   
					 
					   ok=true;
					   
					   
					

					   break;
				   }
				   
				 				 
				   
			   }
						   
					   } 
		   
		   return ok;
		}
	
	public boolean testIFIsvalidEmail (String st) {
		
		boolean ok=true;
		System.out.println(st.indexOf("@"));
		System.out.println(st.substring(st.indexOf(".")+1,st.length()));

		if (st.indexOf("@")==-1 || st.indexOf(".")==-1 ) {
			
			return false;
		}
		
	
		System.out.println("-");

			if (testIfIsNumber(st.substring(st.indexOf(".")+1,st.length()))) {
				
				return false;
				
				
				
				
			}
			return true;
		
		
	}
	
	
}