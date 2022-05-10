import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Image;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Northman extends JFrame {

	private JPanel contentPane;
	private JTextField UserRate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Northman frame = new Northman();
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
	public Northman() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 750);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 0, 727, 38);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("< Back");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				HomePage back = new HomePage();
				back.show();
				
				dispose();
			}
		});
		label.setBounds(31, 0, 138, 39);
		panel.add(label);
		
		JLabel poster = new JLabel("New label");
		poster.setIcon(new ImageIcon("C:\\Program Files\\Java\\jre1.8.0_321\\bin\\b3.jpeg"));
		poster.setBounds(31, 71, 196, 282);
		contentPane.add(poster);
		
		JLabel genre = new JLabel("Action ");
		genre.setForeground(Color.WHITE);
		genre.setBounds(258, 81, 97, 39);
		contentPane.add(genre);
		
		JLabel genre2 = new JLabel("Adventure ");
		genre2.setForeground(Color.WHITE);
		genre2.setHorizontalAlignment(SwingConstants.CENTER);
		genre2.setBounds(351, 81, 196, 39);
		contentPane.add(genre2);
		
		JLabel Rate = new JLabel("7.9");
		Rate.setBackground(Color.YELLOW);
		Rate.setForeground(Color.WHITE);
		Rate.setBounds(268, 275, 67, 39);
		contentPane.add(Rate);
		
		JLabel lblAddYourRate = new JLabel("add your Rate:");
		lblAddYourRate.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblAddYourRate.setForeground(Color.WHITE);
		lblAddYourRate.setBounds(31, 556, 227, 39);
		contentPane.add(lblAddYourRate);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(258, 241, 138, 39);
		contentPane.add(label_1);
		
		JTextArea Description = new JTextArea();
		Description.setFont(new Font("Monospaced", Font.PLAIN, 17));
		Description.setBackground(Color.DARK_GRAY);
		Description.setForeground(Color.WHITE);
		Description.setToolTipText("From visionary director Robert Eggers comes \r\nThe Northman, an action-filled epic that follows \r\na young Viking prince on his quest to avenge\r\n his father''s murder");
		Description.setText("From visionary director Robert Eggers comes \r\nThe Northman, an action-filled epic that follows a \r\nyoung Viking prince on his quest to avenge \r\nhis father''s murder");
		Description.setBounds(239, 153, 308, 107);
		contentPane.add(Description);
		
		JLabel lblDirector = new JLabel("director: ");
		lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblDirector.setForeground(Color.WHITE);
		lblDirector.setBounds(31, 369, 138, 39);
		contentPane.add(lblDirector);
		
		JLabel writter = new JLabel("writer:");
		writter.setFont(new Font("Tahoma", Font.PLAIN, 34));
		writter.setForeground(Color.WHITE);
		writter.setBounds(41, 497, 138, 39);
		contentPane.add(writter);
		
		JLabel lblProducer = new JLabel("producer:");
		lblProducer.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblProducer.setForeground(Color.WHITE);
		lblProducer.setBounds(31, 425, 176, 39);
		contentPane.add(lblProducer);
		
		UserRate = new JTextField();
		UserRate.setBackground(Color.ORANGE);
		UserRate.setBounds(351, 554, 78, 45);
		contentPane.add(UserRate);
		UserRate.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(298, 390, 138, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel Directorname = new JLabel("Robert Eggers");
		Directorname.setFont(new Font("Tahoma", Font.PLAIN, 33));
		Directorname.setForeground(SystemColor.textHighlight);
		Directorname.setBounds(278, 370, 250, 39);
		contentPane.add(Directorname);
		
		JLabel producerName = new JLabel("Thomas Benski");
		producerName.setForeground(SystemColor.textHighlight);
		producerName.setFont(new Font("Tahoma", Font.PLAIN, 33));
		producerName.setBounds(270, 426, 308, 39);
		contentPane.add(producerName);
		
		JLabel lblSjn = new JLabel("Sj\u00F3n");
		lblSjn.setForeground(SystemColor.textHighlight);
		lblSjn.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSjn.setBounds(280, 498, 78, 39);
		contentPane.add(lblSjn);
		/////////////////////////////////////////////////////////////
		int userRate = parseInt(UserRate.getText());
		Movie northman = new Movie();
		Director director = new Director();
		User user = new User();
		Action review = new Reviews(northman,user,"good",userRate);
		northman.setName("The Northman");
		northman.setGenre(genre.getText());
		northman.setGenre(genre2.getText());
		northman.setDescription(Description.getText());
		try{
		  director.setName(Directorname.getText());
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/MovieDatabase", "root","");
			Statement stmt = con.createStatement();
			String sql0 = "Select * from movie where name='"+northman.getName()+"'";
			ResultSet rs0 = stmt.executeQuery(sql0);
			if(rs0.next()) {
				return;
			}
			else {
				String sql = "INSERT INTO movie (name,addedDate,description,genre) VALUES ('"+northman.getName()+"', '"+northman.getAddedDate()+"', '"+northman.getDescription()+"', '"+genre.getText()+genre2.getText()+"')";
				PreparedStatement create = con.prepareStatement(sql);
				create.executeUpdate(sql);
				//stmt.executeQuery(sql);
				java.sql.ResultSet rs;
		        rs = stmt.executeQuery("Select LAST_INSERT_ID() from stock limit 1");                
		        rs.next();
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		/////////////////////////////////////////////////////////////
	}

	private int parseInt(String text) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
