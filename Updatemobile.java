package payroll;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Updatemobile extends JFrame {

	private JPanel contentPane;
	private JTextField mobilenotext;
	  Statement stmt = null;
		static int flag=0;

	/**
	 * Launch the application.
	 */
/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Updatemobile frame = new Updatemobile();
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
	public Updatemobile() {
		setTitle("National AutoPlast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 439);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mobilenotext = new JTextField();
		mobilenotext.setFont(new Font("Times New Roman", Font.BOLD, 12));
		mobilenotext.setBounds(321, 152, 153, 30);
		contentPane.add(mobilenotext);
		mobilenotext.setColumns(10);
		
		JLabel headingLabel = new JLabel("Update Page");
		headingLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		headingLabel.setBounds(245, 11, 147, 50);
		contentPane.add(headingLabel);
		
		JButton updateButton = new JButton("Update");
		updateButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		updateButton.setBounds(203, 294, 89, 39);
		contentPane.add(updateButton);
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection cn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
					
				
					
					String mobileno=mobilenotext.getText();
					 if((mobileno.isEmpty())) {
						 JOptionPane.showMessageDialog(null," Must Enter All Details "); 
						 flag=1;
					 }
					 else {
						 flag=0;
						 
					 }
					 if(flag==0) {
				
						 String s;
						 s = "update employees set  mobile = " + mobilenotext.getText()+ "  Where mobile= "+mobileno;
						 System.out.println(s);

						 PreparedStatement stmt=cn.prepareStatement(s );
				 		  int i=stmt.executeUpdate();  
						 JOptionPane.showMessageDialog(null,"Updated sucessfully"); 
						 System.out.println("  Updated sucessfully");    
						 cn.close();
				      
					 }
				 }
				 catch(Exception e1){ 
						 System.out.println(e1);
						 }  
					 }
		        });
		
		JLabel mobilenoLabel = new JLabel("Mobile No:");
		mobilenoLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		mobilenoLabel.setBounds(234, 156, 89, 18);
		contentPane.add(mobilenoLabel);
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		CancelButton.setBounds(321, 294, 89, 39);
		contentPane.add(CancelButton);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employeemenu emp = new Employeemenu();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(448, 294, 89, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("---------------------------------------------------------------------------------------------");
		lblNewLabel.setBounds(164, 344, 384, 14);
		contentPane.add(lblNewLabel);
		
		JLabel IMAGELabel = new JLabel("");
		Image Img1 = new ImageIcon(this.getClass().getResource("/up.png")).getImage();
		IMAGELabel.setIcon(new ImageIcon(Img1));
		IMAGELabel.setBounds(10, 38, 216, 253);
		contentPane.add(IMAGELabel);
		
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		
		});
		setVisible(true);
			}
			
		

		public static void main(String[] args) {
			new Updatemobile();
		}
		}
		
