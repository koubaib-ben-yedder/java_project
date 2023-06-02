package miniProject.mvc.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniProject.mvc.controler.controlerConsultOrderProvider;
import miniProject.mvc.controler.controlerConsultProvider;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class consultOrderProvider extends JFrame {

	public JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JComboBox comboBox;
	public JComboBox comboBox_1;
	public JLabel label;
	public JLabel name;

	public JLabel date;

	public JLabel quality;
	public JLabel quantity;

	public JLabel ed;
	public JLabel fd;

	public JLabel lblNewLabel_6;
	public JComboBox id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultOrderProvider frame = new consultOrderProvider();
					frame.setTitle("consult order provider");
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
	public consultOrderProvider() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNewLabel_6 = new JLabel("order id :");
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
		
		
		controlerConsultOrderProvider co = new controlerConsultOrderProvider(this);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(co);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(100, 0, 5, 20);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		controlerConsultOrderProvider ho = new controlerConsultOrderProvider(this,"home");

		
		JButton btnNewButton1 = new JButton("home");
		btnNewButton1.addActionListener(ho);
		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.insets = new Insets(100, 0, 5, 20);
		gbc_btnNewButton1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton1.gridx = 5;
		gbc_btnNewButton1.gridy = 3;
		contentPane.add(btnNewButton1, gbc_btnNewButton1);
		
		JLabel lblNewLabel1 = new JLabel("name product :");
		GridBagConstraints gbc_lblNewLabel11 = new GridBagConstraints();
		gbc_lblNewLabel11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel11.insets = new Insets(50, 20, 5, 5);
		gbc_lblNewLabel11.gridx = 2;
		gbc_lblNewLabel11.gridy = 4;
		contentPane.add(lblNewLabel1, gbc_lblNewLabel11);
		
		JLabel lblNewLabel = new JLabel("name product :");
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

	
		
		JLabel lblNewLabel_1 = new JLabel("date product:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(50, 20, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 6;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		date= new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_11.insets = new Insets(50, 100, 20, 5);
		gbc_lblNewLabel_11.gridx = 3;
		gbc_lblNewLabel_11.gridy = 6;
		contentPane.add(date, gbc_lblNewLabel_11);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("quality product :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(50, 20, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 7;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		

		quantity = new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_21.insets = new Insets(50, 100, 20, 5);
		gbc_lblNewLabel_21.gridx = 3;
		gbc_lblNewLabel_21.gridy = 7;
		contentPane.add(quantity, gbc_lblNewLabel_21);
		
		
		JLabel lblNewLabel_3 = new JLabel("quality product:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(50, 20, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 8;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		quality = new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_31 = new GridBagConstraints();
		gbc_lblNewLabel_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_31.insets = new Insets(50, 100, 20, 5);
		gbc_lblNewLabel_31.gridx = 3;
		gbc_lblNewLabel_31.gridy = 8;
		contentPane.add(quality, gbc_lblNewLabel_31);
		
	
		
		
		JLabel lblNewLabel_4 = new JLabel("fabrication date of product");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(50, 20, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 9;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		
	    fd = new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_311 = new GridBagConstraints();
		gbc_lblNewLabel_311.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_311.insets = new Insets(50, 100, 20, 5);
		gbc_lblNewLabel_311.gridx = 3;
		gbc_lblNewLabel_311.gridy = 9;
		contentPane.add(fd, gbc_lblNewLabel_311);
		
	
		
		JLabel lblNewLabel_5 = new JLabel("expire date of product :");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(50, 20, 0, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 10;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		
		ed= new JLabel("NA");
		GridBagConstraints gbc_lblNewLabel_51 = new GridBagConstraints();
		gbc_lblNewLabel_51.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_51.insets = new Insets(50, 100, 20, 5);
		gbc_lblNewLabel_51.gridx = 3;
		gbc_lblNewLabel_51.gridy = 10;
		contentPane.add(ed, gbc_lblNewLabel_51);
		
	
	}

}
