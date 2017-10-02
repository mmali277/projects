package hangmaan;

import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Ludo.Project;

import java.lang.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.*;

public class Subscription extends JPanel {
	boolean a = false;
	boolean b = false;
	boolean c = false;
	boolean d = false;
	ImageIcon reg = new ImageIcon("register.png");
	ImageIcon ludo = new ImageIcon("ludo.png");
	ImageIcon hang = new ImageIcon("logo.png");
	JButton HangMan = new JButton(hang);
	JButton Ludo = new JButton(ludo);
	JLabel chooseGame = new JLabel("Select A Game");
	ImageIcon Sign = new ImageIcon("signup.png");
	ImageIcon Log = new ImageIcon("login.png");
	JButton LogIn = new JButton(Log);
	JButton SignUp = new JButton(Sign);
	JButton Register = new JButton(reg);
	JPanel firstPanel = new JPanel();
	JPanel secondPanel = new JPanel();
	

	public static JPanel thirdPanel = new JPanel();
	JLabel forUser = new JLabel("User Name");
	JLabel incorrect = new JLabel("Incorrect Password or Username");
	JLabel forPassword = new JLabel("Password");
	JLabel labelSignupUser = new JLabel("Choose User Name");

	JLabel labelSignUppassword = new JLabel("Choose Password");

	JLabel labelSignUpConfpassword = new JLabel("Confirm Password");

	JLabel shortPass = new JLabel();
	JLabel userExist = new JLabel();
	JLabel notMatch = new JLabel();

	Font forLabels = new Font("Arial", 15, 15);
	Font forUsers = new Font("Arial", 20, 20);
	Font forSelection = new Font("Arial", 40, 40);
	boolean forJoption = true;
	boolean flag;
	public static JFrame f = new JFrame();
	static JFrame forHangMan = new JFrame();
	static JFrame forLudo = new JFrame();
	ImageIcon back4 = new ImageIcon("back4.jpg");
	JTextField loginUser = new JTextField();
	JPasswordField enterPass = new JPasswordField();

	JTextField SignUpuser = new JTextField();
	JPasswordField SignUpPass = new JPasswordField();
	JPasswordField SignUpConfirmPass = new JPasswordField();

	Subscription() {
	}

	Subscription(JFrame a) {
		Project pro = new Project(forLudo);

		FinalGUI hangGame = new FinalGUI(forHangMan);
		FinalGUI passhangGame = new FinalGUI(hangGame);
		f = a;

		forLudo.setLocationRelativeTo(null);
		forLudo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		forLudo.add(pro);
		forLudo.setSize(1000, 1000);
		forLudo.setBounds(0, 0, 1366, 768);

		forHangMan.setLocationRelativeTo(null);
		forHangMan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		forHangMan.add(hangGame);
		forHangMan.setSize(1000, 1000);
		forHangMan.setBounds(0, 0, 1366, 768);

		firstPanel.setSize(1000, 1000);
		firstPanel.setBounds(0, 0, 1366, 768);

		secondPanel.setSize(1000, 1000);
		secondPanel.setBounds(0, 0, 1366, 768);

		thirdPanel.setSize(1000, 1000);
		thirdPanel.setBounds(0, 0, 1366, 768);
		thirdPanel.add(HangMan);
		thirdPanel.add(Ludo);
		thirdPanel.add(chooseGame);

		firstPanel.add(LogIn);
		firstPanel.add(SignUp);
		firstPanel.add(loginUser);
		firstPanel.add(enterPass);
		firstPanel.add(forUser);
		firstPanel.add(forPassword);
		firstPanel.add(incorrect);
		incorrect.setVisible(false);

		secondPanel.add(SignUpuser);
		secondPanel.add(SignUpPass);
		secondPanel.add(SignUpConfirmPass);
		secondPanel.add(shortPass);
		secondPanel.add(userExist);
		secondPanel.add(notMatch);
		secondPanel.add(Register);

		secondPanel.add(labelSignupUser);
		secondPanel.add(labelSignUppassword);
		secondPanel.add(labelSignUpConfpassword);
		// firstPanel.add(forLabels);
		f.add(firstPanel);
		f.add(secondPanel);
		f.add(thirdPanel);

		secondPanel.setVisible(false);
		thirdPanel.setVisible(false);

	}

	public void paintComponent(Graphics a) {
		super.paintComponent(a);
		System.out.println("i dont know");
		a.drawImage(back4.getImage(), 0, 0, 1366, 768, (ImageObserver) this);
		firstPanel.setOpaque(false);
		secondPanel.setOpaque(false);
		thirdPanel.setOpaque(false);

		
		LogIn.setContentAreaFilled(false);
		LogIn.setFocusPainted(false);
		LogIn.setOpaque(false);
		LogIn.setBorderPainted(false);

		
		SignUp.setContentAreaFilled(false);
		SignUp.setFocusPainted(false);
		SignUp.setOpaque(false);
		SignUp.setBorderPainted(false);
		
		//LogIn.setText("LogIn");
	//	SignUp.setText("SignUp");
		LogIn.setLocation(570, 400);
		SignUp.setLocation(570, 500);
		LogIn.setSize(200, 50);
		SignUp.setSize(200, 50);

		HangMan.setContentAreaFilled(false);
		HangMan.setFocusPainted(false);
		HangMan.setOpaque(false);
		HangMan.setBorderPainted(false);
		//HangMan.setText("HangMan");
		HangMan.setLocation(580, 200);
		HangMan.setSize(200, 200);

		Ludo.setContentAreaFilled(false);
		Ludo.setFocusPainted(false);
		Ludo.setOpaque(false);
		Ludo.setBorderPainted(false);
		//Ludo.setText("Ludo");
		Ludo.setLocation(580, 400);
		Ludo.setSize(200, 200);

		Register.setContentAreaFilled(false);
		Register.setFocusPainted(false);
		Register.setOpaque(false);
		Register.setBorderPainted(false);
		Register.setLocation(560, 550);
		Register.setSize(200, 100);
		//Register.setText("Register");

		loginUser.setSize(200, 50);
		enterPass.setSize(200, 50);
		loginUser.setLocation(570, 200);
		enterPass.setLocation(570, 300);

		forUser.setSize(200, 50);
		forUser.setLocation(570, 150);
		forUser.setForeground(Color.BLACK);
		forUser.setFont(forUsers);
		forPassword.setFont(forUsers);
		forPassword.setForeground(Color.BLACK);
		forPassword.setSize(200, 50);
		forPassword.setLocation(570, 250);

		chooseGame.setSize(400, 100);
		chooseGame.setLocation(550, 70);
		chooseGame.setForeground(Color.black);
		chooseGame.setFont(forSelection);

		incorrect.setFont(forLabels);
		incorrect.setForeground(Color.red);
		incorrect.setSize(300, 50);
		incorrect.setLocation(570, 350);

		SignUpuser.setLocation(570, 200);
		SignUpuser.setSize(200, 50);
		// SignUpuser.setSize(200,50);

		SignUpPass.setLocation(570, 300);
		SignUpPass.setSize(200, 50);

		SignUpConfirmPass.setLocation(570, 400);
		SignUpConfirmPass.setSize(200, 50);

		labelSignupUser.setLocation(570, 150);
		labelSignupUser.setSize(200, 50);
		labelSignupUser.setFont(forUsers);
		labelSignupUser.setForeground(Color.black);

		labelSignUppassword.setLocation(570, 250);
		labelSignUppassword.setSize(200, 50);
		labelSignUppassword.setFont(forUsers);
		labelSignUppassword.setForeground(Color.black);

		labelSignUpConfpassword.setLocation(570, 350);
		labelSignUpConfpassword.setSize(200, 50);
		labelSignUpConfpassword.setFont(forUsers);
		labelSignUpConfpassword.setForeground(Color.black);

		userExist.setLocation(770, 200);
		userExist.setSize(200, 50);
		userExist.setFont(forLabels);
		userExist.setForeground(Color.red);

		notMatch.setLocation(770, 400);
		notMatch.setSize(200, 50);
		notMatch.setFont(forLabels);
		notMatch.setForeground(Color.red);

		shortPass.setLocation(770, 300);
		shortPass.setSize(200, 50);
		shortPass.setFont(forLabels);
		

		LogIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					checkLogin();

					if (!flag) {
						incorrect.setVisible(true);

					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

		HangMan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				thirdPanel.setVisible(false);
				forHangMan.setVisible(true);
				f.setVisible(false);
				FinalGUI.Panel.setVisible(true);
			}
		});

		Ludo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				thirdPanel.setVisible(false);
				forLudo.setVisible(true);
				f.setVisible(false);

			}
		});
		Register.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					signUp();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});

		SignUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				firstPanel.setVisible(false);
				secondPanel.setVisible(true);

			}

		});

	}

	public void subscribe() throws FileNotFoundException {
		System.out.println("\t\tPlease first Subscribe:\n");

		Scanner input = new Scanner(System.in);
		System.out.println("\t\tPress 1 for signing up:");
		System.out.println("\t\tPress 2 for logging in:");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			signUp();

			break;
		case 2:
			checkLogin();

			break;
		}

	}

	private Formatter x;
	private Formatter y;
	private Scanner words;
	Scanner khan = new Scanner(System.in);
	private String format;
	private String user;
	private String pass;
	private String conf;
	String origword[] = new String[128];

	public void file() {
		try {
			x = new Formatter("players.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void addPlayers() {
		String y = khan.next();
		x.format("%s", y);
		x.close();
	}

	public void words() {
		try {
			words = new Scanner(new File("Words list.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void readFile() throws IOException {

		FileReader file = new FileReader("Words list.txt");
		BufferedReader reader = new BufferedReader(file);
		String line = reader.readLine();
		for (int i = 0; i < 128; i++) {
			origword[i] = line;
			line = reader.readLine();

		}

	}

	public void checkLogin() throws FileNotFoundException {
		Scanner s1, s2;
		s1 = new Scanner(new File("players.txt"));

		flag = false;
		String name, pword, n, p;

		System.out.println("Enter username:");

		n = loginUser.getText();
		System.out.println("Enter password:");

		p = enterPass.getText();
		s1 = new Scanner(new File("players.txt"));
		while (s1.hasNext()) {
			name = s1.next();
			System.out.println("name is: " + name);
			pword = s1.next();

			System.out.println("password is: " + pword);

			if (n.equals(name) && p.equals(pword)) {
				// i = 2;
				thirdPanel.setVisible(true);
				firstPanel.setVisible(false);
				System.out.println("You are logged in.");
				flag = true;
				break;
			}
		}

	}

	public void signUp() throws FileNotFoundException {
		Scanner s1 = new Scanner(new File("players.txt"));
		File file = new File("players.txt");
		System.out.println("Registration Page");

		s1 = new Scanner(new File("players.txt"));
		System.out.println("NOTE: your username is a unique one so it cannot be changed.");
		System.out.println("Username: ");

		user = "2";
		user = SignUpuser.getText();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String v = null;
			boolean checkname = false;
			while (s1.hasNext()) {
				v = s1.next();
				if (v.equalsIgnoreCase(user)) {
					checkname = true;
				}
			}

			if (checkname) {
				System.out.println("Username is already exists and used, please type another one");
				userExist.setText("User already exist!");
				a = false;
			} else {
				a = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Password: ");

		pass = "1";
		pass = SignUpPass.getText();
		System.out.println("Confirm Password: ");

		conf = SignUpConfirmPass.getText();

		if (pass.length() < 6) {
			System.out.println("Too short password, password must be 6 characters or more");
			shortPass.setForeground(Color.RED);
			shortPass.setText("Too short password!");
			b = false;
		} else {
			shortPass.setForeground(Color.GREEN);
			shortPass.setText("Strong Password!");
			b = true;
		}

		if (SignUpuser.getText().isEmpty() || SignUpuser.getText().contains(" ")) {
			d = false;
			userExist.setText("Please enter a valid username!");
		} else
			d = true;

		if (pass.equals(conf)) {

			// z = 2;
			c = true;
			if (a && b && c && d) {
				Formatter x = null;
				try {
					FileWriter f = new FileWriter(file, true);
					BufferedWriter bw = new BufferedWriter(f);
					x = new Formatter(f);
					x.format("%s %s %n", user, pass);
					notMatch.setForeground(Color.GREEN);
					notMatch.setText("password match!");
					System.out.println("You registered succesfully");
					x.close();
					secondPanel.setVisible(false);
					firstPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		} else {
			System.out.println("Password and confirm password are not matching");
			notMatch.setText("password do not match!");
			c = false;

		}
	}
}
