package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerModifyClient;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modifyClient extends JFrame {

	public JPanel contentPane;
	public JTextField name;
	public JLabel lblNewLabel_1;
	public JTextField lastName;
	public JTextField mobile;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_3;
	public JTextField textField_3;
	public JLabel lblNewLabel_4;
	public JTextField textField_4;
	public JComboBox  id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modifyClient frame = new modifyClient();
					frame.setTitle("modify client  ");
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
	public modifyClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  0.0,Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("client id");
		GridBagConstraints gbc_lblNewLabel_61 = new GridBagConstraints();
		gbc_lblNewLabel_61.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_61.insets = new Insets(100, 20, 5, 5);
		gbc_lblNewLabel_61.gridx = 1;
		gbc_lblNewLabel_61.gridy = 2;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_61);
		String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };

	    id = new JComboBox(petStrings);
		GridBagConstraints gbc_comboBox_21 = new GridBagConstraints();
		gbc_comboBox_21.insets = new Insets(100, 5, 5, 20);
		gbc_comboBox_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_21.gridx = 2;
		gbc_comboBox_21.gridy = 2;
		contentPane.add(id, gbc_comboBox_21);
		
		
	
		
	
		JLabel lblNewLabel = new JLabel("name :");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		name = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(20, 0, 5, 20);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		contentPane.add(name, gbc_textField);
		name.setColumns(10);
		
		lblNewLabel_1 = new JLabel("last name :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 4;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lastName = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(20, 0, 5, 20);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 4;
		contentPane.add(lastName, gbc_textField_1);
		lastName.setColumns(10);
		
		JLabel textField_6 = new JLabel("mobile :");
		GridBagConstraints gbc_lblNewLabel_611 = new GridBagConstraints();
		gbc_lblNewLabel_611.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_611.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_611.gridx = 1;
		gbc_lblNewLabel_611.gridy = 5;
		contentPane.add(textField_6, gbc_lblNewLabel_611);
	
		
		mobile = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(20, 0, 5, 20);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 2;
		gbc_textField_11.gridy = 5;
		contentPane.add(mobile, gbc_textField_11);
		mobile.setColumns(10);
		
		JButton btnNewButton = new JButton("ok");
		controlerModifyClient cl = new controlerModifyClient(this);
		btnNewButton.addActionListener(cl);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(20, 0, 5, 20);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;

		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 6;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		

		JButton btnNewButton1 = new JButton("home");
		controlerModifyClient cl1 = new controlerModifyClient(this,"home");
		btnNewButton1.addActionListener(cl1);
		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.insets = new Insets(20, 0, 5, 20);
		gbc_btnNewButton1.fill = GridBagConstraints.HORIZONTAL;

		gbc_btnNewButton1.gridx = 2;
		gbc_btnNewButton1.gridy = 7;
		contentPane.add(btnNewButton1, gbc_btnNewButton1);
	}
}
