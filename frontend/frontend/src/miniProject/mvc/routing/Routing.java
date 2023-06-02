package miniProject.mvc.routing;

import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import miniProject.mvc.controler.controlerConsultClient;
import miniProject.mvc.controler.controlerInscription;
import miniProject.mvc.controler.controlerlogin;
import miniProject.mvc.view.Home;
import miniProject.mvc.view.Login;
import miniProject.mvc.view.consultClient;
import miniProject.mvc.view.consultOrderClient;
import miniProject.mvc.view.consultOrderProvider;
import miniProject.mvc.view.consultProduct;
import miniProject.mvc.view.consultProvider;
import miniProject.mvc.view.createClient;
import miniProject.mvc.view.createOrderChose;
import miniProject.mvc.view.createOrderClient;
import miniProject.mvc.view.createOrderProvider;

import miniProject.mvc.view.createProduct;
import miniProject.mvc.view.createProvider;
import miniProject.mvc.view.deleteClient;
import miniProject.mvc.view.deleteOrderClient;
import miniProject.mvc.view.deleteOrderProvider;

import miniProject.mvc.view.deleteProduct;
import miniProject.mvc.view.deleteProvider;
import miniProject.mvc.view.inscription;
import miniProject.mvc.view.modifyClient;
import miniProject.mvc.view.modifyOrderClient;
import miniProject.mvc.view.modifyOrderProvider;

import miniProject.mvc.view.modifyProduct;
import miniProject.mvc.view.modifyProvider;
import miniProject.mvc.view.profileConsult;
import miniProject.mvc.view.profileModify;

import miniProject.mvc.view.deleteOrderChose;
import miniProject.mvc.view.modifyOrderChose;
import miniProject.mvc.view.consultOrderChose;

public class Routing implements ActionListener {
	
	Home home;
	String id1;

	private Login login;
	private inscription inscription;
 	private consultClient consultClient;
	private consultOrderClient consultOrderClient;
	private consultOrderProvider consultOrderProvider;
	private consultProduct consultProduct;
	private consultProvider consultProvider;
	private createClient createClient;
	private createOrderClient createOrderClient;
	private createOrderProvider createOrderProvider;
	private createProduct createProduct;
	private deleteClient deleteClient;
	private deleteOrderClient deleteOrderClient;
	private deleteOrderProvider deleteOrderProvider;
	private createOrderChose createOrderChose;
	private deleteOrderChose deleteOrderChose;
	private modifyOrderChose modifyOrderChose;
	private consultOrderChose consultOrderChose;

	private deleteProduct deleteProduct;
	private deleteProvider deleteProvider;
	private modifyClient modifyClient;
	private modifyOrderClient modifyOrderClient;
	private modifyOrderProvider modifyOrderProvider;
	private modifyProduct modifyProduct;
	private modifyProvider modifyProvider;
	private profileConsult profileConsult ;
	private profileModify profileModify;
	private createProvider  createProvider;
	
	
	public Routing (modifyOrderProvider modifyOrderProvider,String id1) {
		// TODO Auto-generated constructor stub
		this.modifyOrderProvider=modifyOrderProvider;
		this.id1=id1;
		
	}
	
	public Routing (modifyOrderChose modifyOrderChose,String id1) {
		// TODO Auto-generated constructor stub
		this.modifyOrderChose=modifyOrderChose;
		this.id1=id1;
		
	}
	


	public Routing (Home home,String id1) {
		// TODO Auto-generated constructor stub
		this.home=home;
		this.id1=id1;
		
	}



	public Routing(Login login, String id1) {
		// TODO Auto-generated constructor stub
		this.login=login;
		this.id1=id1;
	}

	

	public Routing(inscription inscription, String id1) {
		// TODO Auto-generated constructor stub
		this.inscription=inscription;
		this.id1=id1;
	}
	

	public Routing(consultClient consultClient, String id1) {
		// TODO Auto-generated constructor stub
		this.consultClient=consultClient;
		this.id1=id1;
	}

	public Routing(consultOrderClient consultOrderClient, String id1) {
		// TODO Auto-generated constructor stub
		this.consultOrderClient=consultOrderClient;
		this.id1=id1;
	}

	public Routing(consultOrderProvider consultOrderProvider, String id1) {
		// TODO Auto-generated constructor stub
		this.consultOrderProvider=consultOrderProvider;
		this.id1=id1;
	}

	public Routing(consultProduct consultProduct, String id1) {
		// TODO Auto-generated constructor stub
		this.consultProduct=consultProduct;
		this.id1=id1;
	}
	
	public Routing(consultProvider consultProvider, String id1) {
		// TODO Auto-generated constructor stub
		this.consultProvider=consultProvider;
		this.id1=id1;
	}

	public Routing(createClient createClient, String id1) {
		// TODO Auto-generated constructor stub
		this.createClient=createClient;
		this.id1=id1;
	}
	
	public Routing(createOrderProvider createOrderProvider, String id1) {
		// TODO Auto-generated constructor stub
		this.createOrderProvider=createOrderProvider;
		this.id1=id1;
	}
	
	public Routing(createOrderClient createOrderClient, String id1) {
		// TODO Auto-generated constructor stub
		this.createOrderClient=createOrderClient;
		this.id1=id1;
	}
	
	public Routing(createProduct createProduct, String id1) {
		// TODO Auto-generated constructor stub
		this.createProduct=createProduct;
		this.id1=id1;
	}
	
	public Routing(deleteClient deleteClient, String id1) {
		// TODO Auto-generated constructor stub
		this.deleteClient=deleteClient;
		this.id1=id1;
	}
	public Routing(createProvider createProvider, String id1) {
		// TODO Auto-generated constructor stub
		this.createProvider=createProvider;
		this.id1=id1;
	}
	public Routing(deleteOrderClient deleteOrderClient, String id1) {
		// TODO Auto-generated constructor stub
		this.deleteOrderClient=deleteOrderClient;
		this.id1=id1;
	}
	
	public Routing(deleteOrderProvider deleteOrderProvider, String id1) {
		// TODO Auto-generated constructor stub
		this.deleteOrderProvider=deleteOrderProvider;
		this.id1=id1;
	}
	
	public Routing(deleteProduct deleteProduct, String id1) {
		// TODO Auto-generated constructor stub
		this.deleteProduct=deleteProduct;
		this.id1=id1;
	}
	public Routing(modifyClient modifyClient, String id1) {
		// TODO Auto-generated constructor stub
		this.modifyClient=modifyClient;
		this.id1=id1;
	}
	
	public Routing(modifyOrderClient modifyOrderClient, String id1) {
		// TODO Auto-generated constructor stub
		this.modifyOrderClient=modifyOrderClient;
		this.id1=id1;
	}
	public Routing(modifyProduct modifyProduct, String id1) {
		// TODO Auto-generated constructor stub
		this.modifyProduct=modifyProduct;
		this.id1=id1;
	}

	public Routing(modifyProvider modifyProvider, String id1) {
		// TODO Auto-generated constructor stub
		this.modifyProvider=modifyProvider;
		this.id1=id1;
	}
	
	public Routing(profileConsult profileConsult, String id1) {
		// TODO Auto-generated constructor stub
		this.profileConsult=profileConsult;
		this.id1=id1;
	}
	
	public Routing(profileModify profileModify, String id1) {
		// TODO Auto-generated constructor stub
		this.profileModify=profileModify;
		this.id1=id1;
	}
	

	public Routing(deleteProvider provider, String id1) {
		// TODO Auto-generated constructor stub
		this.deleteProvider=deleteProvider;
		this.id1=id1;
	}



	public Routing(consultOrderChose consultOrderChose, String id1) {
		// TODO Auto-generated constructor stub
		this.consultOrderChose=consultOrderChose;
		this.id1=id1;
	}



	public Routing(createOrderChose createOrderChose, String id1) {
		// TODO Auto-generated constructor stub
		this.createOrderChose=createOrderChose;
		this.id1=id1;
	}



	public Routing(deleteOrderChose deleteOrderChose, String id1) {
		// TODO Auto-generated constructor stub
		this.deleteOrderChose=deleteOrderChose;
		this.id1=id1;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("2"+id1);
		
		   System.out.println("3"+id1);
		switch (id1) {
		 
		case "modify profile":
			home.dispose();
			profileModify pM = new profileModify();
			pM.setVisible(true);
			pM.setTitle("modify profile");
			pM.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			break;
         
		case "delete profile":
			home.dispose();
			break;
		case "modify product":
			home.dispose();
			modifyProduct mp = new modifyProduct();
			mp.setVisible(true);
			mp.setTitle("modify product");
			mp.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			break;
		case "create product":
			home.dispose();
			createProduct cP= new createProduct();
			cP.setVisible(true);
			cP.setTitle("create product");
			cP.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			break;
		case "consult product":
			home.dispose();
			consultProduct cp= new consultProduct();
			cp.setVisible(true);
			cp.setTitle("consult product");
			cp.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			break;
		case "delete product":
			home.dispose();
			deleteProduct dP= new deleteProduct();
			dP.setVisible(true);
			dP.setTitle("delete product");
			dP.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			break;
		case "modify order client":
			modifyOrderChose.dispose();
			modifyOrderClient mPc = new modifyOrderClient();
			mPc.setVisible(true);
			mPc.setTitle("modify order client");
			mPc.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "modify order provider":
			modifyOrderChose.dispose();
			createOrderProvider cOp = new createOrderProvider();
			cOp.setVisible(true);
			cOp.setTitle("modify order provider");
			cOp.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "create order client":
			createOrderChose.dispose();
			createOrderClient cOc= new createOrderClient();
			cOc.setVisible(true);
			cOc.setTitle("create order provider");
			cOc.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "consult order client":
			consultOrderChose.dispose();
			consultOrderClient coc = new consultOrderClient();
			coc.setVisible(true);
			coc.setTitle("consult order");
			coc.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "consult order provider":
			consultOrderChose.dispose();
			consultOrderProvider cop = new consultOrderProvider();
			cop.setVisible(true);
			cop.setTitle("consult order");
			cop.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "delete order client":
			deleteOrderChose.dispose();
			deleteOrderClient dOc= new deleteOrderClient();
			dOc.setVisible(true);
			dOc.setTitle("delete order client");
			dOc.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "delete order provider":
			deleteOrderChose.dispose();
			deleteOrderProvider dOp= new deleteOrderProvider();
			dOp.setVisible(true);
			dOp.setTitle("delete order provider");
			dOp.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "create client":
			home.dispose();
			createClient cC= new createClient();
			cC.setVisible(true);
			cC.setTitle("create client");
			cC.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "modify client":
			home.dispose();
			modifyClient mC= new modifyClient();
			mC.setVisible(true);
			mC.setTitle("modify client");
			mC.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;

		case "consult client":
			home.dispose();
			consultClient cc= new consultClient();
			cc.setVisible(true);
			cc.setTitle("consut client");
			cc.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "delete client":
			home.dispose();
			deleteClient ccl= new deleteClient();
			ccl.setVisible(true);
			ccl.setTitle("delete client");
			ccl.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "create provider":
			home.dispose();
			createProvider cpr= new createProvider();
			cpr.setVisible(true);
			cpr.setTitle("create provider");
			cpr.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "modify provider":
			home.dispose();
			modifyProvider mpr= new modifyProvider();
			mpr.setVisible(true);
			mpr.setTitle("modify provider");
			mpr.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "consult provider":
			home.dispose();
			consultProvider cpro= new consultProvider();
			cpro.setVisible(true);
			cpro.setTitle("consult provider");
			cpro.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "delete provider":
			home.dispose();
			deleteProvider dp= new deleteProvider();
			dp.setVisible(true);
			dp.setTitle("delete provider");
			dp.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "inscription":
			login.dispose();
			inscription in = new inscription();
			in.setVisible(true);
			in.setTitle("inscription");
			in.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case "create order":
			home.dispose();
			createOrderChose cOC = new createOrderChose();
			cOC.setTitle("create order chose");
			
	        cOC.setPreferredSize(new Dimension(300,200));
            cOC.pack();
            cOC.setLocationRelativeTo(null);
            cOC.setVisible(true);
            
			break;
		case "delete order":
			home.dispose();
			deleteOrderChose dOC = new deleteOrderChose();
			dOC.setTitle("delete order chose");
			dOC.setPreferredSize(new Dimension(300,200));
			dOC.pack();
			dOC.setLocationRelativeTo(null);
			dOC.setVisible(true);
			
			break;
		case "modify order":
			home.dispose();
			modifyOrderChose mOC = new modifyOrderChose();
			
			mOC.setTitle("modify order chose");
			mOC.setPreferredSize(new Dimension(300,200));
			mOC.pack();
			mOC.setLocationRelativeTo(null);
			mOC.setVisible(true);
			
			break;
		case "consult order":
			home.dispose();
			consultOrderChose COC = new consultOrderChose();
		
			COC.setTitle("consult order chose");
			COC.setPreferredSize(new Dimension(300,200));
			COC.pack();
			COC.setLocationRelativeTo(null);
			COC.setVisible(true);
			
			break;
	    case "login":
	    	
	    	if (home!=null) {
	    		
	    		home.dispose();
				Login l = new Login();
				l.setVisible(true);
				l.setTitle("login");
				l.setExtendedState(JFrame.MAXIMIZED_BOTH);
				break;
	    	}
	    	
	    	
	    	inscription.dispose();
			Login l = new Login();
			l.setVisible(true);
			l.setTitle("login");
			l.setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
				
	   case "home":
		   System.out.print("----------");
		   
		   if (createOrderChose!=null) {
			   createOrderChose.dispose();
				
		    }
		   
		   if (deleteOrderChose!=null) {
			   deleteOrderChose.dispose();
				
		    }
		   
		   if (modifyOrderChose!=null) {
			   modifyOrderChose.dispose();
				
		    }
		   
		   if (consultOrderChose!=null) {
			   consultOrderChose.dispose();
				
		    }
		    
		    if (login!=null) {
		    	login.dispose();
				
		    }
		    
		    if (inscription!= null) {
		    	inscription.dispose();
			
		    }
		    
		    if (consultClient!=null) {
		    	consultClient.dispose();
				
		    }
		   
		    if (consultOrderClient!=null) {
		    	consultOrderClient.dispose();
				
		    }
		    
		    if (consultOrderProvider!=null) {
		    	consultOrderProvider.dispose();
				
		    }
		    
		    if (consultProduct!=null) {
		    	consultProduct.dispose();
				
		    }
		    if (consultProvider!=null) {
		    	consultProvider.dispose();
			
		    }
		    
		    if (createClient!=null) {
		    	
		    	createClient.dispose();
				
		    }
		    
		    if (createOrderClient!=null) {
		    	createOrderClient.dispose();
		    }
		    
		    if (createOrderProvider!=null) {
		    	createOrderProvider.dispose();
		    }
		    
		    if (createProduct!=null) {
		    	createProduct.dispose();
				
		    }
		    
		    if (createProvider!=null) {
		    	createProvider.dispose();
			
		    }
		    
		    if  (deleteClient!=null) {
		    	deleteClient.dispose();
				
		    }
		    
		    if (deleteOrderClient!=null) {
		    	deleteOrderClient.dispose();
				
		    }
		    
		    if (deleteProduct!=null) {
		    	deleteProduct.dispose();
				
		    }
		    
		    if (deleteProvider!=null) {
		    	
		    	deleteProvider.dispose();
			
				
		    }
		    
		    if (modifyClient!=null) {
		    	modifyClient.dispose();
			
				
		    }
		    
		    if (modifyOrderClient!=null) {
		    	
		    	modifyOrderClient.dispose();
			
			
		    }
		    
		    
		    if (modifyOrderProvider!=null) {
		    	
		    	modifyOrderProvider.dispose();
			
			
		    }
		    
		    if (modifyProduct!=null) {
		    	
		    	modifyProduct.dispose();
				
			
		    }
		    
		    if (modifyProvider!=null) {
		    	
		    	modifyProvider.dispose();
				
			
		    }
		    
		    if (profileConsult!=null) {
		    	profileConsult.dispose();
				
		    }
		    
		    if (profileModify!=null) {
		    	profileModify.dispose();
				
		    	
		    }
			
		    Home ho = new Home();
			ho.setVisible(true);
			ho.setTitle("Home");
			ho.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		}
	
		
		
	}

}
