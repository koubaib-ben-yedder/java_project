package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerCreateOrderProvider;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createOrderProvider extends JFrame {

	private JPanel contentPane;
	public JTextField nameO;
	public JLabel lblNewLabel_1;
	public JTextField dateO;
	public JTextField namePR;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_3;
	public JTextField quantity;
	public JLabel lblNewLabel_4;
	public JTextField quality;
	public JComboBox  id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createOrderProvider frame = new createOrderProvider();
					frame.setTitle("create order provider");
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
	public createOrderProvider() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,0.0,0.0,   Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		
		
	
		JLabel lblNewLabel = new JLabel("name :");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(100, 20, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		nameO = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(100, 0, 5, 20);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		contentPane.add(nameO, gbc_textField);
		nameO.setColumns(10);
		
		lblNewLabel_1 = new JLabel("date :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		dateO = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(20, 0, 5, 20);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		contentPane.add(dateO, gbc_textField_1);
		dateO.setColumns(10);
		
		JLabel textField_6 = new JLabel("product id :");
		GridBagConstraints gbc_lblNewLabel_61 = new GridBagConstraints();
		gbc_lblNewLabel_61.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_61.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_61.gridx = 1;
		gbc_lblNewLabel_61.gridy = 3;
		contentPane.add(textField_6, gbc_lblNewLabel_61);

		String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };

		id = new JComboBox(petStrings);
		GridBagConstraints gbc_comboBox_21 = new GridBagConstraints();
		gbc_comboBox_21.insets = new Insets(20, 5, 5, 20);
		gbc_comboBox_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_21.gridx = 2;
		gbc_comboBox_21.gridy = 3;
		contentPane.add(id, gbc_comboBox_21);
		
		
	
		lblNewLabel_2 = new JLabel("product name :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 4;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		namePR = new JTextField();
		
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(20, 0, 5, 20);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		contentPane.add(namePR, gbc_textField_2);
		namePR.setColumns(10);
		
		
		lblNewLabel_3 = new JLabel("quality :");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 5;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		quality = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(20, 0, 5, 20);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 5;
		contentPane.add(quality, gbc_textField_3);
		quality.setColumns(10);
		
		lblNewLabel_3 = new JLabel(" quantity :");
		GridBagConstraints gbc_lblNewLabel_31 = new GridBagConstraints();
		gbc_lblNewLabel_31.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_31.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_31.gridx = 1;
		gbc_lblNewLabel_31.gridy = 6;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_31);
		
		quantity = new JTextField();
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(20, 0, 5, 20);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 2;
		gbc_textField_31.gridy = 6;
		contentPane.add(quantity, gbc_textField_31);
		quantity.setColumns(10);
		
		controlerCreateOrderProvider or = new controlerCreateOrderProvider(this);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(or);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(20, 0, 5, 20);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 7;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		controlerCreateOrderProvider or1 = new controlerCreateOrderProvider(this,"home");

		JButton btnNewButton1 = new JButton("home");
		btnNewButton1.addActionListener(or1);
		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.insets = new Insets(20, 0, 5, 20);
		gbc_btnNewButton1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton1.gridx = 2;
		gbc_btnNewButton1.gridy = 8;
		contentPane.add(btnNewButton1, gbc_btnNewButton1);
	}
}
