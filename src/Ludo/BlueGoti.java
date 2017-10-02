package Ludo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author DELL
 */
public class BlueGoti extends JPanel implements MovementBlue {
	// JButton bn = new JButton();
	int bluex;
	int bluey;
	int boxx[] = new int[57];
	int boxy[] = new int[57];
	static int stopOutx[] = new int[8];
	static int stopOuty[] = new int[8];
	int add;
	int count = 0;
	int dicex1;
	int dicey1;
	static ImageIcon bone = new ImageIcon("bone.png");
	static ImageIcon btwo = new ImageIcon("btwo.png");
	static ImageIcon bthree = new ImageIcon("bthree.png");
	static ImageIcon bfour = new ImageIcon("bfour.png");
	static ImageIcon bfive = new ImageIcon("bfive.png");
	static ImageIcon bsix = new ImageIcon("bsix.png");
	ImageIcon goti1 = new ImageIcon("E:\\Netbeans workspace\\ludo\\src\\forImages\\pecaAzul.png");
	JButton bt = new JButton(goti1);

	int addCount;
	static int diceCount = 0;
	Boolean freed = false;
	Boolean stop = false;

	BlueGoti(int a, int b) {
		bluex = a;
		bluey = b;
	}

	BlueGoti() {
		boxx[0] = 300;
		boxy[0] = 610;

		for (int i = 1; i <= 4; i++) {
			boxy[i] = boxy[i - 1] - 47;
			boxx[i] = 300;
		}
		for (int i = 5; i <= 10; i++) {
			boxx[i] = boxx[i - 1] - 45;
			boxy[i] = boxy[4] - 46;
		}
		for (int i = 11; i <= 12; i++) {
			boxy[i] = boxy[i - 1] - 46;
			boxx[i] = boxx[10];
		}
		for (int i = 13; i <= 17; i++) {
			boxy[i] = boxy[12];
			boxx[i] = boxx[i - 1] + 46;

		}
		for (int i = 18; i <= 23; i++) {
			boxy[i] = boxy[i - 1] - 46;
			boxx[i] = boxx[17] + 45;

		}
		for (int i = 24; i <= 25; i++) {
			boxy[i] = boxy[23];
			boxx[i] = boxx[i - 1] + 45;

		}
		for (int i = 26; i <= 30; i++) {
			boxy[i] = boxy[i - 1] + 46;
			boxx[i] = boxx[25];

		}
		for (int i = 31; i <= 36; i++) {
			boxy[i] = boxy[30] + 46;
			boxx[i] = boxx[i - 1] + 45;

		}
		for (int i = 37; i <= 38; i++) {
			boxy[i] = boxy[i - 1] + 46;
			boxx[i] = boxx[36];

		}
		for (int i = 39; i <= 43; i++) {
			boxy[i] = boxy[38];
			boxx[i] = boxx[i - 1] - 45;

		}
		for (int i = 44; i <= 49; i++) {
			boxy[i] = boxy[i - 1] + 46;
			boxx[i] = boxx[43] - 45;

		}
		for (int i = 50; i <= 50; i++) {
			boxy[i] = boxy[49];
			boxx[i] = boxx[49] - 45;

		}
		for (int i = 51; i <= 56; i++) {
			boxy[i] = boxy[i - 1] - 46;
			boxx[i] = boxx[50];

		}

		stopOutx[0] = boxx[0];
		stopOuty[0] = boxy[0];
		stopOutx[1] = boxx[8];
		stopOuty[1] = boxy[8];
		stopOutx[2] = boxx[13];
		stopOuty[2] = boxy[13];
		stopOutx[3] = boxx[21];
		stopOuty[3] = boxy[21];
		stopOutx[4] = boxx[26];
		stopOuty[4] = boxy[26];
		stopOutx[5] = boxx[34];
		stopOuty[5] = boxy[34];
		stopOutx[6] = boxx[39];
		stopOuty[6] = boxy[39];
		stopOutx[7] = boxx[47];
		stopOuty[7] = boxy[47];

	}

	public void paint(Graphics g) {
		super.paint(g);
		bt.setLocation(bluex, bluey);
		bt.setBorderPainted(false);
		bt.setContentAreaFilled(false);
		bt.setFocusPainted(false);
		bt.setOpaque(false);
		bt.setDisabledIcon(goti1);
	}

	void out11(BlueGoti x, RedGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.redx != stopOutx[i] && y.redy != stopOuty[i]) {
				count++;
			}
		}
		if ((x.bluex == y.redx) && (x.bluey == y.redy) && count == 0) {
			y.redx = a;
			y.redy = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	void out21(BlueGoti x, YellowGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.yelx == stopOutx[i] && y.yely == stopOuty[i]) {
				count++;
			}
		}
		if ((x.bluex == y.yelx) && (x.bluey == y.yely) && count == 0) {
			y.yelx = a;
			y.yely = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	void out31(BlueGoti x, GreenGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.greenx == stopOutx[i] && y.greeny == stopOuty[i]) {
				count++;
			}
		}
		if ((x.bluex == y.greenx) && (x.bluey == y.greeny) && count == 0) {
			y.greenx = a;
			y.greeny = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	public void performBlue(BlueGoti a, BlueGoti b) {
		if (a.freed == false) {
			if (Project.dice == 6) {

				a.bluex = b.boxx[0];
				a.bluey = b.boxy[0];
				a.freed = true;
				Project.mul = 1;
				a.stop = true;
			}
		}
		if (a.freed == true && a.stop == false) {
			Project.mul = 0;
			if (Project.dice == 6 && (a.bluex != 520 && a.bluey != 100) && Project.mul == 0) {
				if (a.add + Project.dice == 56 || a.add < 51)
					a.add += 6;
				a.bluex = b.boxx[a.add];
				a.bluey = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 5) {
				if (a.add + Project.dice == 56 || a.add < 52)
					a.add += 5;
				a.bluex = b.boxx[a.add];
				a.bluey = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 4) {
				if (a.add + Project.dice == 56 || a.add < 53)
					a.add += 4;

				a.bluex = b.boxx[a.add];
				a.bluey = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 3) {
				if (a.add + Project.dice == 56 || a.add < 54)
					a.add += 3;

				a.bluex = b.boxx[a.add];
				a.bluey = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 2) {
				if (a.add + Project.dice == 56 || a.add < 55)
					a.add += 2;

				a.bluex = b.boxx[a.add];
				a.bluey = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 1) {
				if (a.add + Project.dice == 56 || a.add < 56)
					a.add += 1;

				a.bluex = b.boxx[a.add];
				a.bluey = b.boxy[a.add];
				a.stop = true;
				System.out.println(a.bluey);
			}
		}
	}

	void turn(JButton a, JButton b, JButton c, JButton d, Boolean e) {

		a.setEnabled(e);
		b.setEnabled(e);
		c.setEnabled(e);
		d.setEnabled(e);
	}

	void beforefreed(BlueGoti a, BlueGoti b, BlueGoti c, BlueGoti d, RedGoti e, RedGoti f, RedGoti g, RedGoti h) {

		if (a.freed == false && b.freed == false && c.freed == false && d.freed == false && Project.dice != 6
				&& Project.dice != 0) {

			System.out.println("blue chalaa");

			if ((Project.dice != 0 && Project.dice != 6) || BlueGoti.diceCount == 3) {

				System.out.println("blue 1 chal gaya or turn =3");
				Project.turn = 3;
				turn(a.bt, b.bt, c.bt, d.bt, false);
				turn(e.bt, f.bt, g.bt, h.bt, true);
			}
			Project.dice = 0;
			Project.dicebt.setEnabled(true);
		} else {
			if (a.freed == false && Project.dice != 6 && Project.dice != 0) {
				a.bt.setEnabled(false);

			}

			if (b.freed == false && Project.dice != 6 && Project.dice != 0) {
				b.bt.setEnabled(false);

			}

			if (c.freed == false && Project.dice != 6 && Project.dice != 0) {
				c.bt.setEnabled(false);

			}

			if (d.freed == false && Project.dice != 6 && Project.dice != 0) {
				d.bt.setEnabled(false);

			}

		}
		GreenGoti.diceCount = 0;
		RedGoti.diceCount = 0;
		YellowGoti.diceCount = 0;

	}

	void afterSixBlue(BlueGoti a) {
		if (BlueGoti.diceCount == 3) {
			a.bluex = a.dicex1;
			a.bluey = a.dicey1;
			a.add = a.addCount;

			if (a.dicex1 == 130 && a.dicey1 == 485)
				a.freed = false;
			if (a.dicex1 == 160 && a.dicey1 == 485)
				a.freed = false;
			if (a.dicex1 == 100 && a.dicey1 == 550)
				a.freed = false;
			if (a.dicex1 == 190 && a.dicey1 == 550)
				a.freed = false;
		}

	}

	void forSixBlue(BlueGoti a, BlueGoti b, BlueGoti c, BlueGoti d) {
		if (BlueGoti.diceCount == 0) {
			a.dicex1 = a.bluex;
			a.dicey1 = a.bluey;
			b.dicex1 = b.bluex;
			b.dicey1 = b.bluey;
			c.dicex1 = c.bluex;
			c.dicey1 = c.bluey;
			d.dicex1 = d.bluex;
			d.dicey1 = d.bluey;
			a.addCount = a.add;
			b.addCount = b.add;
			c.addCount = c.add;
			d.addCount = d.add;
		}
		if (Project.dice == 6) {
			BlueGoti.diceCount++;
		}
	}

	void blueRoll() {

		switch (Project.dice) {
		case 1:
			Project.label.setIcon(bone);
			break;
		case 2:
			Project.label.setIcon(btwo);
			break;
		case 3:
			Project.label.setIcon(bthree);
			break;
		case 4:
			Project.label.setIcon(bfour);
			break;
		case 6:
			Project.label.setIcon(bsix);
			break;
		case 5:
			Project.label.setIcon(bfive);
			break;
		}

	}
}
