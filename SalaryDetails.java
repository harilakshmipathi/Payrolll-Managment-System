package payroll;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class SalaryDetails extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel_3 = new JLabel("Allowances Id:");
	private JTextField salaryidtextField;
	private JTextField salarymontextField;
	private JTextField AllowancesidtextField;
	
	/**
	 * @wbp.nonvisual location=511,-31
	 */
	private final JTextField textField_3 = new JTextField();
	private JTextField eductionidtextField;
	private JTextField basicpaytextField;
	JComboBox monthcBox;
	JComboBox basicpaycBox;
	JComboBox eidcBox;
	JComboBox A1Typecbox;
	JComboBox  A1amtcBox;
	JComboBox A2typecBox;
	JComboBox A2amtcBox;
	JComboBox d1typecbox;
	JComboBox dtamtcBox1;
	JComboBox d2typecBox;
	JComboBox dtamtcBox2;
	double count;
	private JTextField texttotalsalary;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salary frame = new Salary();
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
	public SalaryDetails() {
		textField_3.setColumns(10);
		setTitle("National AutoPlast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 492);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel SalaryRegistrationPage = new JLabel("Salary Page");
		SalaryRegistrationPage.setFont(new Font("Times New Roman", Font.BOLD, 25));
		SalaryRegistrationPage.setBounds(303, 23, 154, 34);
		contentPane.add(SalaryRegistrationPage);
		
		JButton InsertButton = new JButton("Insert");
		InsertButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		InsertButton.setBounds(209, 378, 111, 34);
		contentPane.add(InsertButton);
		InsertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
					System.out.println("pay is" +texttotalsalary.getText());
					
					System.out.println("before try");
			
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection cn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
					String Query = "Insert into salary values"
							+ "(ad.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
							
 					PreparedStatement st = cn.prepareStatement(Query);
 					
 			        System.out.println(1);
 					st.setString(1, (String) monthcBox.getSelectedItem());
 					 System.out.println(2);
 					st.setInt(2, Integer.parseInt((String) basicpaycBox.getSelectedItem()));
 					 System.out.println(3);
 					st.setInt(3, Integer.parseInt((String) eidcBox.getSelectedItem()));
 					 System.out.println(4);
 					st.setString(4, (String) A1Typecbox.getSelectedItem());
 					 System.out.println(5);
 					st.setInt(5, Integer.parseInt((String) A1amtcBox.getSelectedItem()));
 					 System.out.println(6);
 					st.setString(6, (String) A2typecBox.getSelectedItem());
 					 System.out.println(7);
 					st.setInt(7, Integer.parseInt((String) A2amtcBox.getSelectedItem()));
 					 System.out.println(8);
 					st.setString(8, (String) d1typecbox.getSelectedItem());
 					 System.out.println(9);
 					st.setInt(9, Integer.parseInt((String) dtamtcBox1.getSelectedItem()));
 					 System.out.println(10);
 					st.setString(10, (String) d2typecBox.getSelectedItem());
 					 System.out.println(11);
 				  st.setInt(11,Integer.parseInt((String) dtamtcBox2.getSelectedItem()));
 					//
 					System.out.println("after basic salary");
 					System.out.println("Totalsalary: "+count);
			//st.setInt(12,Integer.parseInt((String) texttotalsalary.getText()));
					st.setDouble(12,count);
			
					System.out.println("Totalsalary: "+count);
					System.out.println("after Totalsalary");
					
					System.out.println(st.toString());
					
					
				
 					int i=st.executeUpdate();
 					System.out.println("updated");
			
					if(i>0) {
						
						JOptionPane.showMessageDialog(null, "Insert Successfully");
						}
					else
						{
								JOptionPane.showMessageDialog(null, "data is in not found");
								
							}
			

					cn.close();//
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
		
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		CancelButton.setBounds(330, 378, 107, 34);
		contentPane.add(CancelButton);
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel salarymonthLabel = new JLabel("Salary Month:");
		salarymonthLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		salarymonthLabel.setBounds(89, 89, 97, 14);
		contentPane.add(salarymonthLabel);
		
		monthcBox = new JComboBox();
		monthcBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		monthcBox.setBackground(new Color(255, 255, 255));
		monthcBox.setBounds(183, 86, 164, 20);
		monthcBox.addItem("Janaury");
		monthcBox.addItem("Feburay");
		monthcBox.addItem("March");
		monthcBox.addItem("April");
		monthcBox.addItem("May");
		monthcBox.addItem("June");
		monthcBox.addItem("July");
		monthcBox.addItem("August");
		monthcBox.addItem("septamber");
		monthcBox.addItem("October");
		monthcBox.addItem("November");
		monthcBox.addItem("december");
		contentPane.add(monthcBox);
		
		A1Typecbox = new JComboBox();
		A1Typecbox.setBounds(183, 174, 164, 20);
		contentPane.add(A1Typecbox);
		
		JLabel D1typeLabel = new JLabel("Dedutions Type1:");
		D1typeLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		D1typeLabel.setBounds(404, 139, 119, 14);
		contentPane.add(D1typeLabel);
		
		JLabel D1amtlabel = new JLabel("Dedutions Amount1:");
		D1amtlabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		D1amtlabel.setBounds(383, 180, 140, 14);
		contentPane.add(D1amtlabel);
		
		JLabel AmttypeLabel = new JLabel("Allowances Amount1:");
		AmttypeLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		AmttypeLabel.setBounds(34, 226, 144, 14);
		contentPane.add(AmttypeLabel);
		
		 d1typecbox = new JComboBox();
		d1typecbox.setBounds(521, 137, 144, 20);
		contentPane.add(d1typecbox);
		
		dtamtcBox1 = new JComboBox();
		dtamtcBox1.setBounds(521, 178, 144, 20);
		contentPane.add(dtamtcBox1);
		
		JLabel atype1Label = new JLabel("Allowances Type1:");
		atype1Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		atype1Label.setBounds(56, 176, 130, 18);
		contentPane.add(atype1Label);
		
		eidcBox = new JComboBox();
		eidcBox.setBounds(521, 87, 144, 20);
		contentPane.add(eidcBox);
		
		JLabel EmployeeidLabel = new JLabel("Employeeid:");
		EmployeeidLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		EmployeeidLabel.setBounds(434, 89, 89, 14);
		contentPane.add(EmployeeidLabel);
		
		JLabel lblBasicpay = new JLabel("Basicpay:");
		lblBasicpay.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBasicpay.setBounds(115, 136, 63, 21);
		contentPane.add(lblBasicpay);
		
		basicpaycBox = new JComboBox();
		basicpaycBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		basicpaycBox.setBounds(183, 136, 164, 20);
		contentPane.add(basicpaycBox);
		
		 A1amtcBox = new JComboBox();
		A1amtcBox.setBounds(183, 224, 164, 20);
		contentPane.add(A1amtcBox);
		
		JLabel llblA2Type = new JLabel("Allowances Type2:");
		llblA2Type.setFont(new Font("Times New Roman", Font.BOLD, 15));
		llblA2Type.setBounds(56, 270, 130, 20);
		contentPane.add(llblA2Type);
		
		 A2typecBox = new JComboBox();
		A2typecBox.setBounds(183, 271, 164, 20);
		contentPane.add(A2typecBox);
		
		JLabel lbld2Type = new JLabel("Dedutions Type2:");
		lbld2Type.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbld2Type.setBounds(404, 227, 119, 14);
		contentPane.add(lbld2Type);
		
		 d2typecBox = new JComboBox();
		d2typecBox.setBounds(521, 224, 144, 20);
		contentPane.add(d2typecBox);
		
		JLabel D2Amtcbox = new JLabel("Dedutions Amount2:");
		D2Amtcbox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		D2Amtcbox.setBounds(383, 274, 140, 14);
		contentPane.add(D2Amtcbox);
		
	    dtamtcBox2 = new JComboBox();
		dtamtcBox2.setBounds(521, 271, 144, 20);
		contentPane.add(dtamtcBox2);
		
		JLabel lblA2Amnt = new JLabel("Allowances Amount2:");
		lblA2Amnt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblA2Amnt.setBounds(34, 315, 144, 14);
		contentPane.add(lblA2Amnt);
		
		A2amtcBox = new JComboBox();
		A2amtcBox.setBounds(183, 313, 164, 20);
		contentPane.add(A2amtcBox);
		
		JLabel lblNewLabel = new JLabel("----------------------------------------------------------");
		lblNewLabel.setBounds(249, 423, 238, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Total Salary:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(434, 334, 107, 15);
		contentPane.add(lblNewLabel_1);
		
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(" :- " +A1amtcBox.getSelectedItem());
				
		          String a1 = (String) A1amtcBox.getSelectedItem();
		        
		          double amt = Double.parseDouble(a1);
		       
		          System.out.println(amt);
		     
		    
		          String a2 = (String) A2amtcBox.getSelectedItem();
		          double amt2 = Double.parseDouble(a2);
		        //  System.out.println(amt2);
		          
		          String d1 = (String) dtamtcBox1.getSelectedItem();
		          double damt = Double.parseDouble(d1);
		     
		       //   System.out.println(damt);
		          
		          String d2 = (String) dtamtcBox2.getSelectedItem();
		          double d2amt = Double.parseDouble(d2);
		     
		     //     System.out.println(d2amt);
		          
		          String pay = (String) basicpaycBox.getSelectedItem();
		          double bpay = Double.parseDouble(pay);
		          
		    //      System.out.println(bpay+amt+amt2);
		          
		    count=(bpay+amt+amt2)-(damt+d2amt);
      
		            String t = "" + count ;
		            texttotalsalary.setText(t);
		            System.out.println("Totalsalary: " +count);
		            
					}
					
				});
	
		
		btnGenerate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnGenerate.setBounds(56, 353, 122, 26);
		contentPane.add(btnGenerate);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu menu = new AdminMenu();
				dispose();
			}
		});
		backButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		backButton.setBounds(455, 378, 107, 34);
		contentPane.add(backButton);
		
		texttotalsalary = new JTextField();
		texttotalsalary.setFont(new Font("Times New Roman", Font.BOLD, 15));
		texttotalsalary.setBounds(538, 333, 127, 20);
		contentPane.add(texttotalsalary);
		texttotalsalary.setColumns(10);
		
		setVisible(true);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
		String statement="select * from employees";
		PreparedStatement p_stmt=cn.prepareStatement(statement);
		ResultSet rs=p_stmt.executeQuery();
		while(rs.next()) {
			String department=rs.getString("employeeId");
			eidcBox.addItem(department);
		
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String statement="select * from employees";
	PreparedStatement p_stmt=cn.prepareStatement(statement);
	ResultSet rs=p_stmt.executeQuery();
	while(rs.next()) {
		String pay=rs.getString("Basicpay");
		basicpaycBox.addItem(pay);
	
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String statement="select * from allowances";
	PreparedStatement p_stmt=cn.prepareStatement(statement);
	ResultSet rs=p_stmt.executeQuery();
	while(rs.next()) {
		String atype1=rs.getString("Allowancestype1");
	    A1Typecbox.addItem(atype1);
		
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String statement="select * from allowances";
	PreparedStatement p_stmt=cn.prepareStatement(statement);
	ResultSet rs=p_stmt.executeQuery();
	while(rs.next()) {
		
		String altype2=rs.getString("Allowancestype2");
		 A2typecBox.addItem(altype2);
		
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn1 = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String statement1="select * from allowances";
	PreparedStatement p_stmt1=cn1.prepareStatement(statement1);
	ResultSet rs1=p_stmt1.executeQuery();
	while(rs1.next()) {
		
		String amt1=rs1.getString("Allowancesamount1");
		 A1amtcBox.addItem(amt1);
		
		
	
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn11 = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String statement11="select * from allowances";
	PreparedStatement p_stmt11=cn11.prepareStatement(statement11);
	ResultSet rss=p_stmt11.executeQuery();
	while(rss.next()) {
		
		String altype2=rss.getString("Allowancesamount2");
		 A2amtcBox.addItem(altype2);
		
		
	
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn11 = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String statement11="select * from deductions";
	PreparedStatement p_stmt11=cn11.prepareStatement(statement11);
	ResultSet rs11=p_stmt11.executeQuery();
	while(rs11.next()) {
		String type1=rs11.getString("deddutiontype1");
		d1typecbox.addItem(type1);
		
		
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cnn = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String statement11="select * from deductions";
	PreparedStatement p_stmt11=cnn.prepareStatement(statement11);
	ResultSet rsr=p_stmt11.executeQuery();
	while(rsr.next()) {
	
		String type2=rsr.getString("deductiontype2");
		d2typecBox.addItem(type2);
	
		
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cnnt = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String state="select * from deductions";
	PreparedStatement p_stmt11=cnnt.prepareStatement(state);
	ResultSet rse=p_stmt11.executeQuery();
	while(rse.next()) {
	
		String amt1=rse.getString("deductionamount1");
		dtamtcBox1.addItem(amt1);
	
		
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cnn = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String statement11="select * from deductions";
	PreparedStatement p_stmt11=cnn.prepareStatement(statement11);
	ResultSet rst=p_stmt11.executeQuery();
	while(rst.next()) {
		String amt2=rst.getString("deductionamount2");
		dtamtcBox2.addItem(amt2);
	
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
		public static void main(String[] args) {
			new SalaryDetails();
	}
}
