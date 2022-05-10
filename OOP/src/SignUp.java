import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField email;
	private JTextField mobile;
	private JTextField Dob;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(17, 17, 555, 596);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCreateAccount = new JLabel("Create account");
		lblCreateAccount.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateAccount.setBounds(84, 17, 374, 39);
		panel.add(lblCreateAccount);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblName.setBounds(13, 56, 91, 39);
		panel.add(lblName);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEmail.setBounds(13, 126, 91, 39);
		panel.add(lblEmail);
		
		JLabel lblMobile = new JLabel("Mobile:");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblMobile.setBounds(13, 212, 91, 39);
		panel.add(lblMobile);
		
		JLabel lblBirthDate = new JLabel("Birth Date:");
		lblBirthDate.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblBirthDate.setBounds(13, 284, 121, 39);
		panel.add(lblBirthDate);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblUsername.setBounds(13, 361, 121, 39);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblPassword.setBounds(13, 443, 121, 39);
		panel.add(lblPassword);
		
		name = new JTextField();
		name.setBounds(55, 96, 427, 34);
		panel.add(name);
		name.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(55, 177, 427, 34);
		panel.add(email);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(55, 252, 427, 34);
		panel.add(mobile);
		
		Dob = new JTextField();
		Dob.setColumns(10);
		Dob.setBounds(55, 330, 427, 34);
		panel.add(Dob);

		

		
			
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(55, 403, 427, 34);
		panel.add(username);
		
		password = new JPasswordField();
		password.setBounds(55, 490, 427, 39);
		panel.add(password);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String birthDate = Dob.getText();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
				LocalDate dob = LocalDate.parse(birthDate,formatter);
			
				
			
			
				String accType = "user";
				String Username = username.getText();
				String Password = password.getText();
				String Phone = mobile.getText();
				String Email = email.getText();
				String Name =name.getText();
				
				
				try{
					Account account = new Account(name.getText(), dob ,username.getText(),password.getText(),email.getText(),mobile.getText());
					LocalDate dateCreated = account.getDateCreated();
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/MovieDatabase", "root","");
					Statement stmt = con.createStatement();
					String sql = "INSERT INTO account (username,password,name,email,phone,accType,DoB,dateCreated) VALUES ('"+Username+"', '"+Password+"', '"+Name+"', '"+Email+"', '"+Phone+"', '"+accType+"', '"+dob+"', '"+dateCreated+"')";
					PreparedStatement create = con.prepareStatement(sql);
					create.executeUpdate(sql);
					//stmt.executeQuery(sql);
					java.sql.ResultSet rs;
			        rs = stmt.executeQuery("Select LAST_INSERT_ID() from stock limit 1");                
			        rs.next(); 
					con.close();
					
					HomePage homePage = new HomePage();
				    homePage.show();
				}
				catch(SQLException e){
					JOptionPane.showMessageDialog(null,e);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,e1);
				}
				

			}
		});
		btnSignUp.setBackground(SystemColor.activeCaption);
		btnSignUp.setForeground(Color.DARK_GRAY);
		btnSignUp.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnSignUp.setBounds(173, 545, 197, 47);
		panel.add(btnSignUp);
		
		JLabel label = new JLabel("<");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				SignIn signin = new SignIn();
				signin.show();
				
				dispose();
			}
		});
		label.setForeground(Color.BLACK);
		label.setBounds(13, 0, 138, 39);
		panel.add(label);
	}
}
