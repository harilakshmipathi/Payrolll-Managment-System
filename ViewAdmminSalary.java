package payroll;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAdmminSalary extends JFrame {

	private JPanel contentPane;
	JComboBox monthcBox;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton viewButton;
	private JButton btnBack;
	private JButton printButton;
	private JButton CanelButton;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSalary frame = new ViewSalary();
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
	public ViewAdmminSalary() {
		setForeground(Color.WHITE);
		setTitle("Payroll Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 494);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel salaryLabel = new JLabel("Salary Details");
		salaryLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		salaryLabel.setBounds(363, 11, 197, 30);
		contentPane.add(salaryLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 866, 300);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setRowHeaderView(table);
		String columnNames[] =  	{
 				"salaryid", "salarymonth", " basicpay","employeeid","Allowancestype1","AllowancesAmount1",
 				"Allowancestype2","AllowancesAmount2","Deductiontype1","DeductionAmount1","Deductiontype2","Deductiontype2","totalsalary"
 			};	
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
        table.setCellSelectionEnabled(true);
		table.setModel(model); 
		
		
		viewButton = new JButton("View");
		viewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		viewButton.setBounds(249, 392, 89, 30);
		contentPane.add(viewButton);
		viewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection cn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
					
					String sql = "select * from salary";
					
					PreparedStatement ps = cn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					int i=0;
					int salaryid= 0;
				    String salaryMonth="";
				    int BasicPay=0;
				    int Employeeid=0;
				    String Allowancestype1="";
				    int  AllowancesAmount1=0;
				    String  Allowancestype2="";
				    int AllowancesAmount2=0;
					 String Deductiontype1="";
					 int DeductionAmount1=0;
					 String Deductiontype2="";
					 int DeductionAmount2=0;
					 int totalsalary=0;
					 contentPane.add(table);
						
					while(rs.next())
					{
				
						salaryid = rs.getInt(1);
						salaryMonth = rs.getString(2);
						BasicPay = rs.getInt(3);
						Employeeid =rs.getInt(4);
						Allowancestype1 = rs.getString(5);
						AllowancesAmount1= rs.getInt(6);
						Allowancestype2 = rs.getString(7);
						AllowancesAmount2= rs.getInt(8);
						Deductiontype1 = rs.getString(9);
						DeductionAmount1= rs.getInt(10);
						Deductiontype2 = rs.getString(11);
						DeductionAmount2= rs.getInt(12);
						totalsalary =rs.getInt(13);
					//	System.out.println(salaryid);      
						model.addRow(new Object[]{salaryid,salaryMonth,BasicPay,Employeeid,Allowancestype1,AllowancesAmount1,Allowancestype2,AllowancesAmount2,
								Deductiontype1,DeductionAmount1,Deductiontype2,DeductionAmount2,totalsalary});
						scrollPane.setViewportView(table);

				}
					}
					catch(Exception e1)
					{
						
					}
				
			}
		});
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBack.setBounds(384, 392, 89, 30);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				AdminMenu se = new AdminMenu();
				dispose();
			}
		});
	
		
		printButton = new JButton("Print");
		printButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		printButton.setBounds(651, 392, 89, 30);
		contentPane.add(printButton);
		
		CanelButton = new JButton("Cancel");
		CanelButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		CanelButton.setBounds(517, 392, 89, 30);
		contentPane.add(CanelButton);
		CanelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		setVisible(true);
		}
	

		public static void main(String[] args) {
			new ViewAdmminSalary();
		}
	}
	

