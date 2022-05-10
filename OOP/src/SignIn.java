import java.awt.BorderLayout;

import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    SignIn frame = new SignIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 794);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(325, 141, 89, 44);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(223, 264, 147, 21);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		contentPane.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBounds(233, 303, 208, 44);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(223, 380, 161, 27);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(315, 494, 136, 44);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/MovieDatabase", "root","");
					Statement stmt = con.createStatement();
					String sql = "Select * from account where username='"+username.getText()+"'and password='"+password.getText().toString()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next())
					{
						HomePage homePage = new HomePage();
					    homePage.show();
						
						dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Incorrect username and Password...");
					con.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(btnNewButton);
		
		password = new JPasswordField();
		password.setBounds(233, 417, 218, 44);
		contentPane.add(password);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 192, 693);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Program Files\\Java\\jre1.8.0_321\\bin\\movie.png"));
		lblNewLabel_3.setBounds(23, 33, 138, 627);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewToMovie = new JLabel("create a new account? SIGN UP now");
		lblNewToMovie.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				SignUp signup = new SignUp();
				signup.show();
				
				dispose();
			}
		});
		lblNewToMovie.setForeground(Color.GRAY);
		lblNewToMovie.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblNewToMovie.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewToMovie.setBounds(191, 559, 399, 39);
		contentPane.add(lblNewToMovie);
	}
}
