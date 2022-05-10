import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class Unbearable extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Unbearable frame = new Unbearable();
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
	public Unbearable() {
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
		
		JLabel picture = new JLabel("New label");
		picture.setIcon(new ImageIcon("C:\\Program Files\\Java\\jre1.8.0_321\\bin\\b6.jpeg"));
		picture.setBounds(31, 71, 196, 282);
		contentPane.add(picture);
		
		JLabel genre = new JLabel("Comedy ");
		genre.setForeground(Color.WHITE);
		genre.setBounds(239, 81, 124, 39);
		contentPane.add(genre);
		
		JLabel genre2 = new JLabel("Crime ");
		genre2.setForeground(Color.WHITE);
		genre2.setHorizontalAlignment(SwingConstants.CENTER);
		genre2.setBounds(351, 81, 196, 39);
		contentPane.add(genre2);
		
		JLabel Rate = new JLabel("7.6");
		Rate.setBackground(Color.YELLOW);
		Rate.setForeground(Color.WHITE);
		Rate.setBounds(215, 313, 67, 39);
		contentPane.add(Rate);
		
		JLabel lblAddYourRate = new JLabel("add your Rate:");
		lblAddYourRate.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblAddYourRate.setForeground(Color.WHITE);
		lblAddYourRate.setBackground(Color.YELLOW);
		lblAddYourRate.setBounds(31, 556, 227, 39);
		contentPane.add(lblAddYourRate);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(258, 241, 138, 39);
		contentPane.add(label_1);
		
		JTextArea Discrebtion = new JTextArea();
		Discrebtion.setText("In this action-packed comedy, Nicolas\r\nCage plays Nick Cage, channeling his iconic \r\ncharacters as he''s caught between a superfan\r\n(Pedro Pascal) and a CIA agent \r\n(Tiffany Haddish).");
		Discrebtion.setFont(new Font("Monospaced", Font.PLAIN, 17));
		Discrebtion.setBackground(Color.DARK_GRAY);
		Discrebtion.setForeground(Color.WHITE);
		Discrebtion.setToolTipText("In this action-packed comedy, Nicolas Cage plays Nick Cage, \r\nchanneling his iconic characters as he's caught between a s\r\nuperfan (Pedro Pascal) and a CIA agent (Tiffany Haddish).");
		//Discrebtion.setText("From visionary director Robert Eggers comes \r\nThe Northman, an action-filled epic that follows a \r\nyoung Viking prince on his quest to avenge \r\nhis father's murder");
		Discrebtion.setBounds(205, 153, 373, 127);
		contentPane.add(Discrebtion);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(298, 390, 138, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel Directorname = new JLabel("\r\nTom Gormican");
		Directorname.setFont(new Font("Tahoma", Font.PLAIN, 33));
		Directorname.setForeground(SystemColor.textHighlight);
		Directorname.setBounds(225, 386, 250, 39);
		contentPane.add(Directorname);
		
		JLabel lblSjn = new JLabel("Kevin Etten");
		lblSjn.setForeground(SystemColor.textHighlight);
		lblSjn.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSjn.setBounds(225, 498, 195, 39);
		contentPane.add(lblSjn);
		
		textField = new JTextField();
		textField.setBackground(Color.ORANGE);
		textField.setForeground(Color.DARK_GRAY);
		textField.setBounds(271, 554, 94, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblKristinBurr = new JLabel("Kristin Burr");
		lblKristinBurr.setForeground(SystemColor.textHighlight);
		lblKristinBurr.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblKristinBurr.setBounds(235, 446, 250, 39);
		contentPane.add(lblKristinBurr);
		
		/////////////////////////////////////////////////////////////
		int userRate = parseInt(textField.getText());
		Movie unberable = new Movie();
		Director director = new Director();
		Producer producer = new Producer();
		Writer writer = new Writer();
		User user = new User();
		Action review = new Reviews( unberable ,user,"good",userRate);
		unberable.setName("Unberable");
		unberable.setGenre(genre.getText());
		unberable.setGenre(genre2.getText());
		unberable.setDescription(Discrebtion.getText());
		
		try{
			director.setName(Directorname.getText());
			unberable.addDirector(director);
			producer.setName(lblKristinBurr.getText());
			writer.setName(lblSjn.getText());
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/MovieDatabase", "root","");
			Statement stmt = con.createStatement();
			String sql0 = "Select * from movie where name='"+unberable.getName()+"'";
			ResultSet rs0 = stmt.executeQuery(sql0);
			if(rs0.next()) {
			}
			else {
				String sql = "INSERT INTO movie (name,addedDate,description,genre) VALUES ('"+unberable .getName()+"', '"+unberable .getAddedDate()+"', '"+unberable .getDescription()+"', '"+genre.getText()+genre2.getText()+"')";
				PreparedStatement create = con.prepareStatement(sql);
				create.executeUpdate(sql);
				//stmt.executeQuery(sql);
				java.sql.ResultSet rs;
				rs = stmt.executeQuery("Select LAST_INSERT_ID() from stock limit 1");                
				rs.next(); 
			}
			String sql2 = "Select * from director where name='"+Directorname.getText()+"'";
			ResultSet rs2 = stmt.executeQuery(sql2);
			if(rs2.next()) {
			}
			else {
				String sql = "INSERT INTO director (name) VALUES ('"+Directorname.getText()+"')";
				PreparedStatement create = con.prepareStatement(sql);
				create.executeUpdate(sql);
				//stmt.executeQuery(sql);
				java.sql.ResultSet rs;
		        rs = stmt.executeQuery("Select LAST_INSERT_ID() from stock limit 1");                
		        rs.next();
			}
			
			String sql3 = "Select * from writer where name='"+lblSjn.getText()+"'";
			ResultSet rs3 = stmt.executeQuery(sql3);
			if(rs3.next()) {
			}
			else {
				String sql = "INSERT INTO writer (name) VALUES ('"+lblSjn.getText()+"')";
				PreparedStatement create = con.prepareStatement(sql);
				create.executeUpdate(sql);
				//stmt.executeQuery(sql);
				java.sql.ResultSet rs;
		        rs = stmt.executeQuery("Select LAST_INSERT_ID() from stock limit 1");                
		        rs.next();
			}
			
			String sql4 = "Select * from producer where name='"+lblKristinBurr.getText()+"'";
			ResultSet rs4 = stmt.executeQuery(sql4);
			if(rs4.next()) {
			}
			else {
				String sql = "INSERT INTO producer (name) VALUES ('"+lblKristinBurr.getText()+"')";
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