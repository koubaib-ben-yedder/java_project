package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerConsultOrderClient;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import miniProject.mvc.controler.*;
public class consultOrderChose extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultOrderChose frame = new consultOrderChose();
					frame.setTitle("consult order chose");
					frame.setSize(500,300);
					frame.setLocation(520,250);
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
	public consultOrderChose() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		controlerConsultOrderChose cOC= new controlerConsultOrderChose(this,"consult order client");
		
		JButton btnNewButton = new JButton("consult order client");
		btnNewButton.addActionListener(cOC);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(20,57, 5, 0);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		cOC= new controlerConsultOrderChose(this,"consult order provider");

		JButton button = new JButton("consult order provider");
		button.addActionListener(cOC);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(20,57, 5, 0);
		gbc_button.gridx = 1;
		gbc_button.gridy = 3;
		contentPane.add(button, gbc_button);
		
		cOC= new controlerConsultOrderChose(this,"home");

		JButton button1 = new JButton("home");
		button1.addActionListener(cOC);
		GridBagConstraints gbc_button1 = new GridBagConstraints();
		gbc_button1.insets = new Insets(20, 57, 5, 0);
		gbc_button1.gridx = 1;
		gbc_button1.gridy = 4;
		contentPane.add(button1, gbc_button1);
	}


}
