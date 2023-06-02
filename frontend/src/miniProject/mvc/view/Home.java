package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerHome;
import miniProject.mvc.routing.Routing;

import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Home extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					//java.net.URL url = ClassLoader.getSystemResource("miniProject.logo.png");
				    //ImageIcon arrowIcon = null;
				      
					 //arrowIcon = new ImageIcon(url);
			         //frame.setIconImage(arrowIcon.getImage());
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                    frame.setTitle("Home");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1053, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Profile:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(100, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		controlerHome home = new controlerHome(this,"modify profile");
		
		btnNewButton = new JButton("modify profile");
		btnNewButton.addActionListener(home);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(100, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		home = new controlerHome(this,"delete profile");
		
		btnNewButton_1 = new JButton("delete profile");
		Routing home2= new Routing(this,"delete profile");
		btnNewButton_1.addActionListener(home);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(100, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 1;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		home = new controlerHome(this,"login");

		btnNewButton_1 = new JButton("logout");
		btnNewButton_1.addActionListener(home);
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.insets = new Insets(100, 0, 5, 5);
		gbc_btnNewButton_11.gridx = 4;
		gbc_btnNewButton_11.gridy = 1;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_11);
		
		
		lblNewLabel_1 = new JLabel("Product:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(100, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 5;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		home = new controlerHome(this,"create product");

		btnNewButton_4 = new JButton("create product");
		btnNewButton_4.addActionListener(home);
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(100, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 2;
		gbc_btnNewButton_4.gridy = 5;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);
		
		home = new controlerHome(this,"modify product");

		btnNewButton_5 = new JButton("modify product");
		btnNewButton_5.addActionListener(home);
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(100, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 3;
		gbc_btnNewButton_5.gridy = 5;
		contentPane.add(btnNewButton_5, gbc_btnNewButton_5);
		
		home = new controlerHome(this,"consult product");

		btnNewButton_6 = new JButton("consult product");
		btnNewButton_6.addActionListener(home);
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(100, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 4;
		gbc_btnNewButton_6.gridy = 5;
		contentPane.add(btnNewButton_6, gbc_btnNewButton_6);
		
		home = new controlerHome(this,"delete product");

		btnNewButton_7 = new JButton("delete product");
		btnNewButton_7.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		
		gbc_btnNewButton_7.insets = new Insets(100, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 5;
		gbc_btnNewButton_7.gridy = 5;
		contentPane.add(btnNewButton_7, gbc_btnNewButton_7);
		
		home = new controlerHome(this,"modify order");

		btnNewButton_9 = new JButton("modify order");
		btnNewButton_9.addActionListener(home);

		
		
		lblNewLabel_2 = new JLabel("order:");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(110, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 9;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		home = new controlerHome(this,"create order");

		btnNewButton_8 = new JButton("create order");
		btnNewButton_8.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		
		gbc_btnNewButton_8.insets = new Insets(110, 0, 5, 5);
		gbc_btnNewButton_8.gridx = 2;
		gbc_btnNewButton_8.gridy = 9;
		contentPane.add(btnNewButton_8, gbc_btnNewButton_8);
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		
		gbc_btnNewButton_9.insets = new Insets(110, 0, 5, 5);
		gbc_btnNewButton_9.gridx = 3;
		gbc_btnNewButton_9.gridy = 9;
		contentPane.add(btnNewButton_9, gbc_btnNewButton_9);
		
		home = new controlerHome(this,"consult order");

		btnNewButton_10 = new JButton("consult order");
		btnNewButton_10.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.insets = new Insets(110, 0, 5, 5);
		gbc_btnNewButton_10.gridx = 4;
		gbc_btnNewButton_10.gridy = 9;
		contentPane.add(btnNewButton_10, gbc_btnNewButton_10);
		
		home = new controlerHome(this,"delete order");

		btnNewButton_11 = new JButton("delete order");

		btnNewButton_11.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_111 = new GridBagConstraints();
		gbc_btnNewButton_111.insets = new Insets(110, 0, 5, 5);
		gbc_btnNewButton_111.gridx = 5;
		gbc_btnNewButton_111.gridy = 9;
		contentPane.add(btnNewButton_11, gbc_btnNewButton_111);
		
		lblNewLabel_3 = new JLabel("Client:");
		
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(120, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 13;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		home = new controlerHome(this,"create client");

		btnNewButton_12 = new JButton("create client");
		btnNewButton_12.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
		gbc_btnNewButton_12.insets = new Insets(120, 0, 5, 5);
		gbc_btnNewButton_12.gridx = 2;
		gbc_btnNewButton_12.gridy = 13;
		contentPane.add(btnNewButton_12, gbc_btnNewButton_12);
		
		home = new controlerHome(this,"modify client");

		btnNewButton_13 = new JButton("modify client");
		btnNewButton_13.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_13 = new GridBagConstraints();
		gbc_btnNewButton_13.insets = new Insets(120, 0, 5, 5);
		gbc_btnNewButton_13.gridx = 3;
		gbc_btnNewButton_13.gridy = 13;
		contentPane.add(btnNewButton_13, gbc_btnNewButton_13);
		
		home = new controlerHome(this,"consult client");

		btnNewButton_14 = new JButton("consult client");


		btnNewButton_14.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_14 = new GridBagConstraints();
		gbc_btnNewButton_14.insets = new Insets(120, 0, 5, 5);
		gbc_btnNewButton_14.gridx = 4;
		gbc_btnNewButton_14.gridy = 13;
		contentPane.add(btnNewButton_14, gbc_btnNewButton_14);
		
		home = new controlerHome(this,"delete client");

		btnNewButton_15 = new JButton("delete client");

		btnNewButton_15.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_15 = new GridBagConstraints();
		gbc_btnNewButton_15.insets = new Insets(120, 0, 5, 5);
		gbc_btnNewButton_15.gridx = 5;
		gbc_btnNewButton_15.gridy = 13;
		contentPane.add(btnNewButton_15, gbc_btnNewButton_15);
		
		lblNewLabel_4 = new JLabel("Provider:");
		
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(130, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 17;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		home = new controlerHome(this,"create provider");

		btnNewButton_16 = new JButton("create provider");

		btnNewButton_16.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_16 = new GridBagConstraints();
		gbc_btnNewButton_16.insets = new Insets(130, 0, 5, 5);
		gbc_btnNewButton_16.gridx = 2;
		gbc_btnNewButton_16.gridy = 17;
		contentPane.add(btnNewButton_16, gbc_btnNewButton_16);
		
		home = new controlerHome(this,"modify provider");

		btnNewButton_17 = new JButton("modify provider");

		btnNewButton_17.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_17 = new GridBagConstraints();
		gbc_btnNewButton_17.insets = new Insets(130, 0, 5, 5);
		gbc_btnNewButton_17.gridx = 3;
		gbc_btnNewButton_17.gridy = 17;
		contentPane.add(btnNewButton_17, gbc_btnNewButton_17);
		
		home = new controlerHome(this,"consult provider");

		btnNewButton_18 = new JButton("consult provider");

		btnNewButton_18.addActionListener(home);

		
		GridBagConstraints gbc_btnNewButton_18 = new GridBagConstraints();
		gbc_btnNewButton_18.insets = new Insets(130, 0, 5, 5);
		gbc_btnNewButton_18.gridx = 4;
		gbc_btnNewButton_18.gridy = 17;
		contentPane.add(btnNewButton_18, gbc_btnNewButton_18);
		
		home = new controlerHome(this,"delete provider");

		btnNewButton_19 = new JButton("delete provider");

		btnNewButton_19.addActionListener(home);

		GridBagConstraints gbc_btnNewButton_19 = new GridBagConstraints();
		gbc_btnNewButton_19.insets = new Insets(130, 0, 5, 5);
		gbc_btnNewButton_19.gridx = 5;
		gbc_btnNewButton_19.gridy = 17;
		contentPane.add(btnNewButton_19, gbc_btnNewButton_19);
		
	
		
	
	}

}
