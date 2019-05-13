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

public class Deletesalary extends JFrame {

	private JPanel contentPane;
	private JTextField salarytext;

	/**
	 * Launch the application.
	 */
 /*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deletesalary frame = new Deletesalary();
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
	public Deletesalary() {
		setTitle("National AutoPlast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 386);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel salaryLabel = new JLabel("Delete Salary  Details");
		salaryLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		salaryLabel.setBounds(207, 28, 234, 24);
		contentPane.add(salaryLabel);
		
		JTextField	salarytext = new JTextField();
		salarytext.setFont(new Font("Times New Roman", Font.BOLD, 15));
		salarytext.setBounds(273, 114, 156, 31);
		contentPane.add(salarytext);
		salarytext.setColumns(10);
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		DeleteButton.setBounds(178, 263, 89, 31);
		contentPane.add(DeleteButton);
		
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection cn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
					 
					String Query="DELETE FROM salary WHERE salaryid= ?";

					PreparedStatement st = cn.prepareStatement(Query);
		         
		           st.setInt(1, Integer.parseInt(salarytext.getText()));
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
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		CancelButton.setBounds(384, 263, 89, 31);
		contentPane.add(CancelButton);
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		JLabel lblNewLabel = new JLabel("Salaryid:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(199, 119, 73, 19);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(277, 264, 89, 28);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("------------------------------------------------");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(184, 323, 245, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel imageLabel = new JLabel("");
		Image Img11 = new ImageIcon(this.getClass().getResource("/dele.png")).getImage();
		imageLabel.setIcon(new ImageIcon(Img11));
		imageLabel.setBounds(28, 59, 149, 187);
		contentPane.add(imageLabel);
		
		setVisible(true);
	}
	
		public static void main(String[] args) {
			 new Deletesalary();
		}
	}


