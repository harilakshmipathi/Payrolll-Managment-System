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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class DeductionsDetails extends JFrame {

	private JPanel contentPane;
	
	JComboBox d1typecomboBox;
	JComboBox d2typecBox;


	
	/**
	 * Launch the application.
	 */
	/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeductionsDetails frame = new DeductionsDetails();
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
	public DeductionsDetails() {
		setTitle("National AutoPlast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 425);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel D2typeLabel = new JLabel("Deductions  Page");
		D2typeLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		D2typeLabel.setBounds(278, 11, 180, 38);
		contentPane.add(D2typeLabel);
		
		JLabel dtype1Label = new JLabel("Deduction Type1:");
		dtype1Label.setFont(new Font("Times New Roman", Font.BOLD, 17));
		dtype1Label.setBounds(271, 82, 134, 22);
		contentPane.add(dtype1Label);
		
		JLabel damountLabel = new JLabel("Deduction Amount1:");
		damountLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		damountLabel.setBounds(246, 133, 159, 14);
		contentPane.add(damountLabel);
		
		JTextField	d1amttext = new JTextField();
		d1amttext.setBounds(407, 132, 231, 32);
		contentPane.add(d1amttext);
		d1amttext.setColumns(10);
		
		JTextField	d2amttext = new JTextField();
		d2amttext.setColumns(10);
		d2amttext.setBounds(407, 216, 231, 32);
		contentPane.add(d2amttext);
		
		JLabel lblNewLabel_4 = new JLabel("-------------------------------------------------------------------------");
		lblNewLabel_4.setBounds(300, 339, 299, 14);
		contentPane.add(lblNewLabel_4);
		

		JButton InsertNewButton = new JButton("Insert");
		InsertNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		InsertNewButton.setBounds(290, 276, 89, 38);
		contentPane.add(InsertNewButton);
		InsertNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection cn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
					String Query = "Insert into deductions(deductionid,deddutiontype1,deductiontype2,deductionamount1,deductionamount2)"
							+ "values(ded.nextval,?,?,?,?)";
							
 					PreparedStatement st = cn.prepareStatement(Query);
 			
 					st.setString(1, (String) d1typecomboBox.getSelectedItem());
 					st.setString(2, (String) d2typecBox.getSelectedItem());
 					st.setInt(3, Integer.parseInt(d1amttext.getText()));
 					st.setInt(4, Integer.parseInt(	d2amttext.getText()));
 					
 					int i=st.executeUpdate();
					
					if(i>0) {
						
						JOptionPane.showMessageDialog(null, "Insert Successfully");
						}else
						{
								JOptionPane.showMessageDialog(null, "data is incoreect");
								
							}
			
		
					cn.close();
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
		
		JLabel imageLabel = new JLabel("");
		Image Img11 = new ImageIcon(this.getClass().getResource("/deductions.jpg")).getImage();
	    imageLabel.setIcon(new ImageIcon(Img11));
		imageLabel.setBounds(10, 43, 231, 234);
		contentPane.add(imageLabel);
		
        d1typecomboBox = new JComboBox();
		d1typecomboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		d1typecomboBox.setBounds(404, 84, 234, 20);
		d1typecomboBox.addItem("EPF");
		d1typecomboBox.addItem("PTax");
		d1typecomboBox.addItem("LOP ");
		contentPane.add(d1typecomboBox);
		
		JLabel d2abel = new JLabel("Deduction Type2:");
		d2abel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		d2abel.setBounds(264, 172, 141, 22);
		contentPane.add(d2abel);
		
		JLabel d2amtLabel = new JLabel("Deduction Amount2:");
		d2amtLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		d2amtLabel.setBounds(246, 229, 159, 14);
		contentPane.add(d2amtLabel);
		
	     d2typecBox = new JComboBox();
	     d2typecBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		d2typecBox.setBounds(407, 175, 231, 20);
		d2typecBox.addItem("LOP");
		d2typecBox.addItem("EPF");
		d2typecBox.addItem("ESI ");
		contentPane.add(d2typecBox);
		
		JButton BackButton = new JButton("Back");
		BackButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BackButton.setBounds(535, 276, 89, 38);
		contentPane.add(BackButton);
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu s2 = new AdminMenu();
			}
		});
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		CancelButton.setBounds(407, 276, 89, 38);
		contentPane.add(CancelButton);
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		setVisible(true);
	}
		public static void main(String[] args) {
			new DeductionsDetails();
		}
		}
	
