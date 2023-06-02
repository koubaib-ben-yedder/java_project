package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerCreateOrderClient;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import miniProject.mvc.controler.*;
public class createOrderChose extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createOrderChose frame = new createOrderChose();
					frame.setTitle("create order chose");
					frame.setSize(300,200);
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
	public createOrderChose() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{ 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		controlerCreateOrderChose cCOC= new controlerCreateOrderChose(this,"create order client");
		
		
		
		JButton btnNewButton1 = new JButton("create order client");
		btnNewButton1.addActionListener(cCOC);
		

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(15, 20, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		contentPane.add(btnNewButton1, gbc_btnNewButton);
		
		cCOC= new controlerCreateOrderChose(this,"create order client");

		JButton btnNewButton = new JButton("create order client");
		btnNewButton.addActionListener(cCOC);

		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.insets = new Insets(15, 20, 5, 5);
		gbc_btnNewButton1.gridx = 1;
		gbc_btnNewButton1.gridy =3 ;
		contentPane.add(btnNewButton, gbc_btnNewButton1);
		
		cCOC= new controlerCreateOrderChose(this,"home");

				JButton button1 = new JButton("home");
				button1.addActionListener(cCOC);
				GridBagConstraints gbc_button1 = new GridBagConstraints();
				gbc_button1.insets = new Insets(15, 20, 5, 5);
				gbc_button1.gridx = 1;
				gbc_button1.gridy = 4;
				contentPane.add(button1, gbc_button1);
	}

}
