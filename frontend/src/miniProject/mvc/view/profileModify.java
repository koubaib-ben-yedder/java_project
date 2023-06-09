package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerModifyProfile;

import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class profileModify extends JFrame {
	public JTextField E_mail;
	public JTextField password;
	public JTextField role;
	public JTextField name	;
	public JTextField lastName;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profileModify frame = new profileModify();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 

					frame.setTitle("modify profile");
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
	public profileModify() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 455);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("E-mail:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(100, 0, 20, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 3;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		E_mail = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(100, 0, 20, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 3;
		getContentPane().add(E_mail, gbc_textField);
		E_mail.setColumns(10);
		
	
		JLabel lblNewLabel_1 = new JLabel("Password:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(20, 5, 20, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 6;
		getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		password = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(20, 5, 20, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 6;
		getContentPane().add(password, gbc_textField_1);
		password.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("role:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(20, 5, 20, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 8;
		getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		role = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(20, 0, 20, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 8;
		getContentPane().add(role, gbc_textField_2);
		role.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("name:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(20, 5, 20, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 10;
		getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		name = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(20, 0, 20, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 10;
		getContentPane().add(name, gbc_textField_3);
		name.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("last name:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(20, 5, 20, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 12;
		getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		lastName = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(20, 0, 20, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 12;
		getContentPane().add(lastName, gbc_textField_4);
		lastName.setColumns(10);
		controlerModifyProfile pr = new controlerModifyProfile(this);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(pr);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(20, 0, 5, 5);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;

		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 13;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		controlerModifyProfile pr1 = new controlerModifyProfile(this,"home");

		
		JButton btnNewButton1 = new JButton("home");
		btnNewButton1.addActionListener(pr1);
		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.insets = new Insets(20, 0, 5, 5);
		gbc_btnNewButton1.fill = GridBagConstraints.HORIZONTAL;

		gbc_btnNewButton1.gridx = 4;
		gbc_btnNewButton1.gridy = 14;
		getContentPane().add(btnNewButton1, gbc_btnNewButton1);
		
	}

}
