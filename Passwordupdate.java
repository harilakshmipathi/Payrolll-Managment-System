package payroll;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Passwordupdate extends JFrame {

	private JPanel contentPane;
	private JTextField Oldtext;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passwordupdate frame = new Passwordupdate();
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
	public Passwordupdate() {
		setTitle("Payrol Managemnt System");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 386);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel headingLabel = new JLabel("Create a New Password");
		headingLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		headingLabel.setBounds(166, 34, 220, 14);
		contentPane.add(headingLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(144, 119, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		Oldtext = new JTextField();
		Oldtext.setBounds(262, 92, 109, 20);
		contentPane.add(Oldtext);
		Oldtext.setColumns(10);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UpdateButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		UpdateButton.setBounds(135, 270, 89, 38);
		contentPane.add(UpdateButton);
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		CancelButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		CancelButton.setBounds(262, 270, 89, 38);
		contentPane.add(CancelButton);
		
		JLabel lblNewLabel_2 = new JLabel("Old Password:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(166, 98, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel Newopasword = new JLabel("New Password:");
		Newopasword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Newopasword.setBounds(166, 143, 100, 14);
		contentPane.add(Newopasword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(262, 141, 109, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

}
