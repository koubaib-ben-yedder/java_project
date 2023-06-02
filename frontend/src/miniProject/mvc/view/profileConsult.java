package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerConsutProfile;
import miniProject.mvc.controler.controlerModifyProvider;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class profileConsult extends JFrame {

	private JPanel contentPane;
	public JLabel name;
	public JLabel E_mail;
	public JLabel role;
	public JLabel password;
	private JButton btnNewButton;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profileConsult frame = new profileConsult();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 

					frame.setTitle("consult profile");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return sss
	 */
	public  profileConsult () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("E-mail:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(100, 5, 40, 20);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		E_mail = new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(100, 10, 40, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(E_mail, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Role:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 5, 40, 20);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 6;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
	    role = new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 10, 40, 5);
		gbc_lblNewLabel_3.gridx = 3;
		gbc_lblNewLabel_3.gridy = 6;
		contentPane.add(role, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 5, 40, 20);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 9;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		password = new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 10, 40, 5);
		gbc_lblNewLabel_5.gridx = 3;
		gbc_lblNewLabel_5.gridy = 9;
		contentPane.add(password, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Name:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 5, 40, 20);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 12;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		name = new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 10, 40, 5);
		gbc_lblNewLabel_7.gridx = 3;
		gbc_lblNewLabel_7.gridy = 12;
		contentPane.add(name, gbc_lblNewLabel_7);
		
		controlerConsutProfile cp = new controlerConsutProfile(this,"home");

		btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(cp);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0,0, 40, 80);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 8;
		gbc_btnNewButton.gridy = 13;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		btnNewButton = new JButton("home");
		btnNewButton.addActionListener(cp);
		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.insets = new Insets(0,0, 40, 80);
		gbc_btnNewButton1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton1.gridx = 8;
		gbc_btnNewButton1.gridy = 14;
		contentPane.add(btnNewButton, gbc_btnNewButton1);
		
		
	}

}
