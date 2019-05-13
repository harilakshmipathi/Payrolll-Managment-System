package payroll;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class AdminLogin extends JFrame  {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.@invokeLater(new Runnable() {
			public void run() {
				try {
					Adminlogin s2 = new Adminlogin();
					s2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	*/

	/**
	 * Create the frame.
	 */
	public AdminLogin()
	{
		setTitle("National AutoPlat");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 489);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(249, 37, 168, 35);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(223, 104, 82, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(223, 176, 82, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextField	textUserName = new JTextField();
		textUserName.setBounds(292, 137, 203, 28);
		contentPane.add(textUserName);
		textUserName.setColumns(10);
		
		JPasswordField textPassword = new JPasswordField();
		textPassword.setBounds(292, 201, 203, 28);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
	
		JButton LoginButton = new JButton("Login");
		LoginButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		LoginButton.setBounds(191, 302, 96, 35);
		contentPane.add(LoginButton);
			LoginButton.addActionListener(new ActionListener() {
			@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
							Connection cn = DriverManager.getConnection
									("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");		
						Statement st = cn.createStatement();
							System.out.println(textUserName.getText());
							System.out.println(textPassword.getText());
							
							String Sql = "Select * from Admin where userName like '"+textUserName.getText()+"' and Password like '"+textPassword.getText()+"'";
							ResultSet rs = st.executeQuery(Sql);
							
							if(rs.next())
							{
								JOptionPane.showMessageDialog(null, "Successfully login..");
								dispose();
								AdminMenu menu = new AdminMenu();
							
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Incorrect Username and Password..");
							}
							cn.close();		
									
						}
							catch(ClassNotFoundException e1)
									{
										e1.printStackTrace();
									}
									catch(SQLException s) { 
									System.out.println(s);
									}	
								}  
								});
				JButton cancelbutton = new JButton("Cancel");
				cancelbutton.setFont(new Font("Times New Roman", Font.BOLD, 18));
				cancelbutton.setBounds(310, 302, 107, 35);
				contentPane.add(cancelbutton);
					
				cancelbutton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						dispose();
					}
				
				});
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image Img1 = new ImageIcon(this.getClass().getResource("/ad.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(Img1)); 
		lblNewLabel_3.setBounds(10, 62, 180, 216);
		contentPane.add(lblNewLabel_3);
		
		JLabel label = new JLabel("---------------");
		label.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label.setBounds(267, 361, 150, 29);
		contentPane.add(label);
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu s2 = new AdminMenu();	
			}
		});
		BackButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		BackButton.setBounds(438, 302, 107, 35);
		contentPane.add(BackButton);
		setVisible(true);
	}
		public static void main(String[] args) {
			new AdminLogin();
			
}
	
}
		
	
		
		
		
