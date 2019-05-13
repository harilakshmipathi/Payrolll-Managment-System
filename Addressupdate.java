package payroll;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Addressupdate extends JFrame {

	private JPanel contentPane;
	
	static int flag=0;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addressupdate frame = new Addressupdate();
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
  	public Addressupdate() {
		setTitle("National AutoPlast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Page");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(290, 47, 185, 43);
		contentPane.add(lblNewLabel);
		
		JLabel NewAddressLabel = new JLabel("NewAddress:");
		NewAddressLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		NewAddressLabel.setBounds(229, 177, 109, 14);
		contentPane.add(NewAddressLabel);
		
		JTextField 	addrestextField = new JTextField();
		addrestextField.setFont(new Font("Times New Roman", Font.BOLD, 12));
		addrestextField.setBounds(338, 171, 167, 31);
		contentPane.add(addrestextField);
		addrestextField.setColumns(10);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		UpdateButton.setBounds(229, 288, 89, 43);
		contentPane.add(UpdateButton);
		
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection cn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
					
				
					
					String ress =addrestextField.getText();
					 if((ress.isEmpty())) {
						 JOptionPane.showMessageDialog(null," Must Enter All Details "); 
						 flag=1;
					 }
					 else {
						 flag=0;
						 
					 }
					 if(flag==0) {
			
						 String s;
						 s = "update employees set  Address = " + addrestextField.getText()+"  Where Address= "+ress;
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
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		CancelButton.setBounds(349, 287, 89, 43);
		contentPane.add(CancelButton);
		
		JLabel lblNewLabel_1 = new JLabel("----------------------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(198, 360, 400, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employeemenu add =new Employeemenu();
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(470, 287, 89, 43);
		contentPane.add(btnNewButton);
		
		JLabel imageLabel_2 = new JLabel("New label");
		Image Img1 = new ImageIcon(this.getClass().getResource("/up.png")).getImage();
		imageLabel_2.setIcon(new ImageIcon(Img1)); 
		imageLabel_2.setBounds(10, 53, 209, 226);
		contentPane.add(imageLabel_2);
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		setVisible(true);
  	}
		public static void main(String[] args) {
			new Addressupdate();
	}
}
