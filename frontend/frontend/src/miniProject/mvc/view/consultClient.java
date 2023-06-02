package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerConsultClient;
import miniProject.mvc.routing.Routing;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class consultClient extends JFrame {

	public JPanel contentPane;
	public JLabel textField;
	public JLabel name;
	public JLabel lastName;
	public JLabel mobile;

	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField idE;
	public JTextField textField_4;
	public JTextField textField_5;
	public JComboBox comboBox;
	public JComboBox comboBox_1;
	public JLabel label;
	public JLabel lblNewLabel_6;
	public JComboBox id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultClient frame = new consultClient();
					frame.setTitle("consult client");
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
	public consultClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNewLabel_6 = new JLabel("client id :");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(100, 20, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 3;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		
		id = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(100, 5, 5, 20);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 3;
		contentPane.add(id, gbc_comboBox_2);

		

		controlerConsultClient cl = new controlerConsultClient(this);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(cl);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(100, 0, 5, 20);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		controlerConsultClient cl1 = new controlerConsultClient(this,"home");
       
		JButton btnNewButton1 = new JButton("home");
		btnNewButton1.addActionListener(cl1);
		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.insets = new Insets(100, 0, 5, 20);
		gbc_btnNewButton1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton1.gridx = 5;
		gbc_btnNewButton1.gridy = 3;
		contentPane.add(btnNewButton1, gbc_btnNewButton1);
		
		


		JLabel lblNewLabel = new JLabel("name :");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(50, 20, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 5;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		

		name = new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel1 = new GridBagConstraints();
		gbc_lblNewLabel1.insets = new Insets(50, 100, 20, 5);
		gbc_lblNewLabel1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel1.gridx = 3;
		gbc_lblNewLabel1.gridy = 5;
		contentPane.add(name, gbc_lblNewLabel1);
		
		
		JLabel lblNewLabel_11 = new JLabel("last name :");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(50, 20, 5, 5);
		gbc_lblNewLabel_11.gridx = 2;
		gbc_lblNewLabel_11.gridy = 6;
		contentPane.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		lastName = new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_111 = new GridBagConstraints();
		gbc_lblNewLabel_111.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_111.insets = new Insets(50, 100, 20, 5);
		gbc_lblNewLabel_111.gridx = 3;
		gbc_lblNewLabel_111.gridy = 6;
		contentPane.add(lastName, gbc_lblNewLabel_111);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("mobile :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(50, 20, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 7;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		

		mobile= new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_21.insets = new Insets(50, 100, 20, 5);
		gbc_lblNewLabel_21.gridx = 3;
		gbc_lblNewLabel_21.gridy = 7;
		contentPane.add(mobile, gbc_lblNewLabel_21);
		
		
	
	}

}
