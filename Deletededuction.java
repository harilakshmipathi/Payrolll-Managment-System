package payroll;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Deletededuction extends JFrame {

	private JPanel contentPane;
	private JTextField deductionsidtext;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deletedeductions frame = new Deletedeductions();
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
	public Deletededuction() {
		setTitle("National AutoPlast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 425);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Deductions Details");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(191, 11, 292, 20);
		contentPane.add(lblNewLabel);
		
		JLabel deductionsLabel = new JLabel("DeductionsId:");
		deductionsLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		deductionsLabel.setBounds(217, 100, 117, 20);
		contentPane.add(deductionsLabel);
		
		JTextField	textdeductionsid = new JTextField();
		textdeductionsid.setBounds(318, 131, 167, 28);
		contentPane.add(textdeductionsid);
		textdeductionsid.setColumns(10);
		
		JButton deleteButton = new JButton("Delete");
		deleteButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		deleteButton.setBounds(230, 256, 89, 38);
		contentPane.add(deleteButton);
		
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection cn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
					 
					String Query="DELETE FROM deductions WHERE deductionsid= ?";

					PreparedStatement st = cn.prepareStatement(Query);
		         
		           st.setInt(1, Integer.parseInt(textdeductionsid.getText()));
		          	int cnt =st.executeUpdate();
		          
		        
					
					if(cnt>0)
					{
						JOptionPane.showMessageDialog(null, "Deleted sucessfully..");
						//dispose();
					
					
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Data is not found..?..");
					}
				
				cn.close();//
			}
			catch(SQLException s) { 
			System.out.println(s);
			} 
			catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}

		}  
		});
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cancelButton.setBounds(439, 256, 89, 38);
		contentPane.add(cancelButton);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu del = new AdminMenu();
			}
			
		});
		backButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		backButton.setBounds(329, 256, 89, 38);
		contentPane.add(backButton);
		
		JLabel lblNewLabel_1 = new JLabel("---------------------------------------------------");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(235, 339, 261, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel imageabel_2 = new JLabel("");
		Image Img11 = new ImageIcon(this.getClass().getResource("/dele.png")).getImage();
		imageabel_2.setIcon(new ImageIcon(Img11));
		imageabel_2.setBounds(23, 65, 182, 229);
		contentPane.add(imageabel_2);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
			
		});
		setVisible(true);
	}
		public static void main(String[] args) {
			new Deletededuction();
			
		}
	}


