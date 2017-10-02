package hangmaan;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DifficultyLevel extends Choose {
	JButton newgame = new JButton();
	JButton quit = new JButton();
	JButton challengingMode = new JButton();
	JButton ggg = new JButton();
	JButton queeit = new JButton();
	ImageIcon back = new ImageIcon("C:\\Users\\DELL\\Downloads\\wood7.jpg");
	String wel = "Welcome";
	JFrame frame3 = new JFrame();
	JFrame currentFrame3 = new JFrame();
	JFrame backframe2 = new JFrame();
	JFrame backFrameNewgame = new JFrame();
	JFrame backFrameForBoth = new JFrame();

	public void level() {

		System.out.println("Choose difficulty level: ");

		if (orig.length() == 2 || orig.length() == 3) {
			{
				for (int l = 0; l < 2;) {

					System.out.println("1 = Easy :");
					System.out.println("2 = Medium :");
					System.out.println("3 = Hard :");
					// select = khan.nextInt();
					if (select == 1 || select == 2 || select == 3)
						l = 2;
					else
						System.out.println("Wrong Entry! Please select valid choice.");
				}
				switch (select) {

				case 1:
					guesses = (limit / 2) + 3;
					hintss = limit / 2;
					break;
				case 2:
					guesses = (limit / 2) + 2;
					hintss = limit / 2;

					break;
				case 3:
					guesses = (limit / 2) + 1;
					hintss = limit / 2;
					break;
				}
			}
		}

		else if (orig.length() == 5 || orig.length() == 4 || orig.length() == 6) {

			for (int l = 0; l < 2;) {

				System.out.println("1 = Can I play,Daddy? \n2 = Don't Hurt me." + "\n3 = Bring 'em on!");
				// select = khan.nextInt();
				if (select == 1 || select == 2 || select == 3)
					l = 2;
				else
					System.out.println("Wrong Entry! Please select valid choice.");

			}
			switch (select) {

			case 1:
				guesses = (limit / 2) + 1;
				break;
			case 2:
				guesses = (limit / 2);

				break;
			case 3:
				guesses = (limit / 2) - 1;

				break;
			}

		} else {
			for (int l = 0; l < 2;) {
				System.out.println("1 = Recruit" + "\nIf you are new \n2 = Regular\n"
						+ "Your abilities in combat will be tested. \n3 = Hardened"
						+ "\nYour skills will be strained.  \n4 = Veteran" + "\nYou will not survive. \n5 = Realistic\n"
						+ "Brutally difficult and entirely unforgiving.");
				// select = khan.nextInt();
				if (select == 1 || select == 2 || select == 3 || select == 4 || select == 5)
					l = 2;
				else
					System.out.println("Wrong Entry! Please select valid choice.");
			}
			switch (select) {

			case 1:
				guesses = (limit / 2) + 1;
				break;
			case 2:
				guesses = (limit / 2);

				break;
			case 3:
				guesses = (limit / 2) - 1;
				break;
			case 4:
				guesses = (limit / 2) - 1;
				hintss = (limit / 2) - 2;
				break;
			case 5:
				guesses = (limit / 2) - 2;
				hintss = (limit / 2) - 2;
				break;

			}
		}

		remainChance = guesses;
	}
}
