  package payroll;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Window.Type;



public class welcomeadminemployee extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomeadminemployee frame = new welcomeadminemployee();
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
	public welcomeadminemployee() {
		setType(Type.POPUP);
		setTitle("National Autoplast");
		setBackground(Color.GRAY);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 652, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(351, 25, 127, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Payroll");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel_1.setBounds(351, 130, 100, 48);
		contentPane.add(lblNewLabel_1);
		
		JButton employeeButton = new JButton("Employee Login");
		employeeButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		employeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Employeelogin s3 = new Employeelogin();
				dispose();
			}
			});
		employeeButton.setBounds(330, 210, 223, 70);
		contentPane.add(employeeButton);
		JButton adminButton = new JButton("Admin Login");
		adminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		AdminLogin s2 = new AdminLogin();
			dispose();
            }
			});                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     

		adminButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		adminButton.setBounds(323, 335, 230, 75);
		contentPane.add(adminButton);
		
		JLabel imageLabel = new JLabel("");
		Image Img11 = new ImageIcon(this.getClass().getResource("/pay.jpg")).getImage();
	    imageLabel.setIcon(new ImageIcon(Img11));
		imageLabel.setToolTipText("");
		imageLabel.setBounds(29, 61, 273, 266);
		contentPane.add(imageLabel);
		
		JLabel lblNewLabel_2 = new JLabel("National AutoPlast");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel_2.setBounds(351, 86, 248, 33);
		contentPane.add(lblNewLabel_2);
	}
		public static void main(String[] args) {
		welcomeadminemployee frame = new welcomeadminemployee();
		frame.setVisible(true);
	}
}

