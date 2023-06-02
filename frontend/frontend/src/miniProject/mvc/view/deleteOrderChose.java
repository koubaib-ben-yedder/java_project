package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerDeleteOrderChose;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class deleteOrderChose extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteOrderChose frame = new deleteOrderChose();
					frame.setTitle("delete order chose");
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
	public deleteOrderChose() {
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
		
		controlerDeleteOrderChose cDOC = new controlerDeleteOrderChose(this,"delete order client");
		
		JButton btnNewButton = new JButton("delete order client");
		btnNewButton.addActionListener(cDOC);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(15, 67, 5, 0);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		cDOC = new controlerDeleteOrderChose(this,"delete order provider");
		
		JButton button = new JButton("delete order provider");
		button.addActionListener(cDOC);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(15, 67, 5, 0);
		gbc_button.gridx = 1;
		gbc_button.gridy = 3;
		contentPane.add(button, gbc_button);
		
		cDOC = new controlerDeleteOrderChose(this,"home");
		
		JButton button1 = new JButton("home");
		button1.addActionListener(cDOC);
		GridBagConstraints gbc_button1 = new GridBagConstraints();
		gbc_button1.insets = new Insets(15, 67, 5, 0);
		gbc_button1.gridx = 1;
		gbc_button1.gridy = 4;
		contentPane.add(button1, gbc_button1);
	}

}
