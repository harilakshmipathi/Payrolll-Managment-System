package payroll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class AdminMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	public AdminMenu() {
		setTitle("National AutoPlast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 485);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAdminMenu = new JMenu("Admin Menu");
		menuBar.add(mnAdminMenu);
		
		JMenu mnEmployees = new JMenu("Employees");
		mnAdminMenu.add(mnEmployees);
		
		JMenuItem mntmAdd = new JMenuItem("Insert");
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertDetailsEmployee details= new InsertDetailsEmployee();
			}
		});
		mnEmployees.add(mntmAdd);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mntmDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteDetails employee=new DeleteDetails();
			}
		});
		mnEmployees.add(mntmDelete);
		JMenu mnAllowances = new JMenu("Allowances");
		mnAdminMenu.add(mnAllowances);
		
		JMenuItem mntmAdd_1 = new JMenuItem("Insert");
		mntmAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AllowancesDetails adetails =new AllowancesDetails();
			}
			
		});
		mnAllowances.add(mntmAdd_1);
		
		JMenuItem mntmDelete_1 = new JMenuItem("Delete");
		mntmDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deleteallowances details =new Deleteallowances();
				
			}
		});
		mnAllowances.add(mntmDelete_1);
		
		JMenu mnDeductions = new JMenu("Deductions");
		mnAdminMenu.add(mnDeductions);
		
		JMenuItem mntmAdd_2 = new JMenuItem("Insert");
		mntmAdd_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeductionsDetails deduction=new DeductionsDetails(); 
				
			}
		});
		mnDeductions.add(mntmAdd_2);
		
		JMenuItem mntmDelete_2 = new JMenuItem("Delete");
		mntmDelete_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Deletededuction d = new Deletededuction();				
			}
		});
		mnDeductions.add(mntmDelete_2);
		
		JMenu mnSalary = new JMenu("Salary");
		mnAdminMenu.add(mnSalary);
		
		JMenuItem mntmInsert = new JMenuItem("Insert");
		mntmInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryDetails detail=new SalaryDetails();
			}
		});
			
		mnSalary.add(mntmInsert);
		
		JMenuItem mntmDelete_4 = new JMenuItem("Delete");
		mntmDelete_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deletesalary detail =new Deletesalary();
			}
		});
		mnSalary.add(mntmDelete_4);
		
		JMenu mnReports = new JMenu("Reports");
		mnAdminMenu.add(mnReports);
		
		JMenuItem mntmViewEmployeeReports = new JMenuItem("View Salary Reports ");
		mntmViewEmployeeReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAdmminSalary slip = new ViewAdmminSalary();
			}
		});
		mnReports.add(mntmViewEmployeeReports);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	  setVisible(true);
	}
	  public static void main(String[] args) {
		 new AdminMenu();
}
	}
