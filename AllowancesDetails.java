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

public class AllowancesDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textAllowancesId;
	private JTextField textHouseRentAllowances;
	private JTextField textField_3;
	JComboBox AtypecomboBox;
	JComboBox A2typecomboBox;
	JLabel imageLabel;
	/**
	 * Launch the application.
	 */

	public AllowancesDetails() {
		setTitle("National AutPlast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 451);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Allowances Page");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(249, 11, 185, 43);
		contentPane.add(lblNewLabel);
		
		JLabel Ay1Label = new JLabel("Allowances Type1:");
		Ay1Label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Ay1Label.setBounds(249, 79, 151, 19);
		contentPane.add(Ay1Label);
		
		JLabel AM1Label = new JLabel("Allowances Amount1:");
		AM1Label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AM1Label.setBounds(230, 127, 170, 20);
		contentPane.add(AM1Label);
		

		JTextField	textAMT1 = new JTextField();
		textAMT1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textAMT1.setBounds(400, 124, 219, 30);
		contentPane.add(textAMT1);
		textAMT1.setColumns(10);
	
		
		JLabel lblNewLabel_5 = new JLabel("----------------------------------------------------");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(303, 353, 268, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton InsertButton = new JButton("Insert");
		InsertButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		InsertButton.setBounds(255, 284, 89, 37);
		contentPane.add(InsertButton);
		InsertButton.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e)
				{
				  
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection cn = DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:orcl", "payrollmgmt", "project");
						String Query = "Insert into Allowances(Allowancesid,Allowancestype1,Allowancestype2,"
								+ "Allowancesamount1,Allowancesamount2)values(allow.nextval,?,?,?,?)";
								
	 					PreparedStatement st = cn.prepareStatement(Query);
	 				  	st.setString(1, (String) AtypecomboBox.getSelectedItem());
	 				 	st.setString(2, (String) A2typecomboBox.getSelectedItem());
	 				 	st.setInt(3, Integer.parseInt(textAMT1.getText()));
						st.setInt(4, Integer.parseInt(textAMT1.getText()));
					
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
		
		 
	    imageLabel = new JLabel("");
	    Image Img11 = new ImageIcon(this.getClass().getResource("/all.png")).getImage();
		imageLabel.setIcon(new ImageIcon(Img11));
		imageLabel.setBounds(10, 54, 210, 221);
		contentPane.add(imageLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(58, 107, 46, 14);
		contentPane.add(lblNewLabel_2);
		
	     AtypecomboBox = new JComboBox();
	     AtypecomboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		AtypecomboBox.setBounds(400, 79, 218, 20);
		AtypecomboBox.addItem("HRA");
		AtypecomboBox.addItem("Bonus");
		contentPane.add(AtypecomboBox);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cancelButton.setBounds(375, 284, 89, 37);
		contentPane.add(cancelButton);
		
		JLabel A2typeLabel = new JLabel("Allowances Type2:");
		A2typeLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		A2typeLabel.setBounds(251, 167, 149, 19);
		contentPane.add(A2typeLabel);
		
		 A2typecomboBox = new JComboBox();
		A2typecomboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		A2typecomboBox.setBounds(400, 168, 219, 20);
		A2typecomboBox.addItem("Conveyance");
		A2typecomboBox.addItem("HRA");
		contentPane.add(A2typecomboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Allowances Amount2:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(230, 210, 170, 14);
		contentPane.add(lblNewLabel_3);
		
		JTextField	textamt2 = new JTextField();
		textamt2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textamt2.setColumns(10);
		textamt2.setBounds(400, 209, 219, 30);
		contentPane.add(textamt2);
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu s2 = new AdminMenu();
			}
		});
		BackButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BackButton.setBounds(495, 284, 89, 37);
		contentPane.add(BackButton);
		
		
		cancelButton.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    	    dispose();
	    		}
	    	});
	         setVisible(true);
	}
  public static void main(String[] args) {
	  new AllowancesDetails();
			}
			}

	
