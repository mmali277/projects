package Ludo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author DELL
 */
public class GreenGoti extends JPanel implements MovementGreen {
	int greenx;
	int greeny;
	int dicex1;
	int dicey1;
	int addCount;

	int count = 0;
	int add;
	static int diceCount = 0;
	int boxx[] = new int[57];
	int boxy[] = new int[57];
	RedGoti rd = new RedGoti();
	Boolean freed = false;
	Boolean stop = false;
	static ImageIcon gone = new ImageIcon("g1.png");
	static ImageIcon gtwo = new ImageIcon("g2.png");
	static ImageIcon gthree = new ImageIcon("g3.png");
	static ImageIcon gfour = new ImageIcon("g4.png");
	static ImageIcon gfive = new ImageIcon("g5.png");
	static ImageIcon gsix = new ImageIcon("g6.png");
	ImageIcon goti1 = new ImageIcon("E:\\Netbeans workspace\\ludo\\src\\forImages\\green.png");

	JButton bt = new JButton(goti1);

	GreenGoti(int a, int b) {
		greenx = a;
		greeny = b;
	}

	GreenGoti() {

		int cont = 13;
		for (int i = 0; i <= 37; i++) {
			boxx[i] = rd.boxx[cont];
			boxy[i] = rd.boxy[cont];
			cont++;
		}
		boxx[38] = boxx[37];
		boxy[38] = boxy[37] - 46;
		cont = 39;
		for (int i = 0; i <= 11; i++) {
			boxx[cont] = rd.boxx[i];
			boxy[cont] = rd.boxy[i];
			cont++;
		}
		boxx[51] = rd.boxx[11];
		boxy[51] = rd.boxy[11] + 46;
		for (int i = 52; i <= 56; i++) {
			boxy[i] = boxy[i - 1] + 46;
			boxx[i] = rd.boxx[11];
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		bt.setBorderPainted(false);
		bt.setContentAreaFilled(false);
		bt.setFocusPainted(false);
		bt.setOpaque(false);
		System.out.println("ye green me chal raha hai");
		bt.setLocation(greenx, greeny);
		bt.setDisabledIcon(goti1);

		System.out.println("ye b green me chal raha hai");

	}

	void out11(GreenGoti x, RedGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.redx == BlueGoti.stopOutx[i] && y.redy == BlueGoti.stopOuty[i]) {
				count++;
			}
		}
		if ((x.greenx == y.redx) && (x.greeny == y.redy) && count == 0) {
			y.redx = a;
			y.redy = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	void out21(GreenGoti x, YellowGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.yelx == BlueGoti.stopOutx[i] && y.yely == BlueGoti.stopOuty[i]) {
				count++;
			}
		}
		if ((x.greenx == y.yelx) && (x.greeny == y.yely) && count == 0) {
			y.yelx = a;
			y.yely = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	void out31(GreenGoti x, BlueGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.bluex == BlueGoti.stopOutx[i] && y.bluey == BlueGoti.stopOuty[i]) {
				count++;
			}
		}
		if ((x.greenx == y.bluex) && (x.greeny == y.bluey) && count == 0) {
			y.bluex = a;
			y.bluey = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	public void performGreen(GreenGoti a, GreenGoti b) {

		if (a.freed == false) {
			if (Project.dice == 6) {

				a.greenx = b.boxx[0];
				a.greeny = b.boxy[0];
				a.freed = true;
				Project.mul = 1;
				a.stop = true;
			}
		}
		if (a.freed == true && a.stop == false) {
			Project.mul = 0;
			if (Project.dice == 6 && (a.greenx != 520 && a.greeny != 100) && Project.mul == 0) {
				if (a.add + Project.dice == 56 || a.add < 51)
					a.add += 6;

				a.greenx = b.boxx[a.add];
				a.greeny = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 5) {

				if (a.add + Project.dice == 56 || a.add < 52)
					a.add += 5;
				a.greenx = b.boxx[a.add];
				a.greeny = b.boxy[a.add];
				a.stop = true;

			}
			if (Project.dice == 4) {
				//
				if (a.add + Project.dice == 56 || a.add < 53)
					a.add += 4;

				a.greenx = b.boxx[a.add];
				a.greeny = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 3) {
				if (a.add + Project.dice == 56 || a.add < 54)
					a.add += 3;

				a.greenx = b.boxx[a.add];
				a.greeny = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 2) {
				if (a.add + Project.dice == 56 || a.add < 55)
					a.add += 2;

				a.greenx = b.boxx[a.add];
				a.greeny = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 1) {
				if (a.add + Project.dice == 56 || a.add < 56)
					a.add += 1;

				a.greenx = b.boxx[a.add];
				a.greeny = b.boxy[a.add];
				a.stop = true;
				System.out.println(a.greeny);
			}
		}

	}

	void turn(JButton a, JButton b, JButton c, JButton d, Boolean e) {

		a.setEnabled(e);
		b.setEnabled(e);
		c.setEnabled(e);
		d.setEnabled(e);
	}

	void beforefreed(GreenGoti a, GreenGoti b, GreenGoti c, GreenGoti d, YellowGoti e, YellowGoti f, YellowGoti g,
			YellowGoti h) {

		if (a.freed == false && b.freed == false && c.freed == false && d.freed == false && Project.dice != 6
				&& Project.dice != 0) {

			System.out.println("green chalaa");

			System.out.println("aur chalta hii gaya");

			if ((Project.dice != 0 && Project.dice != 6) || GreenGoti.diceCount == 3) {
				System.out.println("green 1 chal gaya or turn =1");
				Project.turn = 1;
				Project.dice = 0;
				Project.dicebt.setEnabled(true);
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

		BlueGoti.diceCount = 0;
		RedGoti.diceCount = 0;
		YellowGoti.diceCount = 0;

	}

	void afterSixGreen(GreenGoti a) {
		if (GreenGoti.diceCount == 3) {
			a.greenx = a.dicex1;
			a.greeny = a.dicey1;
			a.add = a.addCount;

			if (a.dicex1 == 520 && a.dicey1 == 100)
				a.freed = false;
			if (a.dicex1 == 595 && a.dicey1 == 100)
				a.freed = false;
			if (a.dicex1 == 520 && a.dicey1 == 140)
				a.freed = false;
			if (a.dicex1 == 595 && a.dicey1 == 140)
				a.freed = false;
		}

	}

	void forSixGreen(GreenGoti a, GreenGoti b, GreenGoti c, GreenGoti d) {
		if (GreenGoti.diceCount == 0) {
			a.dicex1 = a.greenx;
			a.dicey1 = a.greeny;
			b.dicex1 = b.greenx;
			b.dicey1 = b.greeny;
			c.dicex1 = c.greenx;
			c.dicey1 = c.greeny;
			d.dicex1 = d.greenx;
			d.dicey1 = d.greeny;
			a.addCount = a.add;
			b.addCount = b.add;
			c.addCount = c.add;
			d.addCount = d.add;
		}
		if (Project.dice == 6) {
			GreenGoti.diceCount++;
		}

	}

	void greenRoll() {

		switch (Project.dice) {
		case 1:
			Project.label.setIcon(gone);
			break;
		case 2:
			Project.label.setIcon(gtwo);
			break;
		case 3:
			Project.label.setIcon(gthree);
			break;
		case 4:
			Project.label.setIcon(gfour);
			break;
		case 6:
			Project.label.setIcon(gsix);
			break;
		case 5:
			Project.label.setIcon(gfive);
			break;
		}

	}
}
