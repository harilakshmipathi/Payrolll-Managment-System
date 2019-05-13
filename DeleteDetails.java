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

public class DeleteDetails extends JFrame {

	private JPanel contentPane;
	private JTextField employeetextField;

	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteDetails frame = new DeleteDetails();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}

	/**
	 * Create the frame.
	 */
	public DeleteDetails() {
		setTitle("National AutoPlast");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 377);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel deleteLabel = new JLabel("Delete Employees Details");
		deleteLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		deleteLabel.setBounds(219, 21, 264, 37);
		contentPane.add(deleteLabel);
		
		JLabel lblNewLabel = new JLabel("Employeeid:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(197, 114, 96, 30);
		contentPane.add(lblNewLabel);
		
		JTextField textemployee = new JTextField();
		textemployee.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textemployee.setBounds(297, 116, 186, 30);
		contentPane.add(textemployee);
		textemployee.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(204, 222, 89, 37);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection cn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
					 
					String Query="DELETE FROM employees WHERE EmployeeId= ?";

					PreparedStatement st = cn.prepareStatement(Query);
		         
		           st.setInt(1, Integer.parseInt(textemployee.getText()));
		          	st.executeUpdate();
		          
				JOptionPane.showMessageDialog(null, "Deleted Successfully");
				
	
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
		cancelButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		cancelButton.setBounds(433, 222, 89, 37);
		contentPane.add(cancelButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(316, 222, 89, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel imageLabel = new JLabel("");
		Image Img11 = new ImageIcon(this.getClass().getResource("/dele.png")).getImage();
		imageLabel.setIcon(new ImageIcon(Img11));
		imageLabel.setBounds(10, 58, 177, 201);
		contentPane.add(imageLabel);
		
		JLabel lblNewLabel_2 = new JLabel("----------------------------------------------------------");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(207, 297, 290, 14);
		contentPane.add(lblNewLabel_2);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		setVisible(true);
	}
		public static void main(String[] args) {
			new DeleteDetails();
		
	}
}
