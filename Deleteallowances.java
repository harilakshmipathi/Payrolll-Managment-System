package payroll;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Deleteallowances extends JFrame {

	private JPanel contentPane;
	private JTextField AllowancestextField;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deleteallowances frame = new Deleteallowances();
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
	public Deleteallowances() {
		setTitle("National AutoPlast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 394);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel deleteLabel = new JLabel("Delete Allowances Details");
		deleteLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		deleteLabel.setBounds(203, 24, 267, 20);
		contentPane.add(deleteLabel);
		
		JTextField	textAllowances = new JTextField();
		textAllowances.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textAllowances.setBounds(310, 155, 175, 34);
		contentPane.add(textAllowances);
		textAllowances.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("AllowaancesId:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(208, 130, 126, 14);
		contentPane.add(lblNewLabel);
		
		JButton deleteButton = new JButton("Delete");
		deleteButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		deleteButton.setBounds(211, 274, 89, 34);
		contentPane.add(deleteButton);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection cn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
					 
					String Query="DELETE FROM allowances WHERE allowancesid= ?";

					PreparedStatement st = cn.prepareStatement(Query);
		         
		           st.setInt(1, Integer.parseInt(textAllowances.getText()));
		          	st.executeUpdate();
		          
				JOptionPane.showMessageDialog(null, "Deleted Successfully");
				
				 {
					JOptionPane.showMessageDialog(null, "is not deleted");
					
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
		cancelButton.setBounds(418, 274, 89, 34);
		contentPane.add(cancelButton);
		
		JLabel lblNewLabel_1 = new JLabel("-----------------------------------------------");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(271, 331, 199, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton backButton = new JButton("Back");
		backButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		backButton.setBounds(310, 274, 89, 34);
		contentPane.add(backButton);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu delette = new AdminMenu();
				
			}
		});
		JLabel imageLabel = new JLabel("");
		Image Img11 = new ImageIcon(this.getClass().getResource("/dele.png")).getImage();
		imageLabel.setIcon(new ImageIcon(Img11));
		imageLabel.setBounds(23, 54, 175, 220);
		contentPane.add(imageLabel);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		setVisible(true);
	}
		
		public static void main(String[] args) {
			 new Deleteallowances();
	}
}
