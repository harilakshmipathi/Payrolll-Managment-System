package payroll;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Employeemenu {

	private JFrame frmPayrollManagementSystem;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeemenu window = new Employeemenu();
					window.frmPayrollManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employeemenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPayrollManagementSystem = new JFrame();
		frmPayrollManagementSystem.setTitle("National AutoPlast");
		frmPayrollManagementSystem.getContentPane().setBackground(Color.WHITE);
		frmPayrollManagementSystem.setBounds(100, 100, 816, 462);
		frmPayrollManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmPayrollManagementSystem.setJMenuBar(menuBar);
		
		JMenu mnEmployeeMenu = new JMenu("Employee Menu");
		menuBar.add(mnEmployeeMenu);
		
		JMenu mnUpadateDetails = new JMenu("Upadate details");
		mnEmployeeMenu.add(mnUpadateDetails);
		
		JMenuItem mntmMoileNo = new JMenuItem("Moile no");
		mntmMoileNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Updatemobile details = new  Updatemobile();
			}
		}); 
		mnUpadateDetails.add(mntmMoileNo);
		
		JMenuItem mntmAddress = new JMenuItem("Address");
		mntmAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Addressupdate details = new Addressupdate();
			}
		});
		mnUpadateDetails.add(mntmAddress);
		
		JMenu mnSalary = new JMenu("PaySlip");
		mnEmployeeMenu.add(mnSalary);
		JMenuItem mntmView = new JMenuItem("View PaySlip");
		mnSalary.add(mntmView);
		mntmView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeViewSalary slip = new EmployeeViewSalary();
				frmPayrollManagementSystem.dispose();
				
			}
		});
		frmPayrollManagementSystem.setVisible(true);
	}

	
	public static void main(String[] args) {
			
			 new Employeemenu();
			
		}
	}

	
