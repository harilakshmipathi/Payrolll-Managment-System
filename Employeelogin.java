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

public class Employeelogin extends JFrame {

	private JPanel contentPane;
	private JTextField textusername;
	private JTextField textpassword;
	private JButton btnNewButton;
	private JButton cancelButton;
	private JLabel lblThisIsThe;
	private JButton resetButton;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeelogin frame = new Employeelogin();
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
	public Employeelogin() {
		setTitle("National AutoPlast");
		System.out.println("in constr");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 513);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(282, 27, 219, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Id:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(282, 115, 104, 23);
		contentPane.add(lblNewLabel_1);
		
		JTextField	textempid = new JTextField();
		textempid.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textempid.setBounds(359, 142, 194, 33);
		contentPane.add(textempid);
		textempid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(308, 193, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		JPasswordField	textpassword = new JPasswordField();
		textpassword.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textpassword.setBounds(359, 218, 194, 33);
		contentPane.add(textpassword);
		textpassword.setColumns(10);
		
	//	btnNewButton = new JButton("Login");
		//btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
	//	btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		//btnNewButton.addActionListener(new ActionListener() {
			
	//	btnNewButton.setBounds(473, 309, -87, 40);
		//contentPane.add(btnNewButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cancelButton.setBounds(311, 390, 157, 40);
		contentPane.add(cancelButton);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});

		lblThisIsThe = new JLabel("---------------");
		lblThisIsThe.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblThisIsThe.setBounds(245, 441, 150, 23);
		contentPane.add(lblThisIsThe);
		
		resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		resetButton.setBounds(311, 345, 158, 34);
		contentPane.add(resetButton);
		
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textempid.setText("");    
				textpassword.setText("");
			}
		});
		
		JLabel imageLabel = new JLabel("");
		 Image Img1 = new ImageIcon(this.getClass().getResource("/eP.png")).getImage();
	    imageLabel.setIcon(new ImageIcon(Img1));
		imageLabel.setBounds(23, 72, 249, 261);
		contentPane.add(imageLabel);
		
		JButton LoginButton = new JButton("Login");

		LoginButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		LoginButton.setBounds(313, 301, 155, 33);
		contentPane.add(LoginButton);
		LoginButton.addActionListener(new ActionListener() {
		
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection cn = DriverManager.getConnection
								("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");		
					Statement st = cn.createStatement();
						System.out.println(textempid.getText());
						System.out.println(textpassword.getText());
						
						String Sql = "Select * from employees where employeeid like '"+textempid.getText()+"' and Password like '"+textpassword.getText()+"'";
						ResultSet rs = st.executeQuery(Sql);
						
						if(rs.next())
						{
							JOptionPane.showMessageDialog(null, "Successfully login..");
							dispose();
							Employeemenu menu = new Employeemenu();
						
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

		setVisible(true);
	}
	

		public static void main(String[] args) {
			new Employeelogin();
	}
}
