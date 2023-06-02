package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerCreateClient;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createClient extends JFrame  {

	
	/**
	 * Launch the application.
	 */
	
	public  JTextField name ;
	public  JTextField lastName ;
	public  JTextField mobile ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createClient frame = new createClient();
					frame.setTitle("create client  ");
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
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
	public createClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 347);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		
	
	
		JLabel lblNewLabel = new JLabel("name :");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(100, 20, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		name = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(100, 0, 5, 20);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 2;
		contentPane.add(name, gbc_textField);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("last name :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
        lastName = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(20, 0, 5, 20);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		contentPane.add(lastName, gbc_textField_1);
		lastName.setColumns(10);
		
		lblNewLabel_1 = new JLabel("mobile :");
		GridBagConstraints gbc_lblNewLabel_61 = new GridBagConstraints();
		gbc_lblNewLabel_61.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_61.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_61.gridx = 1;
		gbc_lblNewLabel_61.gridy = 4;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_61);
	
		
		mobile = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(20, 0, 5, 20);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 2;
		gbc_textField_11.gridy = 4;
		contentPane.add(mobile, gbc_textField_11);
		mobile.setColumns(10);
		
		
		JButton btnNewButton = new JButton("ok");
		controlerCreateClient client = new controlerCreateClient(this);
		btnNewButton.addActionListener(client);
		
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(20, 0, 5, 20);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;

		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 5;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		

		JButton btnNewButton1 = new JButton("home");
		controlerCreateClient client1 = new controlerCreateClient(this,"home");
		btnNewButton1.addActionListener(client1);
		
		
		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.insets = new Insets(20, 0, 5, 20);
		gbc_btnNewButton1.fill = GridBagConstraints.HORIZONTAL;

		gbc_btnNewButton1.gridx = 2;
		gbc_btnNewButton1.gridy = 6;
		contentPane.add(btnNewButton1, gbc_btnNewButton1);
      
		
	 
	 
	}
}
