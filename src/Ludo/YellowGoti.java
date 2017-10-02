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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author DELL
 */
public class YellowGoti extends JPanel implements MovementYellow {

	int yelx;
	int yely;
	int add;
	int count = 0;
	int boxx[] = new int[57];
	int boxy[] = new int[57];
	int dicex1;
	int dicey1;
	int addCount;
	static int diceCount = 0;
	GreenGoti gr = new GreenGoti();
	Boolean freed = false;
	Boolean stop = false;
	static ImageIcon yone = new ImageIcon("y1.png");
	static ImageIcon ytwo = new ImageIcon("y2.png");
	static ImageIcon ythree = new ImageIcon("y3.png");
	static ImageIcon yfour = new ImageIcon("y4.png");
	static ImageIcon yfive = new ImageIcon("y5.png");
	static ImageIcon ysix = new ImageIcon("y6.png");
	ImageIcon goti1 = new ImageIcon("E:\\Netbeans workspace\\ludo\\src\\forImages\\yellow.png");

	JButton bt = new JButton(goti1);

	YellowGoti() {

		int cont = 13;
		for (int i = 0; i <= 37; i++) {
			boxx[i] = gr.boxx[cont];
			boxy[i] = gr.boxy[cont];
			cont++;
		}
		boxx[38] = boxx[37] + 45;
		boxy[38] = boxy[37];
		cont = 39;
		for (int i = 0; i <= 11; i++) {
			boxx[cont] = gr.boxx[i];
			boxy[cont] = gr.boxy[i];
			cont++;
		}
		boxx[51] = gr.boxx[11] - 45;
		boxy[51] = gr.boxy[11];
		for (int i = 52; i <= 56; i++) {
			boxx[i] = boxx[i - 1] - 45;
			boxy[i] = gr.boxy[11];
		}
	}

	YellowGoti(int a, int b) {
		yelx = a;
		yely = b;
	}

	public void paint(Graphics g) {
		super.paint(g);
		bt.setLocation(yelx, yely);
		bt.setBorderPainted(false);
		bt.setContentAreaFilled(false);
		bt.setFocusPainted(false);
		bt.setOpaque(false);
		bt.setDisabledIcon(goti1);

	}

	void out11(YellowGoti x, RedGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.redx == BlueGoti.stopOutx[i] && y.redy == BlueGoti.stopOuty[i]) {
				count++;
			}

		}
		if ((x.yelx == y.redx) && (x.yely == y.redy) && count == 0) {
			y.redx = a;
			y.redy = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	void out21(YellowGoti x, BlueGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.bluex == BlueGoti.stopOutx[i] && y.bluey == BlueGoti.stopOuty[i]) {
				count++;
			}
		}
		if ((x.yelx == y.bluex) && (x.yely == y.bluey) && count == 0) {
			y.bluex = a;
			y.bluey = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	void out31(YellowGoti x, GreenGoti y, int a, int b) {

		for (int i = 0; i < 8; i++) {
			if (y.greenx == BlueGoti.stopOutx[i] && y.greeny == BlueGoti.stopOuty[i]) {
				count++;
			}
		}
		if ((x.yelx == y.greenx) && (x.yely == y.greeny) && count == 0) {
			y.greenx = a;
			y.greeny = b;
			y.add = 0;
			y.freed = false;
			count = 0;
		}
		count = 0;
	}

	public void performYellow(YellowGoti a, YellowGoti b) {
		if (a.freed == false) {
			if (Project.dice == 6) {

				a.yelx = b.boxx[0];
				a.yely = b.boxy[0];
				a.freed = true;
				Project.mul = 1;
				a.stop = true;
			}
		}
		if (a.freed == true && a.stop == false) {
			Project.mul = 0;
			if (Project.dice == 6 && (a.yelx != 520 && a.yely != 100) && Project.mul == 0) {
				if (a.add + Project.dice == 56 || a.add < 51)
					a.add += 6;
				a.yelx = b.boxx[a.add];
				a.yely = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 5) {
				if (a.add + Project.dice == 56 || a.add < 52)
					a.add += 5;
				a.yelx = b.boxx[a.add];
				a.yely = b.boxy[a.add];
				a.stop = true;

			}
			if (Project.dice == 4) {

				if (a.add + Project.dice == 56 || a.add < 53)
					a.add += 4;

				a.yelx = b.boxx[a.add];
				a.yely = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 3) {
				if (a.add + Project.dice == 56 || a.add < 54)
					a.add += 3;

				a.yelx = b.boxx[a.add];
				a.yely = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 2) {
				if (a.add + Project.dice == 56 || a.add < 55)
					a.add += 2;

				a.yelx = b.boxx[a.add];
				a.yely = b.boxy[a.add];
				a.stop = true;
			}
			if (Project.dice == 1) {
				if (a.add + Project.dice == 56 || a.add < 56)
					a.add += 1;

				a.yelx = b.boxx[a.add];
				a.yely = b.boxy[a.add];
				a.stop = true;
				System.out.println(a.yely);
			}
		}
	}

	void turn(JButton a, JButton b, JButton c, JButton d, Boolean e) {

		a.setEnabled(e);
		b.setEnabled(e);
		c.setEnabled(e);
		d.setEnabled(e);
	}

	void beforefreed(YellowGoti a, YellowGoti b, YellowGoti c, YellowGoti d, BlueGoti e, BlueGoti f, BlueGoti g,
			BlueGoti h) {

		if (a.freed == false && b.freed == false && c.freed == false && d.freed == false && Project.dice != 6
				&& Project.dice != 0) {

			System.out.println("yellow chalaa");

			if ((Project.dice != 0 && Project.dice != 6) || YellowGoti.diceCount == 3) {
				System.out.println("yellow 1 chal gaya or turn = 2");
				Project.turn = 2;
				turn(e.bt, f.bt, g.bt, h.bt, true);
				turn(a.bt, b.bt, c.bt, d.bt, false);
			}

			Project.dice = 0;
			Project.dicebt.setEnabled(true);
			;
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
		RedGoti.diceCount = 0;
	}

	void afterSixYellow(YellowGoti a) {
		if (YellowGoti.diceCount == 3) {
			a.yelx = a.dicex1;
			a.yely = a.dicey1;
			a.add = a.addCount;

			if (a.dicex1 == 555 && a.dicey1 == 485)
				a.freed = false;
			if (a.dicex1 == 555 && a.dicey1 == 600)
				a.freed = false;
			if (a.dicex1 == 605 && a.dicey1 == 540)
				a.freed = false;
			if (a.dicex1 == 500 && a.dicey1 == 540)
				a.freed = false;
		}
	}

	void forSixYellow(YellowGoti a, YellowGoti b, YellowGoti c, YellowGoti d) {
		if (YellowGoti.diceCount == 0) {
			a.dicex1 = a.yelx;
			a.dicey1 = a.yely;
			b.dicex1 = b.yelx;
			b.dicey1 = b.yely;
			c.dicex1 = c.yelx;
			c.dicey1 = c.yely;
			d.dicex1 = d.yelx;
			d.dicey1 = d.yely;
			a.addCount = a.add;
			b.addCount = b.add;
			c.addCount = c.add;
			d.addCount = d.add;
		}
		if (Project.dice == 6) {
			YellowGoti.diceCount++;
		}
	}

	void yellowRoll() {

		switch (Project.dice) {
		case 1:
			Project.label.setIcon(yone);
			break;
		case 2:
			Project.label.setIcon(ytwo);
			break;
		case 3:
			Project.label.setIcon(ythree);
			break;
		case 4:
			Project.label.setIcon(yfour);
			break;
		case 6:
			Project.label.setIcon(ysix);
			break;
		case 5:
			Project.label.setIcon(yfive);
			break;
		}

	}
}
