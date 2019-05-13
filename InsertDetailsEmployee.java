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
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import org.jdesktop.swingx.JXDatePicker;

public class InsertDetailsEmployee extends JFrame {
    static int Alert=0;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	 JComboBox CitycomboBox ;
	 JComboBox nationalityComboBox;
	 JComboBox deptcBox ;
	 private JTextField passwordtextField;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertDetailseEmployee frame = new InsertDetailseEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
/**
	 * Create the frame.
	 */
	public InsertDetailsEmployee() {
	setResizable(false);
	setFont(new Font("Times New Roman", Font.BOLD, 14));
	setTitle("National AutoPlast");
	CitycomboBox= new JComboBox();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 506);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel enameLabel = new JLabel("Employee Name:");
		enameLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		enameLabel.setBounds(42, 68, 112, 14);
		contentPane.add(enameLabel);
		
		JLabel dobLabel = new JLabel("  Date of Birth:");
		dobLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		dobLabel.setBounds(56, 117, 98, 14);
		contentPane.add(dobLabel);
		
		JLabel genderLabel = new JLabel("Gender:");
		genderLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		genderLabel.setBounds(94, 160, 60, 14);
		contentPane.add(genderLabel);
		
		JLabel nationalityLabel = new JLabel("Nationality:");
		nationalityLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		nationalityLabel.setBounds(66, 311, 82, 14);
		contentPane.add(nationalityLabel);
		
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		addressLabel.setBounds(88, 261, 60, 14);
		contentPane.add(addressLabel);

		
		JLabel lblEmployeeRegistration = new JLabel("Employee Page");
		lblEmployeeRegistration.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblEmployeeRegistration.setBounds(296, 11, 215, 38);
		contentPane.add(lblEmployeeRegistration);
		
		JLabel CityLabel = new JLabel("City:");
		CityLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		CityLabel.setBounds(454, 68, 38, 14);
		contentPane.add(CityLabel);
		
		JLabel mobileLabel = new JLabel("Mobile no:");
		mobileLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mobileLabel.setBounds(420, 117, 72, 14);
		contentPane.add(mobileLabel);
		
		JLabel emailLabel = new JLabel("Email_Id:");
		emailLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		emailLabel.setBounds(428, 160, 64, 14);
		contentPane.add(emailLabel);
		
		JLabel EmercontactNewLabel = new JLabel("Emergency Contact:");
		EmercontactNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		EmercontactNewLabel.setBounds(358, 206, 134, 30);
		contentPane.add(EmercontactNewLabel);
		
		JLabel departLabel = new JLabel("Department Id:");
		departLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		departLabel.setBounds(386, 261, 106, 14);
		contentPane.add(departLabel);
		
		JRadioButton maleRadioButton = new JRadioButton("Male");
		maleRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		maleRadioButton.setBounds(148, 157, 62, 23);
		contentPane.add(maleRadioButton);
		
		
		JRadioButton femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		femaleRadioButton.setBounds(212, 156, 83, 23);
		contentPane.add(femaleRadioButton);
		
		JTextField textEmployeeName = new JTextField();
		textEmployeeName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textEmployeeName.setBounds(156, 65, 195, 23);
		contentPane.add(textEmployeeName);
		textEmployeeName.setColumns(10);
		
		JXDatePicker picker = new JXDatePicker();
		picker.getEditor().setHorizontalAlignment(SwingConstants.LEFT);
		picker.getEditor().setFont(new Font("Times New Roman", Font.BOLD, 15));
		picker.getEditor().setColumns(10);
		picker.setDate(Calendar.getInstance().getTime());
		picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
		picker.setBounds(156,111,195, 25);
		contentPane.add(picker);
		
		JTextField	txtAddress = new JTextField();
		txtAddress.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAddress.setBounds(148, 257, 203, 25);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		JTextField	textMobileno = new JTextField();
		textMobileno.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textMobileno.setBounds(493, 113, 226, 25);
		contentPane.add(textMobileno);
		textMobileno.setColumns(10);
		
		JTextField	textEmail_Id = new JTextField();
		textEmail_Id.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textEmail_Id.setBounds(493, 155, 226, 25);
		contentPane.add(textEmail_Id);
		textEmail_Id.setColumns(10);
		
		JTextField textEmergencycontact = new JTextField();
		textEmergencycontact.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textEmergencycontact.setBounds(493, 209, 226, 25);
		contentPane.add(textEmergencycontact);
		textEmergencycontact.setColumns(10);
		
		JRadioButton otherRadioButton = new JRadioButton("Others");
		otherRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		otherRadioButton.setBounds(148, 181, 109, 23);
		contentPane.add(otherRadioButton);
		ButtonGroup bg = new ButtonGroup();
    	bg.add(maleRadioButton);
	    bg.add(femaleRadioButton);
	    bg.add(otherRadioButton);
		
		JLabel label = new JLabel("------------------------------------------------------------------");
		label.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label.setBounds(110, 428, 599, 29);
		contentPane.add(label);
		

	      JTextField   textbasicpay = new JTextField();
	      textbasicpay.setFont(new Font("Times New Roman", Font.BOLD, 14));
	      textbasicpay.setBounds(496, 306, 223, 25);
	      contentPane.add(textbasicpay);
	      textbasicpay.setColumns(10);
	      
	      JPasswordField   passwordtextField = new JPasswordField();
	      passwordtextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
	      passwordtextField.setBounds(148, 211, 203, 24);
	      contentPane.add(passwordtextField);
	      passwordtextField.setColumns(10);
	      
	      
	      JLabel basicpayLabel = new JLabel("Basicpay:");
	      basicpayLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
	      basicpayLabel.setBounds(428, 310, 64, 17);
	      contentPane.add(basicpayLabel);
		
		JButton insertButton = new JButton("Insert");
		insertButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		insertButton.setBounds(94, 379, 103, 38);
		contentPane.add(insertButton);
		insertButton.addActionListener(new ActionListener() {
			

				public void actionPerformed(ActionEvent e)
				{
					
					System.out.println("pay is" +textbasicpay.getText());
		boolean flag =false;
					System.out.println("before try");
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection cn = DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
					
						int count=textMobileno.getText().length();
						if(count!=10) {
							Alert=1;
							JOptionPane.showMessageDialog(null, "Can you check your mobile No?");
						}
						else {
							Alert=0;
							flag=true;
						}
						
						String emailchar=textEmail_Id.getText();
						
						if(emailchar.indexOf("@",0)<1) {
							JOptionPane.showMessageDialog(null, "Can you check your Email Address?");
							flag=false;
						}
						else {
							flag=true;
						}
						if(flag==true)
							
						{
						String Query = "Insert into employees(EmployeeId, EmployeeName, DateofBirth, Gender,"
								+ " Nationality,Address,City,Mobile,Emali_Id,DepartmentId,Basicpay,password,EmergencyContact)"
								+ "values(em.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
								
	 					PreparedStatement st = cn.prepareStatement(Query);
					
						st.setString(1, textEmployeeName.getText());
						java.util.Date d1 = picker.getDate();
						java.sql.Date d = new java.sql.Date(d1.getTime());
				   	st.setDate(2,d );                         
				   	if (maleRadioButton.isSelected())
						st.setString(3,"male");
				   	else if(femaleRadioButton.isSelected())
						st.setString(3,"female");
				   	else   
				   		st.setString(3,"other");
				   	    st.setString(4, (String) nationalityComboBox.getSelectedItem());
						st.setString(5,txtAddress.getText());
						st.setString(6,(String) CitycomboBox.getSelectedItem ());
						System.out.println(textMobileno.getText());
						//st.setFloat(7,  Float.parseFloat(textMobileno.getText()));
						st.setString(7,  textMobileno.getText());
						st.setString(8, textEmail_Id.getText());                                                 
						//st.setString(9, textEmergencycontact.getText()));
						
						System.out.println(deptcBox.getSelectedItem());
						
						String deptid =(String) deptcBox.getSelectedItem();
						System.out.println(deptid);
						int no = Integer.parseInt(deptid.substring(0, 2));
						System.out.println(no);
						st.setInt(9,no);
						System.out.println("before basic pay");
						
						System.out.println("pay is" +textbasicpay.getText());
						st.setInt(10, Integer.parseInt(textbasicpay.getText()));
						st.setString(11,passwordtextField.getText());
						st.setString(12, textEmergencycontact.getText());
						System.out.println("after basic pay");
						System.out.println(st.toString());
						
						int i =st.executeUpdate();
						if(i>0) {
					
						JOptionPane.showMessageDialog(null, "Insert Successfully");
						dispose();
						}else
						{
						JOptionPane.showMessageDialog(null, "data is incoreect");
							}
			
						cn.close();//
						}
						}
					catch(SQLException s) { 
					System.out.println(s);
					} 
					catch (ClassNotFoundException e1) {
						
						e1.printStackTrace();
					}
					
				}
 
					});
      JButton backbutton = new JButton("Back");
      backbutton.setFont(new Font("Times New Roman", Font.BOLD, 15));
      backbutton.setBounds(373, 379, 98, 38);
      contentPane.add(backbutton);
      
      nationalityComboBox = new JComboBox();
      nationalityComboBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
      nationalityComboBox.setBounds(148, 308, 203, 20);
      nationalityComboBox.addItem("Indian");
      contentPane.add(nationalityComboBox);
      
     
      CitycomboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
      CitycomboBox.setBounds(494, 65, 225, 20);
      CitycomboBox.addItem("Chennai");
      CitycomboBox.addItem("Madurai"); 
      CitycomboBox.addItem("Coimbatore"); 
      CitycomboBox.addItem("Tirchy");
      CitycomboBox.addItem("Dindigul");
      CitycomboBox.addItem("Salem");
      CitycomboBox.addItem("Palani");
      CitycomboBox.addItem("Pondichery");
      contentPane.add(CitycomboBox);
      
      JButton ResetButton = new JButton("Reset");
      ResetButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		textEmployeeName.setText("");    
      		txtAddress.setText("");
      		textMobileno.setText("");
      		textEmergencycontact.setText("");
      		textbasicpay.setText("");
      		textEmail_Id.setText("");
      		passwordtextField.setText("");
      	}
      });
      ResetButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
      ResetButton.setBounds(236, 378, 98, 38);
      contentPane.add(ResetButton);
      
      JButton CancelButton = new JButton("Cancel");
      CancelButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		dispose();
      	}
      });
      CancelButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
      CancelButton.setBounds(532, 379, 89, 38);
      contentPane.add(CancelButton);
      
      deptcBox = new JComboBox();
      deptcBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
      deptcBox.setBounds(493, 258, 227, 20);
      contentPane.add(deptcBox);
      
      JLabel passLabel = new JLabel(" Password:");
      passLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
      passLabel.setBounds(77, 214, 72, 14);
      contentPane.add(passLabel);
   
      backbutton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			AdminMenu s2 = new AdminMenu();
    			
    		}
    	});
      setVisible(true);
  	try {
  		System.out.println("in dept combo");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
	String statement="select * from departments";
	PreparedStatement p_stmt=cn.prepareStatement(statement);
	ResultSet rs=p_stmt.executeQuery();
	while(rs.next()) {
		String emp= rs.getInt("department_id") +" " + rs.getString("Departmentname");
		System.out.println(emp);
		deptcBox.addItem(emp);
	
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	}
    public static void main(String[] args) {
	new InsertDetailsEmployee();
}
}
