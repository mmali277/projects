package Ludo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JTextField;
import hangmaan.Subscription;

public class Project extends JPanel {
	Graphics a;
	int forcheck;
	static int dice;
	static int mul;
	static int turn = 0;
	static int check = 100;
	int swit;
	Boolean forgreen;
	ActionEvent e;
	MouseEvent b;
	Random khan = new Random();
	ImageIcon goti1 = new ImageIcon("E:\\Netbeans workspace\\ludo\\src\\forImages\\pecaVermelha.png");
	ImageIcon backButton = new ImageIcon("backButton.png");
	JTextField diceshow = new JTextField();

	BlueGoti blue = new BlueGoti();
	RedGoti red = new RedGoti();
	GreenGoti green = new GreenGoti();
	YellowGoti yellow = new YellowGoti();

	/// BlueGoti blue1 = new BlueGoti(300,422);
	BlueGoti blue1 = new BlueGoti(130, 485);

	BlueGoti blue2 = new BlueGoti(160, 485);
	BlueGoti blue3 = new BlueGoti(100, 550);
	BlueGoti blue4 = new BlueGoti(190, 550);
	YellowGoti yellow1 = new YellowGoti(555, 485);
	YellowGoti yellow2 = new YellowGoti(555, 600);
	YellowGoti yellow3 = new YellowGoti(605, 540);
	YellowGoti yellow4 = new YellowGoti(500, 540);
	RedGoti red1 = new RedGoti(140, 65);
	RedGoti red2 = new RedGoti(180, 65);
	RedGoti red3 = new RedGoti(140, 180);
	RedGoti red4 = new RedGoti(180, 180);
	GreenGoti green1 = new GreenGoti(520, 100);
	GreenGoti green2 = new GreenGoti(595, 100);
	GreenGoti green3 = new GreenGoti(520, 140);
	GreenGoti green4 = new GreenGoti(595, 140);
	JFrame frame = new JFrame();
	JButton BackMain = new JButton(backButton);
	ImageIcon man = new ImageIcon("ludo_board.jpg");
	ImageIcon back = new ImageIcon("backg.jpg");
	static ImageIcon forDice1 = new ImageIcon("dice.png");
	static ImageIcon forDice2 = new ImageIcon("C:\\Users\\DELL\\Downloads\\dice2.jpg");
	static ImageIcon zero = new ImageIcon("zero.png");
	// static ImageIcon zero = new
	// ImageIcon(getClass().getResource("resources/0.png"))
	static JLabel label = new JLabel(zero);
	JLabel label1 = new JLabel();

	static ImageIcon animate[] = new ImageIcon[2];
	static JButton dicebt = new JButton(forDice1);

	public Project(JFrame a) {
		frame = a;
		frame.add(this);
		animate[0] = forDice1;
		animate[1] = forDice2;
		add(dicebt);
		blue1.bt.setEnabled(false);
		blue2.bt.setEnabled(false);
		blue3.bt.setEnabled(false);
		blue4.bt.setEnabled(false);

		red1.bt.setEnabled(false);
		red2.bt.setEnabled(false);
		red3.bt.setEnabled(false);
		red4.bt.setEnabled(false);
		yellow1.bt.setEnabled(false);
		yellow2.bt.setEnabled(false);
		yellow3.bt.setEnabled(false);
		yellow4.bt.setEnabled(false);
		add(red1.bt);
		add(red2.bt);
		add(red3.bt);
		add(red4.bt);
		add(blue1.bt);
		add(blue2.bt);
		add(blue3.bt);
		add(blue4.bt);
		add(yellow1.bt);
		add(yellow2.bt);
		add(yellow3.bt);
		add(yellow4.bt);
		add(green1.bt);
		add(green2.bt);
		add(green3.bt);
		add(green4.bt);
		add(label);
		add(label1);
		add(BackMain);

	}

	public void paintComponent(Graphics a) {
		super.paintComponent(a);

		label.setLocation(1100, 0);
		/*
		 * label1.setLocation(800, 300); label1.setVisible(true);
		 * label1.setText("Green"); label1.setIcon(one);
		 */

		switch (turn) {
		case 0:
			green.greenRoll();
			break;
		case 1:
			yellow.yellowRoll();
			break;
		case 2:
			blue.blueRoll();
			break;
		case 3:
			red.redRoll();
			break;
		/*
		 * case 6: label.setIcon(six); break; //case 0: // label.setIcon(zero);
		 * // break; case 5: label.setIcon(five); break;
		 */
		}

		System.out.println("stop x is" + blue.stopOutx[0]);
		System.out.println("stop y is" + blue.stopOuty[0]);
		System.out.println("blue1 x is" + blue1.bluex);
		System.out.println("blue1 y is" + blue1.bluey);
		a.drawImage(back.getImage(), 0, 0, 1366, 768, (ImageObserver) this);
		a.drawImage(man.getImage(), 35, 5, 690, 690, (ImageObserver) this);// 20,0
		diceshow.setLocation(1000, 500);
		diceshow.setSize(100, 50);
		diceshow.setForeground(Color.white);

		if (!dicebt.isEnabled()) {
			System.out.println("nahe chall raha hai");
			switch (turn) {
			case 3:
				red.beforefreed(red1, red2, red3, red4, green1, green2, green3, green4);

				break;
			case 2:
				blue.beforefreed(blue1, blue2, blue3, blue4, red1, red2, red3, red4);

				break;
			case 1:
				yellow.beforefreed(yellow1, yellow2, yellow3, yellow4, blue1, blue2, blue3, blue4);

				break;
			case 0:
				green.beforefreed(green1, green2, green3, green4, yellow1, yellow2, yellow3, yellow4);

				break;

			}
		}

		blue1.paint(a);
		blue2.paint(a);
		blue3.paint(a);
		blue4.paint(a);

		yellow1.paint(a);
		yellow2.paint(a);
		yellow3.paint(a);
		yellow4.paint(a);
		red1.paintComponent(a);
		red2.paintComponent(a);
		red3.paintComponent(a);
		red4.paintComponent(a);

		green1.paint(a);
		green2.paint(a);
		green3.paint(a);
		green4.paint(a);

		blue1.bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				forSix();
				blue1.performBlue(blue1, blue);

				blue1.out11(blue1, red1, 140, 65);
				blue1.out11(blue1, red2, 180, 65);
				blue1.out11(blue1, red3, 140, 180);
				blue1.out11(blue1, red4, 180, 180);
				blue1.out21(blue1, yellow1, 555, 485);
				blue1.out21(blue1, yellow2, 555, 600);
				blue1.out21(blue1, yellow3, 605, 540);
				blue1.out21(blue1, yellow4, 500, 540);
				blue1.out31(blue1, green1, 520, 100);
				blue1.out31(blue1, green2, 595, 100);
				blue1.out31(blue1, green3, 520, 140);
				blue1.out31(blue1, green4, 595, 140);
				afterSix();

				if ((dice != 0 && dice != 6) || BlueGoti.diceCount == 3) {

					System.out.println("blue 1 chal gaya or turn =3");
					turn = 3;
					turn(blue1.bt, blue2.bt, blue3.bt, blue4.bt, false);
					turn(red1.bt, red2.bt, red3.bt, red4.bt, true);
				}
				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				RedGoti.diceCount = 0;
				GreenGoti.diceCount = 0;

				repaint();
			}

		});

		blue2.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				forSix();
				blue2.performBlue(blue2, blue);
				blue2.out11(blue2, red1, 140, 65);
				blue2.out11(blue2, red2, 180, 65);
				blue2.out11(blue2, red3, 140, 180);
				blue2.out11(blue2, red4, 180, 180);
				blue2.out21(blue2, yellow1, 555, 485);
				blue2.out21(blue2, yellow2, 555, 600);
				blue2.out21(blue2, yellow3, 605, 540);
				blue2.out21(blue2, yellow4, 500, 540);
				blue2.out31(blue2, green1, 520, 100);
				blue2.out31(blue2, green2, 595, 100);
				blue2.out31(blue2, green3, 520, 140);
				blue2.out31(blue2, green4, 595, 140);
				afterSix();
				if ((dice != 0 && dice != 6) || BlueGoti.diceCount == 3) {
					turn = 3;
					turn(blue1.bt, blue2.bt, blue3.bt, blue4.bt, false);
					turn(red1.bt, red2.bt, red3.bt, red4.bt, true);
				}
				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				RedGoti.diceCount = 0;
				GreenGoti.diceCount = 0;
				repaint();
			}

		});

		blue3.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				forSix();
				blue3.performBlue(blue3, blue);
				blue3.out11(blue3, red1, 140, 65);
				blue3.out11(blue3, red2, 180, 65);
				blue3.out11(blue3, red3, 140, 180);
				blue3.out11(blue3, red4, 180, 180);
				blue3.out21(blue3, yellow1, 555, 485);
				blue3.out21(blue3, yellow2, 555, 600);
				blue3.out21(blue3, yellow3, 605, 540);
				blue3.out21(blue3, yellow4, 500, 540);
				blue3.out31(blue3, green1, 520, 100);
				blue3.out31(blue3, green2, 595, 100);
				blue3.out31(blue3, green3, 520, 140);
				blue3.out31(blue3, green4, 595, 140);
				afterSix();
				if ((dice != 0 && dice != 6) || BlueGoti.diceCount == 3) {
					turn = 3;
					turn(blue1.bt, blue2.bt, blue3.bt, blue4.bt, false);
					turn(red1.bt, red2.bt, red3.bt, red4.bt, true);
				}
				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				RedGoti.diceCount = 0;
				GreenGoti.diceCount = 0;
				repaint();
			}

		});

		blue4.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				forSix();
				blue4.performBlue(blue4, blue);
				blue4.out11(blue4, red1, 140, 65);
				blue4.out11(blue4, red2, 180, 65);
				blue4.out11(blue4, red3, 140, 180);
				blue4.out11(blue4, red4, 180, 180);
				blue4.out21(blue4, yellow1, 555, 485);
				blue4.out21(blue4, yellow2, 555, 600);
				blue4.out21(blue4, yellow3, 605, 540);
				blue4.out21(blue4, yellow4, 500, 540);
				blue4.out31(blue4, green1, 520, 100);
				blue4.out31(blue4, green2, 595, 100);
				blue4.out31(blue4, green3, 520, 140);
				blue4.out31(blue4, green4, 595, 140);
				afterSix();
				if ((dice != 0 && dice != 6) || BlueGoti.diceCount == 3) {
					turn = 3;
					turn(blue1.bt, blue2.bt, blue3.bt, blue4.bt, false);
					turn(red1.bt, red2.bt, red3.bt, red4.bt, true);
				}
				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				RedGoti.diceCount = 0;
				GreenGoti.diceCount = 0;
				repaint();
			}

		});

		red1.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				forSix();
				red1.performRed(red1, red);

				red1.out11(red1, green1, 520, 100);
				red1.out11(red1, green2, 595, 100);
				red1.out11(red1, green3, 520, 140);
				red1.out11(red1, green4, 595, 140);
				red1.out21(red1, yellow1, 555, 485);
				red1.out21(red1, yellow2, 555, 600);
				red1.out21(red1, yellow3, 605, 540);
				red1.out21(red1, yellow4, 500, 540);
				red1.out31(red1, blue1, 130, 485);
				red1.out31(red1, blue2, 160, 485);
				red1.out31(red1, blue3, 100, 550);
				red1.out31(red1, blue4, 190, 550);
				afterSix();
				if ((dice != 0 && dice != 6) || RedGoti.diceCount == 3) {
					System.out.println("red 1 chal gaya or turn = 0");
					turn = 0;
					turn(green1.bt, green2.bt, green3.bt, green4.bt, true);
					turn(red1.bt, red2.bt, red3.bt, red4.bt, false);
				}
				dice = 0;
				dicebt.setEnabled(true);

				YellowGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				GreenGoti.diceCount = 0;

				repaint();
			}
		});

		red2.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				forSix();
				red2.performRed(red2, red);
				red2.out11(red2, green1, 520, 100);
				red2.out11(red2, green2, 595, 100);
				red2.out11(red2, green3, 520, 140);
				red2.out11(red2, green4, 595, 140);
				red2.out21(red2, yellow1, 555, 485);
				red2.out21(red2, yellow2, 555, 600);
				red2.out21(red2, yellow3, 605, 540);
				red2.out21(red2, yellow4, 500, 540);
				red2.out31(red2, blue1, 130, 485);
				red2.out31(red2, blue2, 160, 485);
				red2.out31(red2, blue3, 100, 550);
				red2.out31(red2, blue4, 190, 550);
				afterSix();
				if ((dice != 0 && dice != 6) || RedGoti.diceCount == 3) {
					turn = 0;
					turn(green1.bt, green2.bt, green3.bt, green4.bt, true);
					turn(red1.bt, red2.bt, red3.bt, red4.bt, false);
				}
				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				GreenGoti.diceCount = 0;

				repaint();
			}

		});

		red3.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				forSix();
				red3.performRed(red3, red);
				red3.out11(red3, green1, 520, 100);
				red3.out11(red3, green2, 595, 100);
				red3.out11(red3, green3, 520, 140);
				red3.out11(red3, green4, 595, 140);
				red3.out21(red3, yellow1, 555, 485);
				red3.out21(red3, yellow2, 555, 600);
				red3.out21(red3, yellow3, 605, 540);
				red3.out21(red3, yellow4, 500, 540);
				red3.out31(red3, blue1, 130, 485);
				red3.out31(red3, blue2, 160, 485);
				red3.out31(red3, blue3, 100, 550);
				red3.out31(red3, blue4, 190, 550);
				afterSix();
				if ((dice != 0 && dice != 6) || RedGoti.diceCount == 3) {
					turn = 0;
					turn(green1.bt, green2.bt, green3.bt, green4.bt, true);
					turn(red1.bt, red2.bt, red3.bt, red4.bt, false);
				}
				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				GreenGoti.diceCount = 0;

				repaint();

			}

		});

		red4.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				forSix();
				red4.performRed(red4, red);
				red4.out11(red4, green1, 520, 100);
				red4.out11(red4, green2, 595, 100);
				red4.out11(red4, green3, 520, 140);
				red4.out11(red4, green4, 595, 140);
				red4.out21(red4, yellow1, 555, 485);
				red4.out21(red4, yellow2, 555, 600);
				red4.out21(red4, yellow3, 605, 540);
				red4.out21(red4, yellow4, 500, 540);
				red4.out31(red4, blue1, 130, 485);
				red4.out31(red4, blue2, 160, 485);
				red4.out31(red4, blue3, 100, 550);
				red4.out31(red4, blue4, 190, 550);
				afterSix();
				if ((dice != 0 && dice != 6) || RedGoti.diceCount == 3) {
					turn = 0;
					turn(green1.bt, green2.bt, green3.bt, green4.bt, true);
					turn(red1.bt, red2.bt, red3.bt, red4.bt, false);
				}
				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				GreenGoti.diceCount = 0;

				repaint();
			}

		});

		green1.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("111111111");
				forSix();

				green1.performGreen(green1, green);

				green1.out11(green1, red1, 140, 65);
				green1.out11(green1, red2, 180, 65);
				green1.out11(green1, red3, 140, 180);
				green1.out11(green1, red4, 180, 180);
				green1.out21(green1, yellow1, 555, 485);
				green1.out21(green1, yellow2, 555, 600);
				green1.out21(green1, yellow3, 605, 540);
				green1.out21(green1, yellow4, 500, 540);
				green1.out31(green1, blue1, 130, 485);
				green1.out31(green1, blue2, 160, 485);
				green1.out31(green1, blue3, 100, 550);
				green1.out31(green1, blue4, 190, 550);

				afterSix();
				if ((dice != 0 && dice != 6) || GreenGoti.diceCount == 3) {
					System.out.println("green 1 chal gaya or turn =1");
					turn = 1;
					dice = 0;
					dicebt.setEnabled(true);
					turn(green1.bt, green2.bt, green3.bt, green4.bt, false);
					turn(yellow1.bt, yellow2.bt, yellow3.bt, yellow4.bt, true);
				}

				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				RedGoti.diceCount = 0;

				repaint();
			}

		});

		green2.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				forSix();
				green2.performGreen(green2, green);
				green2.out11(green2, red1, 140, 65);
				green2.out11(green2, red2, 180, 65);
				green2.out11(green2, red3, 140, 180);
				green2.out11(green2, red4, 180, 180);
				green2.out21(green2, yellow1, 555, 485);
				green2.out21(green2, yellow2, 555, 600);
				green2.out21(green2, yellow3, 605, 540);
				green2.out21(green2, yellow4, 500, 540);
				green2.out31(green2, blue1, 130, 485);
				green2.out31(green2, blue2, 160, 485);
				green2.out31(green2, blue3, 100, 550);
				green2.out31(green2, blue4, 190, 550);
				afterSix();
				if ((dice != 0 && dice != 6) || GreenGoti.diceCount == 3) {
					turn = 1;
					turn(green1.bt, green2.bt, green3.bt, green4.bt, false);
					turn(yellow1.bt, yellow2.bt, yellow3.bt, yellow4.bt, true);
				}

				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				RedGoti.diceCount = 0;
				repaint();
			}

		});

		green3.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				forSix();
				green3.performGreen(green3, green);
				green3.out11(green3, red1, 140, 65);
				green3.out11(green3, red2, 180, 65);
				green3.out11(green3, red3, 140, 180);
				green3.out11(green3, red4, 180, 180);
				green3.out21(green3, yellow1, 555, 485);
				green3.out21(green3, yellow2, 555, 600);
				green3.out21(green3, yellow3, 605, 540);
				green3.out21(green3, yellow4, 500, 540);
				green3.out31(green3, blue1, 130, 485);
				green3.out31(green3, blue2, 160, 485);
				green3.out31(green3, blue3, 100, 550);
				green3.out31(green3, blue4, 190, 550);
				afterSix();
				if (dice != 0 && dice != 6 || GreenGoti.diceCount == 3) {
					turn = 1;
					turn(green1.bt, green2.bt, green3.bt, green4.bt, false);
					turn(yellow1.bt, yellow2.bt, yellow3.bt, yellow4.bt, true);
				}
				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				RedGoti.diceCount = 0;
				repaint();
			}

		});

		green4.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				forSix();
				green4.performGreen(green4, green);
				green4.out11(green4, red1, 140, 65);
				green4.out11(green4, red2, 180, 65);
				green4.out11(green4, red3, 140, 180);
				green4.out11(green4, red4, 180, 180);
				green4.out21(green4, yellow1, 555, 485);
				green4.out21(green4, yellow2, 555, 600);
				green4.out21(green4, yellow3, 605, 540);
				green4.out21(green4, yellow4, 500, 540);
				green4.out31(green4, blue1, 130, 485);
				green4.out31(green4, blue2, 160, 485);
				green4.out31(green4, blue3, 100, 550);
				green4.out31(green4, blue4, 190, 550);
				afterSix();
				if ((dice != 0 && dice != 6) || GreenGoti.diceCount == 3) {
					turn = 1;
					turn(green1.bt, green2.bt, green3.bt, green4.bt, false);
					turn(yellow1.bt, yellow2.bt, yellow3.bt, yellow4.bt, true);
				}
				dice = 0;
				dicebt.setEnabled(true);
				YellowGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				RedGoti.diceCount = 0;
				repaint();
			}

		});

		yellow1.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				forSix();
				yellow1.performYellow(yellow1, yellow);

				yellow1.out11(yellow1, red1, 140, 65);
				yellow1.out11(yellow1, red2, 180, 65);
				yellow1.out11(yellow1, red3, 140, 180);
				yellow1.out11(yellow1, red4, 180, 180);
				yellow1.out21(yellow1, blue1, 130, 485);
				yellow1.out21(yellow1, blue2, 160, 485);
				yellow1.out21(yellow1, blue3, 100, 550);
				yellow1.out21(yellow1, blue4, 190, 550);
				yellow1.out31(yellow1, green1, 520, 100);
				yellow1.out31(yellow1, green2, 595, 100);
				yellow1.out31(yellow1, green3, 520, 140);
				yellow1.out31(yellow1, green4, 595, 140);
				afterSix();
				if ((dice != 0 && dice != 6) || YellowGoti.diceCount == 3) {
					System.out.println("yellow 1 chal gaya or turn = 2");
					turn = 2;
					turn(blue1.bt, blue2.bt, blue3.bt, blue4.bt, true);
					turn(yellow1.bt, yellow2.bt, yellow3.bt, yellow4.bt, false);
				}

				dice = 0;
				dicebt.setEnabled(true);

				GreenGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				RedGoti.diceCount = 0;

				repaint();
			}

		});

		yellow2.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				forSix();
				yellow2.performYellow(yellow2, yellow);
				yellow2.out11(yellow2, red1, 140, 65);
				yellow2.out11(yellow2, red2, 180, 65);
				yellow2.out11(yellow2, red3, 140, 180);
				yellow2.out11(yellow2, red4, 180, 180);
				yellow2.out21(yellow2, blue1, 130, 485);
				yellow2.out21(yellow2, blue2, 160, 485);
				yellow2.out21(yellow2, blue3, 100, 550);
				yellow2.out21(yellow2, blue4, 190, 550);
				yellow2.out31(yellow2, green1, 520, 100);
				yellow2.out31(yellow2, green2, 595, 100);
				yellow2.out31(yellow2, green3, 520, 140);
				yellow2.out31(yellow2, green4, 595, 140);
				afterSix();
				if ((dice != 0 && dice != 6) || YellowGoti.diceCount == 3) {
					turn = 2;
					turn(blue1.bt, blue2.bt, blue3.bt, blue4.bt, true);
					turn(yellow1.bt, yellow2.bt, yellow3.bt, yellow4.bt, false);
				}
				dice = 0;
				dicebt.setEnabled(true);

				GreenGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				RedGoti.diceCount = 0;
				repaint();
			}

		});

		yellow3.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				forSix();
				yellow3.performYellow(yellow3, yellow);
				yellow3.out11(yellow3, red1, 140, 65);
				yellow3.out11(yellow3, red2, 180, 65);
				yellow3.out11(yellow3, red3, 140, 180);
				yellow3.out11(yellow3, red4, 180, 180);
				yellow3.out21(yellow3, blue1, 130, 485);
				yellow3.out21(yellow3, blue2, 160, 485);
				yellow3.out21(yellow3, blue3, 100, 550);
				yellow3.out21(yellow3, blue4, 190, 550);
				yellow3.out31(yellow3, green1, 520, 100);
				yellow3.out31(yellow3, green2, 595, 100);
				yellow3.out31(yellow3, green3, 520, 140);
				yellow3.out31(yellow3, green4, 595, 140);
				afterSix();
				if ((dice != 0 && dice != 6) || YellowGoti.diceCount == 3) {
					turn = 2;
					turn(blue1.bt, blue2.bt, blue3.bt, blue4.bt, true);
					turn(yellow1.bt, yellow2.bt, yellow3.bt, yellow4.bt, false);
				}
				dice = 0;
				dicebt.setEnabled(true);

				GreenGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				RedGoti.diceCount = 0;
				repaint();
			}

		});

		yellow4.bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				forSix();
				yellow4.performYellow(yellow4, yellow);
				yellow4.out11(yellow4, red1, 140, 65);
				yellow4.out11(yellow4, red2, 180, 65);
				yellow4.out11(yellow4, red3, 140, 180);
				yellow4.out11(yellow4, red4, 180, 180);
				yellow4.out21(yellow4, blue1, 130, 485);
				yellow4.out21(yellow4, blue2, 160, 485);
				yellow4.out21(yellow4, blue3, 100, 550);
				yellow4.out21(yellow4, blue4, 190, 550);
				yellow4.out31(yellow4, green1, 520, 100);
				yellow4.out31(yellow4, green2, 595, 100);
				yellow4.out31(yellow4, green3, 520, 140);
				yellow4.out31(yellow4, green4, 595, 140);
				afterSix();
				if ((dice != 0 && dice != 6) || YellowGoti.diceCount == 3) {
					turn = 2;
					turn(blue1.bt, blue2.bt, blue3.bt, blue4.bt, true);
					turn(yellow1.bt, yellow2.bt, yellow3.bt, yellow4.bt, false);
				}
				dice = 0;
				dicebt.setEnabled(true);

				GreenGoti.diceCount = 0;
				BlueGoti.diceCount = 0;
				RedGoti.diceCount = 0;
				repaint();
			}

		});
		BackMain.setContentAreaFilled(false);
		BackMain.setFocusPainted(false);
		BackMain.setOpaque(false);
		BackMain.setSize(200, 100);
		BackMain.setLocation(1100, 500);
		BackMain.setText("Back to main");

		BackMain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);

				Subscription.f.setVisible(true);

				Subscription.thirdPanel.setVisible(true);
			}

		});
		dicebt.setText("dice");
		// dicebt.setBorderPainted(false);
		dicebt.setContentAreaFilled(false);
		dicebt.setFocusPainted(false);
		dicebt.setOpaque(false);
		dicebt.setLocation(1100, 250);
		dicebt.setSize(200, 200);
		dicebt.setDisabledIcon(forDice1);

		dicebt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dice = 1 + khan.nextInt(6);
				// dice = 6;

				dicebt.setEnabled(false);

				blue1.stop = false;
				blue2.stop = false;
				blue3.stop = false;
				blue4.stop = false;

				red1.stop = false;
				red2.stop = false;
				red3.stop = false;
				red4.stop = false;

				green1.stop = false;
				green2.stop = false;
				green3.stop = false;
				green4.stop = false;

				yellow1.stop = false;
				yellow2.stop = false;
				yellow3.stop = false;
				yellow4.stop = false;
				mul = 0;
				diceshow.setText("" + dice + " " + blue1.bluex + " " + blue1.bluey);

				System.out.println(dice);
				repaint();
			}

		});

	}

	void turn(JButton a, JButton b, JButton c, JButton d, Boolean e) {

		a.setEnabled(e);
		b.setEnabled(e);
		c.setEnabled(e);
		d.setEnabled(e);
	}

	void afterSix() {
		blue.afterSixBlue(blue1);
		blue.afterSixBlue(blue2);
		blue.afterSixBlue(blue3);
		blue.afterSixBlue(blue4);
		yellow.afterSixYellow(yellow1);
		yellow.afterSixYellow(yellow2);
		yellow.afterSixYellow(yellow3);
		yellow.afterSixYellow(yellow4);
		red.afterSixRed(red1);
		red.afterSixRed(red2);
		red.afterSixRed(red3);
		red.afterSixRed(red4);
		green.afterSixGreen(green2);
		green.afterSixGreen(green1);
		green.afterSixGreen(green3);
		green.afterSixGreen(green4);

	}

	void forSix() {

		green.forSixGreen(green1, green2, green3, green4);
		red.forSixRed(red1, red2, red3, red4);
		blue.forSixBlue(blue1, blue2, blue3, blue4);
		yellow.forSixYellow(yellow1, yellow2, yellow3, yellow4);

	}

	void priority() {

	}

}