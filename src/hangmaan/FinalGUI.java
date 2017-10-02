package hangmaan;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorChooserUI;

public class FinalGUI extends GameBody {
	JLabel selectLevel = new JLabel("Select Difficulty Level");
	ImageIcon quit = new ImageIcon("quit.png");
	ImageIcon e2 = new ImageIcon("e2.jpg");
	ImageIcon e3 = new ImageIcon("e3.jpg");
	ImageIcon e4 = new ImageIcon("e4.jpg");
	ImageIcon e5 = new ImageIcon("e5.jpg");
	ImageIcon e1 = new ImageIcon("e1.jpg");
	
	
	ImageIcon newgame = new ImageIcon("newGame.png");
	ImageIcon ok = new ImageIcon("Ok.png");
	JButton Ok2 = new JButton(ok);
	JButton Easy = new JButton(e1);
	JButton Medium = new JButton(e2);
	JButton Hard = new JButton(e3);
	JButton VeryHard = new JButton(e4);
	JButton Extreme = new JButton(e5);
	JButton NewGame = new JButton(newgame);
	JButton Quit = new JButton(quit);
	JButton Challenge = new JButton();
	JButton Normal = new JButton();
	ImageIcon backButton = new ImageIcon("backButton.png");
	JButton Back1 = new JButton(backButton);
	JButton Back2 = new JButton(backButton);
	JButton Back3 = new JButton(backButton);
	JButton Back3b = new JButton(backButton);
	JButton Back4 = new JButton(backButton);
	JButton Back5 = new JButton(backButton);
	JButton BackMain = new JButton(backButton);
	JLabel writehint = new JLabel();

	JTextField play = new JTextField();
	JTextField GiveHint = new JTextField();
	static JTextField writeWord = new JTextField();
	static String getWord;
	static String forField;
	int counter = 0;

	Font forLabel1 = new Font("Segoe Script", 40, 40);
	ImageIcon back = new ImageIcon("rope-hangman-noose.jpg");
	ImageIcon pattern1 = new ImageIcon("1.png");
	ImageIcon Phansi = new ImageIcon("Phansi.png");
	

	ImageIcon pattern2 = new ImageIcon("2.png");
	ImageIcon pattern3 = new ImageIcon("3.png");
	ImageIcon pattern4 = new ImageIcon("4.png");
	ImageIcon pattern5 = new ImageIcon("5.png");
	ImageIcon pattern6 = new ImageIcon("6.png");
	ImageIcon pattern7 = new ImageIcon("7.png");
	ImageIcon pattern8 = new ImageIcon("8.png");
	
	String wel = "Welcome!!";
	JLabel enterWord = new JLabel("Enter The Word");
	JButton Ok1 = new JButton(ok);

	Font forLabel = new Font("Arial", 40, 40);
	Font forEnterWord = new Font("Arial", 40, 40);

	static JFrame frameMode = new JFrame();

	static JFrame frame = new JFrame();
	static JPanel Panel = new JPanel();// GUI
	static JPanel Panel1 = new JPanel();// GUI1
	static JPanel Panel2 = new JPanel();// GUI1
	static JPanel Panel3 = new JPanel();// GUI1
	static JPanel Panel3b = new JPanel();// GUI1
	static JPanel Panel4 = new JPanel();
	static JPanel Panel5 = new JPanel();
	static FinalGUI g;

	FinalGUI(FinalGUI a) {
		g = a;

	}

	FinalGUI(JFrame a) {

		frame = a;

		Panel.setSize(1000, 1000);
		Panel.setBounds(0, 0, 1366, 768);
		Panel1.setSize(1000, 1000);
		Panel1.setBounds(0, 0, 1366, 768);
		Panel2.setSize(1000, 1000);
		Panel2.setBounds(0, 0, 1366, 768);
		Panel3.setSize(1000, 1000);
		Panel3.setBounds(0, 0, 1366, 768);
		Panel3b.setSize(1000, 1000);
		Panel3b.setBounds(0, 0, 1366, 768);
		Panel4.setSize(1000, 1000);
		Panel4.setBounds(0, 0, 1366, 768);
		Panel5.setSize(1000, 1000);
		Panel5.setBounds(0, 0, 1366, 768);

		Panel4.add(Back4);
		Panel4.add(play);

		frameMode.setLocationRelativeTo(null);
		frameMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frameMode.setSize(1000, 1000);
		frameMode.setBounds(0, 0, 1366, 768);
		frame.add(Panel);
		frame.add(Panel1);
		frame.add(Panel2);
		frame.add(Panel3);
		frame.add(Panel3b);
		frame.add(Panel4);
		frame.add(Panel5);

		Panel1.setVisible(false);
		Panel2.setVisible(false);
		Panel3.setVisible(false);
		Panel3b.setVisible(false);
		Panel4.setVisible(false);
		Panel5.setVisible(false);

		Panel.add(NewGame);
		Panel.add(Quit);
		Panel1.add(Challenge);
		Panel1.add(Normal);
		Panel1.add(Back1);

		Panel2.add(writeWord);
		Panel2.add(enterWord);
		Panel2.add(Ok1);
		Panel2.add(Back2);

		// Panel3.add(Ok2);
		Panel3.add(Easy);
		Panel3.add(Medium);
		Panel3.add(Hard);
		Panel3.add(selectLevel);
		Panel3.add(Back3);

		Panel3b.add(Back3b);
		Panel3b.add(GiveHint);
		Panel3b.add(writehint);
		Panel3b.add(Ok2);

		//Panel5.add(Back5);
		Panel5.add(BackMain);

	}

	public void paintComponent(Graphics a) {

		super.paintComponent(a);

		a.drawImage(back.getImage(), 0, 0, 1366, 768, (ImageObserver) this);
		Graphics2D g2 = (Graphics2D) a;

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Font font = new Font("Old English Text MT", Font.HANGING_BASELINE, 96);
		g2.setFont(font);
		g2.setColor(Color.blue);
		

		if (win == true) {
			a.drawImage(Phansi.getImage(), 700, 0, 700, 467, (ImageObserver) this);
			a.drawImage(pattern8.getImage(), 853, 150, 76, 189, (ImageObserver) this);
			Panel5.setVisible(true);
			Panel4.setVisible(false);
			g2.setColor(Color.green);
			g2.drawString("You Won!", 100, 100);
			g2.setColor(Color.white);
			g2.drawString("The Word Is", 100, 200);
			g2.drawString(orig, 100, 300);

		}
		if (lose == true) {
			a.drawImage(Phansi.getImage(), 700, 0, 700, 467, (ImageObserver) this);

			if(remainChance==-1)
			a.drawImage(pattern7.getImage(), 853, 90, 74, 194, (ImageObserver) this);
			Panel5.setVisible(true);
			Panel4.setVisible(false);
			g2.setColor(Color.RED);
			g2.drawString("You Lose!", 100, 100);
			g2.setColor(Color.white);
			g2.drawString("The Word Was", 100, 200);
			g2.drawString(orig, 100, 300);

		}

		if (Panel5.isVisible()) {
			String forHint = "";
			wrongGuessedwords = "";
			RightGuessedwords = "";
		}

		String forHint = "";
		for (int i = 0; i < orig.length(); i++) {
			forHint = forHint + hint[i];
		}
		getWord = play.getText();
		if (Panel4.isVisible()) {
			Run();
			a.drawImage(Phansi.getImage(), 500, 0, 700, 467, (ImageObserver) this);

			Images(a);
			play.setText("");
			Font font1 = new Font("Segoe Script", Font.HANGING_BASELINE, 70);
			g2.setFont(font1);
			g2.setColor(Color.WHITE);
			g2.drawString(forHint, 500, 550);
			Font font2 = new Font("Old English Text MT", Font.HANGING_BASELINE, 50);
			g2.setFont(font2);
			g2.drawString("Chances Left:", 100, 200);
			g2.drawString("" + remainChance + "", 100, 250);
			g2.drawString("Wrong guesses:", 100, 350);
			g2.setColor(Color.RED);
			g2.drawString(wrongGuessedwords, 100, 400);
			g2.setColor(Color.WHITE);
			g2.drawString("Right guesses:", 100, 500);
			g2.setColor(Color.green);
			g2.drawString(RightGuessedwords, 100, 550);
			Panel4.repaint();
		} else if (Panel.isVisible()) {

			g2.setColor(Color.white);
			g2.drawString(wel, 500, 100);
		}

		else if (Panel2.isVisible() || Panel3b.isVisible()) {
			g2.setColor(Color.WHITE);
			g2.drawString("Challenging Mode", 320, 100);

		} else if (Panel3.isVisible() && choosemode == 1){
			g2.setColor(Color.WHITE);
			g2.drawString("Challenging Mode", 320, 100);}
		else if (Panel3.isVisible() && choosemode == 2){
			g2.setColor(Color.WHITE);
			g2.drawString("Normal Mode", 400, 100);}
		else if (Panel4.isVisible() && choosemode == 2){
			g2.setColor(Color.WHITE);
			g2.drawString("Normal Mode", 500, 100);}
		else if (Panel4.isVisible() && choosemode == 1){
			g2.setColor(Color.WHITE);
			g2.drawString("Challenging Mode", 320, 100);}
		else if (Panel1.isVisible()){
			g2.setColor(Color.WHITE);
			g2.drawString("Please Select A Mode", 320, 100);}

		Panel.setOpaque(false);
		Panel1.setOpaque(false);
		Panel2.setOpaque(false);
		Panel3.setOpaque(false);
		Panel3b.setOpaque(false);
		Panel4.setOpaque(false);
		Panel5.setOpaque(false);

		NewGame.setContentAreaFilled(false);
		NewGame.setBorderPainted(false);
		NewGame.setFocusPainted(false);
		NewGame.setOpaque(false);
		NewGame.setSize(350, 100);
		
		Quit.setSize(100, 100);
		NewGame.setLocation(520, 300);
		Quit.setLocation(10, 600);
		//NewGame.setText("New Game");
		Quit.setText("Quit");

		
		Quit.setContentAreaFilled(false);
		Quit.setFocusPainted(false);
		Quit.setOpaque(false);
		
		Challenge.setSize(100, 100);
		Normal.setSize(100, 100);
		Challenge.setLocation(600, 300);
		Normal.setLocation(600, 500);
		Challenge.setText("Challenge");
		Normal.setText("Normal");

		Back1.setSize(160, 100);
		Back1.setLocation(10, 600);
		Back1.setText("Back");
		Back1.setContentAreaFilled(false);
		Back1.setFocusPainted(false);
		
		Back2.setSize(160, 100);
		Back2.setLocation(10, 600);
		Back2.setText("Back");
		Back2.setContentAreaFilled(false);
		Back2.setFocusPainted(false);
		
		
		Back3.setSize(160, 100);
		Back3.setLocation(10, 600);
		Back3.setText("Back");
		Back3.setContentAreaFilled(false);
		Back3.setFocusPainted(false);

		Back3b.setSize(160, 100);
		Back3b.setLocation(10, 600);
		Back3b.setText("Back");
		Back3b.setContentAreaFilled(false);
		Back3b.setFocusPainted(false);

		Back4.setSize(160, 100);
		Back4.setLocation(10, 600);
		Back4.setText("Back");
		Back4.setContentAreaFilled(false);
		Back4.setFocusPainted(false);

		Back5.setSize(160, 100);
		Back5.setLocation(10, 600);
		Back5.setText("Back");
		Back5.setContentAreaFilled(false);
		Back5.setFocusPainted(false);

		BackMain.setSize(160, 100);
		BackMain.setLocation(10, 600);
		BackMain.setText("Back to main");
		BackMain.setContentAreaFilled(false);
		BackMain.setFocusPainted(false);


		Ok1.setContentAreaFilled(false);
		Ok1.setBorderPainted(false);
		Ok1.setFocusPainted(false);
		Ok1.setOpaque(false);
		Ok1.setSize(120, 100);
		Ok1.setLocation(960, 300);
		//Ok1.setText("OK");

		Ok2.setContentAreaFilled(false);
		Ok2.setBorderPainted(false);
		Ok2.setFocusPainted(false);
		Ok2.setOpaque(false);
		Ok2.setSize(120, 100);
		Ok2.setLocation(1010, 300);
		//Ok2.setText("OK");

		enterWord.setSize(500, 100);
		enterWord.setFont(forEnterWord);
		enterWord.setForeground(Color.white);
		enterWord.setLocation(530, 100);

		writeWord.setSize(500, 100);
		writeWord.setLocation(450, 300);
		writeWord.setForeground(Color.WHITE);
		writeWord.setFont(forLabel1);

		writeWord.setOpaque(false);
		// writeWord.setForeground(Color.BLUE);

		Easy.setContentAreaFilled(false);
		Easy.setBorderPainted(false);
		Easy.setFocusPainted(false);
		Easy.setOpaque(false);
		Easy.setSize(250, 100);
		Easy.setLocation(600, 200);

		Medium.setContentAreaFilled(false);
		Medium.setBorderPainted(false);
		Medium.setFocusPainted(false);
		Medium.setOpaque(false);
		Medium.setSize(250, 100);
		Medium.setLocation(600, 300);

		Hard.setContentAreaFilled(false);
		Hard.setBorderPainted(false);
		Hard.setFocusPainted(false);
		Hard.setOpaque(false);
		Hard.setSize(250, 100);
		Hard.setLocation(600, 400);

		VeryHard.setContentAreaFilled(false);
		VeryHard.setBorderPainted(false);
		VeryHard.setFocusPainted(false);
		VeryHard.setOpaque(false);
		VeryHard.setSize(250, 100);
		VeryHard.setLocation(600, 500);

		Extreme.setContentAreaFilled(false);
		Extreme.setBorderPainted(false);
		Extreme.setFocusPainted(false);
		Extreme.setOpaque(false);
		Extreme.setSize(250, 100);
		Extreme.setLocation(600, 600);

		selectLevel.setSize(500, 50);
		selectLevel.setFont(forLabel);
		selectLevel.setLocation(500, 150);
		selectLevel.setForeground(Color.white);
		writehint.setForeground(Color.white);
		writehint.setFont(forLabel);
		writehint.setLocation(530, 200);
		writehint.setText("Please Enter " + hintss + " Hintss");
		GiveHint.setFont(forLabel1);
		GiveHint.setOpaque(false);
		GiveHint.setForeground(Color.WHITE);
		GiveHint.setSize(500, 100);
		GiveHint.setLocation(500, 300);
		Ok2.setEnabled(false);

		play.setFont(forLabel);
		play.setOpaque(false);
		play.setForeground(Color.BLUE);
		play.setSize(200, 50);
		play.setLocation(530, 600);

		if (Panel3b.isVisible()) {
			if (GiveHint.getText().length() == hintss) {
				checkHint();
			}
		}

		if (orig.length() > 6) {

			Panel3.add(VeryHard);
			Panel3.add(Extreme);
			/*Easy.setText("Recruit");
			Medium.setText("Regular");
			Hard.setText("Hardened");
			VeryHard.setText("Veteran");
			Extreme.setText("Realistic");*/
		} else {

			Panel3.remove(VeryHard);
			Panel3.remove(Extreme);
		}
		if (orig.length() > 6) {

			Panel3.add(VeryHard);
			Panel3.add(Extreme);
		}
		if (orig.length() == 5 || orig.length() == 4 || orig.length() == 6) {
		/*	Easy.setText("Can I play,Daddy?");
			Medium.setText(" Don't Hurt me.");
			Hard.setText("Bring 'em on!");*/
		}
		if (orig.length() == 2 || orig.length() == 3) {
			/*Easy.setText("Easy");
			Medium.setText("Medium");
			Hard.setText("Hard");*/

		}

		NewGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel.setVisible(false);
				Panel1.setVisible(true);

			}

		});

		Quit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}

		});

		Challenge.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				choosemode = 1;

				System.out.println(choosemode);

				Panel2.setVisible(true);
				Panel1.setVisible(false);

			}

		});

		Normal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				choosemode = 2;

				try {
					ChooseMode();
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				System.out.println(orig);

				Panel3.setVisible(true);
				Panel1.setVisible(false);

			}

		});
		Back1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Panel1.setVisible(false);
				Panel.setVisible(true);

			}

		});
		Back2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Panel1.setVisible(true);
				Panel2.setVisible(false);

			}

		});
		Back3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (choosemode == 1) {
					Panel3.setVisible(false);
					Panel2.setVisible(true);
				}

				else {
					Panel3.setVisible(false);
					Panel1.setVisible(true);
				}

			}

		});
		Back3b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Panel3b.setVisible(false);
				Panel3.setVisible(true);

			}

		});

		Back4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (choosemode == 1) {
					Panel1.setVisible(true);
					Panel4.setVisible(false);
				}
				if (choosemode == 2) {

					Panel1.setVisible(true);
					Panel4.setVisible(false);
				}
			}

		});

		Back5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				win = false;
				lose = false;
				Panel5.setVisible(false);
				Panel1.setVisible(true);
			}

		});

		BackMain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				win = false;
				lose = false;
				Panel5.setVisible(false);
				frame.setVisible(false);
				;

				Subscription.f.setVisible(true);

				Subscription.thirdPanel.setVisible(true);
			}

		});
		Ok1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ChooseMode();
				} catch (IOException e1) {

					e1.printStackTrace();
				}

				Panel2.setVisible(false);
				Panel3.setVisible(true);

			}

		});

		Ok2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				forField = GiveHint.getText();
				Panel3b.setVisible(false);
				Panel4.setVisible(true);
				Hint();
				/*
				 * try { ChooseMode(); } catch (IOException e1) { // TODO
				 * Auto-generated catch block e1.printStackTrace(); }
				 */

				// frame1.setVisible(true);

				// f.dispose();
				/// f.setVisible(false);

				// repaint();
			}

		});

		Easy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				select = 1;
				forHints();
				System.out.println(hintss);
			}

		});
		Medium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				select = 2;
				forHints();
			}

		});
		Hard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				select = 3;
				forHints();
			}

		});
		VeryHard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				select = 4;
				forHints();
			}

		});
		Extreme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				select = 5;
				forHints();

			}

		});

	}

	void forHints() {
		if (choosemode == 1) {
			Panel3.setVisible(false);

			Panel3b.setVisible(true);
			level();
		}
		if (choosemode == 2) {

			Panel3.setVisible(false);
			Panel4.setVisible(true);
			level();
			Hint();
		}
	}

	void checkHint() {
		counter = 0;
		String compare[] = new String[orig.length()];

		for (int i = 0; i < orig.length(); i++) {
			compare[i] = original[i];
		}

		String checkWith = GiveHint.getText();
		String check[] = new String[hintss];

		for (int i = 0; i < hintss; i++) {
			check[i] = checkWith.valueOf(checkWith.charAt(i));
			System.out.print(check[i]);
		}

		for (int i = 0; i < hintss; i++) {
			for (int j = 0; j < orig.length(); j++) {

				if (check[i].equalsIgnoreCase(compare[j])) {
					counter++;
					System.out.println(" counter is " + counter);
					compare[j] = "_";
					j = orig.length();

				}

			}
		}

		if (counter == hintss) {
			Ok2.setEnabled(true);
		}

	}
	void Images(Graphics a){
		if(remainChance==5)
		a.drawImage(pattern1.getImage(),  665, 80, 53, 127, (ImageObserver) this);
		if(remainChance==4)
		a.drawImage(pattern2.getImage(), 655, 90, 80, 117, (ImageObserver) this);
		if(remainChance==3)
		a.drawImage(pattern3.getImage(),  655, 90, 75, 140, (ImageObserver) this);
		if(remainChance==2)
		a.drawImage(pattern4.getImage(),  655, 80, 76, 172, (ImageObserver) this);
		if(remainChance==1)
		a.drawImage(pattern5.getImage(),  655, 80, 78, 176, (ImageObserver) this);
		if(remainChance==0)
		a.drawImage(pattern6.getImage(), 655, 80, 78, 190, (ImageObserver) this);
		//if(remainChance==0)
	//	a.drawImage(pattern7.getImage(), 1100, 150, 74, 194, (ImageObserver) this);

		
	}

}
