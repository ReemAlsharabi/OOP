import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;


public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 752);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 0, 727, 38);
		contentPane.add(panel);
		panel.setLayout(null);
		
//		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setIcon(new ImageIcon("C:\\Program Files\\Java\\jre1.8.0_321\\bin\\search.png"));
//		lblNewLabel.setBounds(-35, 872, 66, 66);
//		panel.add(lblNewLabel);
		
		JLabel lblSearchMovie = new JLabel("Search Movie");
		lblSearchMovie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchMovie.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSearchMovie.setForeground(Color.WHITE);
		lblSearchMovie.setBounds(323, 0, 241, 39);
		panel.add(lblSearchMovie);
		
		JLabel lblMostPopularMovies = new JLabel("Most Popular Movies");
		lblMostPopularMovies.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblMostPopularMovies.setForeground(Color.WHITE);
		lblMostPopularMovies.setHorizontalAlignment(SwingConstants.CENTER);
		lblMostPopularMovies.setBounds(132, 46, 307, 39);
		contentPane.add(lblMostPopularMovies);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Northman movie = new Northman();
				movie.show();
				
				dispose();
			}
		});

		//label.setIcon(new ImageIcon("C:\\Program Files\\Java\\jre1.8.0_321\\bin\\b3.jpeg"));
		Image img = new ImageIcon (this.getClass().getResource("/movie1.jpeg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(49, 102, 166, 225);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Everything movie = new Everything();
				movie.show();
				
				dispose();
			}
		});
		//lblNewLabel_1.setIcon(new ImageIcon("C:\\Program Files\\Java\\jre1.8.0_321\\bin\\b4.jpeg"));
		Image img1 = new ImageIcon (this.getClass().getResource("/movie2.jpeg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(59, 375, 150, 233);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Unbearable movie = new Unbearable();
				movie.show();
				
				dispose();
			}
		});
		//lblNewLabel_2.setIcon(new ImageIcon("C:\\Program Files\\Java\\jre1.8.0_321\\bin\\b6.jpeg"));
		Image img2 = new ImageIcon (this.getClass().getResource("/movie3.jpeg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		lblNewLabel_2.setBounds(360, 102, 166, 225);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Death movie = new Death();
				movie.show();
				
				dispose();
			}
		});
		//lblNewLabel_3.setIcon(new ImageIcon("C:\\Program Files\\Java\\jre1.8.0_321\\bin\\b7.jpeg"));
		Image img3 = new ImageIcon (this.getClass().getResource("/movie4.jpeg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		lblNewLabel_3.setBounds(360, 379, 166, 225);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblTheNorthman = new JLabel("The Northman (2022)");
		lblTheNorthman.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Northman movie = new Northman();
				movie.show();
				
				dispose();
				
			}
		});
		lblTheNorthman.setForeground(Color.WHITE);
		lblTheNorthman.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTheNorthman.setBounds(59, 331, 140, 39);
		contentPane.add(lblTheNorthman);
		
		JLabel lblNewLabel_4 = new JLabel("Everything Everywhere All at Once (2022)");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Everything movie = new Everything();
				movie.show();
				
				dispose();
			}
		});
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(31, 604, 270, 39);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblTheUnbearableWeight = new JLabel("The Unbearable Weight of Massive Talent (2022)");
		lblTheUnbearableWeight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Unbearable movie = new Unbearable();
				movie.show();
				
				dispose();
				
				
			}
		});
		lblTheUnbearableWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheUnbearableWeight.setForeground(Color.WHITE);
		lblTheUnbearableWeight.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTheUnbearableWeight.setBounds(306, 326, 263, 39);
		contentPane.add(lblTheUnbearableWeight);
		
		JLabel lblDeathOnThe = new JLabel("Death on the Nile (2022)");
		lblDeathOnThe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Death movie = new Death();
				movie.show();
				
				dispose();
				
			}
		});
		lblDeathOnThe.setForeground(Color.WHITE);
		lblDeathOnThe.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDeathOnThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeathOnThe.setBounds(324, 604, 258, 39);
		contentPane.add(lblDeathOnThe);
	}
}
