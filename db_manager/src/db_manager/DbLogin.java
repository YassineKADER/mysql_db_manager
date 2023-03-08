package db_manager;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.*;


public class DbLogin {
	JFrame frame;
	JPanel loginPanel;
	public DbLogin() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("DB INFORMATION");
		loginPanel = loginPanel();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		GridLayout login = new GridLayout(1, 2);
		ImageIcon img = new ImageIcon("C:\\Users\\HP\\Downloads\\img_background.jpg");
		JLabel imgfile = new JLabel(img);
		JButton but2 = new JButton("hhh");
		frame.setLayout(login);
		frame.add(imgfile);
		frame.add(loginPanel);
		frame.setVisible(true);
	}
	
	private JPanel loginPanel() {
		JPanel loginpanel = new JPanel();
		JPanel spanel = new JPanel();
		JTextField adress = new JTextField();
		JLabel logininfo = new JLabel("Login Informations");
		JTextField password = new JTextField();
		JButton loginButton = new JButton("Login");
		GridLayout layout1 = new GridLayout(3,1);
		GridLayout layout = new GridLayout(6,1);
		loginpanel.setLayout(layout1);
		password.setH
		spanel.setLayout(layout);
		spanel.setBackground(Color.white);
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(new Color(138,43,226));
		loginButton.setFont(new Font("Arial", Font.BOLD, 14));
		loginButton.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
		loginButton.setBorderPainted(false);
		loginButton.setFocusPainted(false);
		logininfo.setFont(new Font("Arial",Font.BOLD, 30));
		logininfo.setHorizontalAlignment(JLabel.CENTER);
		loginpanel.add(logininfo);
		spanel.add(new JLabel("Server Adress:"));
		spanel.add(adress);
		spanel.add(new JLabel("Password:"));
		spanel.add(password);
		spanel.add(new JLabel());
		spanel.add(loginButton);
		loginpanel.add(spanel);
		loginpanel.setBackground(Color.white);
		return loginpanel;
	}
	
}