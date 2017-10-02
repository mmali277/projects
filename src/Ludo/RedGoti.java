package Ludo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RedGoti extends JPanel implements MovementRed {
	int v;
	int redx;
	int redy;
	int add;
	int dicex1;
	int dicey1;
	int count = 0;
	int addCount;
	static int diceCount = 0;
	Boolean freed = false;
	Boolean stop = false;
	// int boxx[] = new int[57];
	// int boxy[] = new int[57];

	Graphics g;
	ActionEvent e;
	static ImageIcon rone = new ImageIcon("r1.png");
	static ImageIcon rtwo = new ImageIcon("r2.png");
	static ImageIcon rthree = new ImageIcon("r3.png");
	static ImageIcon rfour = new ImageIcon("r4.png");
	static ImageIcon rfive = new ImageIcon("r5.png");
	static ImageIcon rsix = new ImageIcon("r6.png");
	ImageIcon goti1 = new ImageIcon("E:\\Netbeans workspace\\ludo\\src\\forImages\\pecaVermelha.png");
	ImageIcon man = new ImageIcon("C:\\Users\\DELL\\Downloads\\ff8ce7ca004f619b451bd93be3370f6e.jpg");
	BlueGoti bl = new BlueGoti();
	JButton bt = new JButton(goti1);

	RedGoti(int a, int b) {
		redx = a;
		redy = b;

	}

	RedGoti() {
		int cont = 13;
		for (int i = 0; i <= 37; i++) {
			boxx[i] = bl.boxx[cont];
			boxy[i] = bl.boxy[cont];
			cont++;
		}
		boxx[38] = boxx[37] - 45;
		boxy[38] = boxy[37];
		cont = 39;
		for (int i = 0; i <= 11; i++) {
			boxx[cont] = bl.boxx[i];
			boxy[cont] = bl.boxy[i];
			cont++;
		}
		boxx[51] = bl.boxx[11] + 45;
		boxy[51] = bl.boxy[11];
		for (int i = 52; i <= 56; i++) {
			boxx[i] = boxx[i - 1] + 45;
			boxy[i] = bl.boxy[11];
		}

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		bt.setLocation(redx, redy);
		bt.setBorderPainted(false);
		bt.setContentAreaFilled(false);
		bt.setFocusPainted(false);

		bt.setDisabledIcon(goti1);

	}

	void out11(RedGoti x, GreenGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.greenx == BlueGoti.stopOutx[i] && y.greeny == BlueGoti.stopOuty[i]) {
				count++;
			}
		}
		if ((x.redx == y.greenx) && (x.redy == y.greeny) && count == 0) {
			y.greenx = a;
			y.greeny = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	void out21(RedGoti x, YellowGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.yelx == BlueGoti.stopOutx[i] && y.yely == BlueGoti.stopOuty[i]) {
				count++;
			}
		}
		if ((x.redx == y.yelx) && (x.redy == y.yely) && count == 0) {
			y.yelx = a;
			y.yely = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	void out31(RedGoti x, BlueGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.bluex == BlueGoti.stopOutx[i] && y.bluey == BlueGoti.stopOuty[i]) {
				count++;
			}
		}
		if ((x.redx == y.bluex) && (x.redy == y.bluey) && count == 0) {
			y.bluex = a;
			y.bluey = b;
			y.add = 0;
			y.freed = false;
			count = 0;

		}
		count = 0;
	}

	public void performRed(RedGoti a, RedGoti b) {
		if (a.freed == false) {
			if (Project.dice == 6) {

				a.redx = b.boxx[0];
				a.redy = b.boxy[0];
				a.freed = true;
				Project.mul = 1;
				a.stop = true;
			}
		}
		if (a.freed == true && a.stop == false) {
			Project.mul = 0;
			if (Project.dice == 6 && (a.redx != 520 && a.redy != 100) && Project.mul == 0) {
				if (a.add + Project.dice == 56 || a.add < 51)
					a.add += 6;

				a.redx = b.boxx[a.add];
				a.redy = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 5) {

				if (a.add + Project.dice == 56 || a.add < 52)
					a.add += 5;
				a.redx = b.boxx[a.add];
				a.redy = b.boxy[a.add];
				a.stop = true;

			}
			if (Project.dice == 4) {

				if (a.add + Project.dice == 56 || a.add < 53)
					a.add += 4;

				a.redx = b.boxx[a.add];
				a.redy = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 3) {
				if (a.add + Project.dice == 56 || a.add < 54)
					a.add += 3;

				a.redx = b.boxx[a.add];
				a.redy = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 2) {
				if (a.add + Project.dice == 56 || a.add < 55)
					a.add += 2;

				a.redx = b.boxx[a.add];
				a.redy = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 1) {
				if (a.add + Project.dice == 56 || a.add < 56)
					a.add += 1;

				a.redx = b.boxx[a.add];
				a.redy = b.boxy[a.add];
				a.stop = true;
				System.out.println(a.redy);
			}
		}
	}

	void turn(JButton a, JButton b, JButton c, JButton d, Boolean e) {

		a.setEnabled(e);
		b.setEnabled(e);
		c.setEnabled(e);
		d.setEnabled(e);
	}

	void beforefreed(RedGoti a, RedGoti b, RedGoti c, RedGoti d, GreenGoti e, GreenGoti f, GreenGoti g, GreenGoti h) {

		if (a.freed == false && b.freed == false && c.freed == false && d.freed == false && Project.dice != 6
				&& Project.dice != 0) {

			if ((Project.dice != 0 && Project.dice != 6) || RedGoti.diceCount == 3) {
				System.out.println("red 1 chal gaya or turn = 0");
				Project.turn = 0;
				turn(e.bt, f.bt, g.bt, h.bt, true);
				turn(a.bt, b.bt, c.bt, d.bt, false);
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
		BlueGoti.diceCount = 0;
		YellowGoti.diceCount = 0;

	}

	void afterSixRed(RedGoti a) {
		if (RedGoti.diceCount == 3) {
			a.redx = a.dicex1;
			a.redy = a.dicey1;
			a.add = a.addCount;

			if (a.dicex1 == 140 && a.dicey1 == 65)
				a.freed = false;
			if (a.dicex1 == 180 && a.dicey1 == 65)
				a.freed = false;
			if (a.dicex1 == 140 && a.dicey1 == 180)
				a.freed = false;
			if (a.dicex1 == 180 && a.dicey1 == 180)
				a.freed = false;
		}
	}

	void forSixRed(RedGoti a, RedGoti b, RedGoti c, RedGoti d) {
		if (RedGoti.diceCount == 0) {
			a.dicex1 = a.redx;
			a.dicey1 = a.redy;
			b.dicex1 = b.redx;
			b.dicey1 = b.redy;
			c.dicex1 = c.redx;
			c.dicey1 = c.redy;
			d.dicex1 = d.redx;
			d.dicey1 = d.redy;
			a.addCount = a.add;
			b.addCount = b.add;
			c.addCount = c.add;
			d.addCount = d.add;
		}
		if (Project.dice == 6) {
			RedGoti.diceCount++;
		}
	}

	void redRoll() {

		switch (Project.dice) {
		case 1:
			Project.label.setIcon(rone);
			break;
		case 2:
			Project.label.setIcon(rtwo);
			break;
		case 3:
			Project.label.setIcon(rthree);
			break;
		case 4:
			Project.label.setIcon(rfour);
			break;
		case 6:
			Project.label.setIcon(rsix);
			break;
		case 5:
			Project.label.setIcon(rfive);
			break;
		}

	}
}
