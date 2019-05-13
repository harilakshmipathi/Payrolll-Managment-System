package payroll;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class EmployeeViewSalary extends JFrame {

	private JPanel contentPane;
	JLabel javalangString;
	JLabel employeeidLabel;
	
	JLabel dateofbirthLabel;
	JLabel Gender;
	JLabel EnameLabel;
	JLabel banknamelabel;

	/**
	 * Launch the application.
	 */
/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSalarydetails frame = new ViewSalarydetails();
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
	public EmployeeViewSalary() {
		setTitle("National AutoPlast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 492);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("National Autoplast");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel.setBounds(278, 11, 242, 34);
		contentPane.add(lblNewLabel);
		
		JLabel idLabel = new JLabel("Employeei d:");
		idLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		idLabel.setBounds(77, 95, 76, 14);
		contentPane.add(idLabel);
		
		JLabel depatLabel = new JLabel("Department:");
		depatLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		depatLabel.setBounds(77, 132, 69, 20);
		contentPane.add(depatLabel);
		
		JLabel dobLabel = new JLabel("Date of Birth:");
		dobLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		dobLabel.setBounds(70, 163, 76, 14);
		contentPane.add(dobLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Madurai-625007");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_5.setBounds(288, 44, 176, 24);
		contentPane.add(lblNewLabel_5);
		
		JLabel GendetLabel = new JLabel("Gender:");
		GendetLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GendetLabel.setBounds(93, 191, 46, 14);
		contentPane.add(GendetLabel);
		
		JLabel lblNewLabel_7 = new JLabel("EmployeeName:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_7.setBounds(378, 95, 89, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Bank A/cNo:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_8.setBounds(395, 132, 69, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Name of the Bank:");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_9.setBounds(359, 163, 99, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("No of Payable Days:");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_10.setBounds(359, 191, 105, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("LOP Days:");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_11.setBounds(409, 221, 57, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_1 = new JLabel("Allowances Amount");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(52, 246, 168, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_12 = new JLabel("Deductions Amount");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_12.setBounds(378, 246, 156, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel conveyLabel = new JLabel("Conveyance:");
		conveyLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		conveyLabel.setBounds(84, 275, 69, 14);
		contentPane.add(conveyLabel);
		
		JLabel HRANewLabel = new JLabel("House Rent Allowances:");
		HRANewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		HRANewLabel.setBounds(23, 303, 130, 14);
		contentPane.add(HRANewLabel);
		
		JLabel lblNewLabel_15 = new JLabel("LOP:");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_15.setBounds(433, 271, 31, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblEpf = new JLabel("EPF:");
		lblEpf.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEpf.setBounds(433, 303, 31, 14);
		contentPane.add(lblEpf);
		
		JLabel NetpayLabel = new JLabel("NET PAY:");
		NetpayLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		NetpayLabel.setBounds(93, 364, 57, 14);
		contentPane.add(NetpayLabel);
		
		JLabel lblNewLabel_16 = new JLabel("This is System Generated!!!!");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_16.setBounds(236, 403, 197, 14);
		contentPane.add(lblNewLabel_16);
		
		employeeidLabel = new JLabel("");
		employeeidLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		employeeidLabel.setBounds(150, 95, 111, 17);
		contentPane.add(employeeidLabel);
		
		JLabel departmentabel = new JLabel("");
		departmentabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		departmentabel.setBounds(146, 135, 115, 17);
		contentPane.add(departmentabel);
		
		JLabel dateofbirthLabel = new JLabel("");
		dateofbirthLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		dateofbirthLabel.setBounds(150, 163, 111, 20);
		contentPane.add(dateofbirthLabel);
		
		JLabel genderLabel = new JLabel("");
		genderLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		genderLabel.setBounds(146, 188, 115, 24);
		contentPane.add(genderLabel);
		
		JLabel conveyanceLabel = new JLabel("");
		conveyanceLabel.setBounds(150, 275, 107, 17);
		contentPane.add(conveyanceLabel);
		
		JLabel houseLabel = new JLabel("");
		houseLabel.setBounds(150, 303, 111, 17);
		contentPane.add(houseLabel);
		
		JLabel netpayLabel = new JLabel("");
		netpayLabel.setBounds(150, 364, 111, 20);
		contentPane.add(netpayLabel);
		
		JLabel EnameLabel = new JLabel("");
		EnameLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		EnameLabel.setBounds(465, 88, 132, 24);
		contentPane.add(EnameLabel);
		
		JLabel accnolabel = new JLabel("");
		accnolabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		accnolabel.setBounds(465, 132, 132, 17);
		contentPane.add(accnolabel);
		
		JLabel banknamelabel = new JLabel("");
		banknamelabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		banknamelabel.setBounds(465, 159, 132, 18);
		contentPane.add(banknamelabel);
		
		JLabel payabledayslabel = new JLabel("");
		payabledayslabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		payabledayslabel.setBounds(465, 188, 132, 17);
		contentPane.add(payabledayslabel);
		
		JLabel lopdayslabel = new JLabel("");
		lopdayslabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lopdayslabel.setBounds(467, 215, 132, 20);
		contentPane.add(lopdayslabel);
		
		JLabel lopdeductonlabel = new JLabel("");
		lopdeductonlabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lopdeductonlabel.setBounds(467, 271, 132, 14);
		contentPane.add(lopdeductonlabel);
		
		JLabel epflabel = new JLabel("");
		epflabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		epflabel.setBounds(465, 303, 132, 14);
		contentPane.add(epflabel);
		
		JLabel lblNewLabel_2 = new JLabel("Location:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(90, 221, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel locationLabel = new JLabel("");
		locationLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		locationLabel.setBounds(146, 221, 130, 24);
		contentPane.add(locationLabel);
		
		JLabel lblNewLabel_3 = new JLabel("BasicPay:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(93, 332, 53, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel Basiclabel = new JLabel("");
		Basiclabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Basiclabel.setBounds(150, 332, 89, 14);
		contentPane.add(Basiclabel);
		
		JLabel wordsLabel = new JLabel("");
		wordsLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		wordsLabel.setBounds(140, 389, 324, 28);
		contentPane.add(wordsLabel);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employeemenu s2 = new Employeemenu();
				dispose();
			}
		});
		backButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backButton.setBounds(76, 400, 89, 43);
		contentPane.add(backButton);
	

	setVisible(true);
		
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String statement="select * from employees";
	PreparedStatement p_stmt=cn.prepareStatement(statement);
	ResultSet rs=p_stmt.executeQuery();
	while(rs.next()) {
		//employeeidLabel.setText(rs.getString(1));
		//dateofbirthLabel.setText(rs.getString(3));
		java.lang.String employeeidLab=rs.getString("employeeId");
		employeeidLabel.setText(employeeidLab);
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
	//employeeidLabel.setText(rs.getString(1));
	//dateofbirthLabel.setText(rs.getString(3));
	java.lang.String dobLabe=rs.getString("DateofBirth");
	dateofbirthLabel.setText(dobLabe);
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
	
	java.lang.String Gender=rs.getString("Gender");
	genderLabel.setText(Gender);
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
	
	java.lang.String Ename=rs.getString("EmployeeName");
	EnameLabel.setText(Ename);
}
}
catch(Exception e) {
	System.out.println(e);
}
	
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection cn = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
String statement="select * from banks";
PreparedStatement p_stmt=cn.prepareStatement(statement);
ResultSet rs=p_stmt.executeQuery();
while(rs.next()) {
	
	java.lang.String Ename=rs.getString("bankname");
	banknamelabel.setText(Ename);
}
}
catch(Exception e) {
	System.out.println(e);
}
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection cn = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
String statement="select * from banks";
PreparedStatement p_stmt=cn.prepareStatement(statement);
ResultSet rs=p_stmt.executeQuery();
while(rs.next()) {
	
	java.lang.String Ename=rs.getString("bankacno");
	accnolabel.setText(Ename);
}
}
catch(Exception e) {
	System.out.println(e);
}
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection cn = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
String statement="select * from departments";
PreparedStatement p_stmt=cn.prepareStatement(statement);
ResultSet rs=p_stmt.executeQuery();
while(rs.next()) {
	
	java.lang.String did=rs.getString("department_id");
	departmentabel.setText(did);
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
	
	java.lang.String city=rs.getString("City");
	locationLabel.setText(city);
}
}
catch(Exception e) {
	System.out.println(e);
}
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection cn = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
String statement="select * from attendence";
PreparedStatement p_stmt=cn.prepareStatement(statement);
ResultSet rs=p_stmt.executeQuery();
while(rs.next()) {
	
	java.lang.String city=rs.getString("days");
	payabledayslabel.setText(city);
}
}
catch(Exception e) {
	System.out.println(e);
}
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection cn = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
String statement="select * from attendence";
PreparedStatement p_stmt=cn.prepareStatement(statement);
ResultSet rs=p_stmt.executeQuery();
while(rs.next()) {
	
	java.lang.String city=rs.getString("lop");
	lopdayslabel.setText(city);
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
	
	java.lang.String city=rs.getString("Basicpay");
	Basiclabel.setText(city);
}
}
catch(Exception e) {
	System.out.println(e);
}
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection cn = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
String statement="select * from salary";
PreparedStatement p_stmt=cn.prepareStatement(statement);
ResultSet rs=p_stmt.executeQuery();
while(rs.next()) {
	
	java.lang.String city=rs.getString("Allowancesamount1");
	conveyanceLabel.setText(city);
}
}
catch(Exception e) {
	System.out.println(e);
}
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection cn = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
String statement="select * from salary";
PreparedStatement p_stmt=cn.prepareStatement(statement);
ResultSet rs=p_stmt.executeQuery();
while(rs.next()) {
	
	java.lang.String city=rs.getString("Allowancesamount2");
	houseLabel.setText(city);
}
}
catch(Exception e) {
	System.out.println(e);
}
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection cn = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
String statement="select * from deductions";
PreparedStatement p_stmt=cn.prepareStatement(statement);
ResultSet rs=p_stmt.executeQuery();
while(rs.next()) {
	
	java.lang.String city=rs.getString("deductionamount1");
	lopdeductonlabel.setText(city);
}
}
catch(Exception e) {
	System.out.println(e);
}
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection cn = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
String statement="select * from deductions";
PreparedStatement p_stmt=cn.prepareStatement(statement);
ResultSet rs=p_stmt.executeQuery();
while(rs.next()) {
	
	java.lang.String city=rs.getString("deductionamount2");
	epflabel.setText(city);
}
}
catch(Exception e) {
	System.out.println(e);
}
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection cn = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
String statement="select * from salary";
PreparedStatement p_stmt=cn.prepareStatement(statement);
ResultSet rs=p_stmt.executeQuery();
while(rs.next()) {
	
	java.lang.String city=rs.getString("Totalsalary");
	netpayLabel.setText(city);
}
}
catch(Exception e) {
	System.out.println(e);
}
	}
	
	
		public static void main(String[] args) {
			 new EmployeeViewSalary();
		}
}


