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
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Choose extends JPanel {
	String duplicate[];
	boolean stop = false;
	int incre = 0;
	boolean win = false;
	boolean lose = false;
	int remainChance;
	static String orig = "";
	String wrongGuessedwords = "";
	String RightGuessedwords = "";
	int i, g = 0, j = 0, z = 0;
	static int d;
	static int chance;
	static int choosemode = 0;
	Scanner khan = new Scanner(System.in);
	Random khan1 = new Random();
	static int select = 0;
	static int limit;
	static int guesses;
	static int hintss;
	JButton challengingMode = new JButton();
	JButton NormalMode = new JButton();
	ImageIcon back = new ImageIcon("C:\\Users\\DELL\\Downloads\\wood7.jpg");
	String wel = "Welcome";
	static String hint[];

	static String original[];
	Subscription oo = new Subscription();

	

	public void ChooseMode() throws IOException {
		for (i = 0; i < 4;) {

			if (choosemode == 1 || choosemode == 2) {
				i = 4;
				switch (choosemode) {
				case 1:

					orig = FinalGUI.writeWord.getText();
					System.out.println(orig);
					stop = false;
					break;

				case 2:
					int selectmode = khan1.nextInt(128);

					oo.readFile();
					orig = oo.origword[selectmode];

					break;
				}
			} else
				System.out.println("Wrong Entry! Please select valid choice.");

		}
		original = new String[orig.length()];
		duplicate = new String[orig.length()];
		for (i = 0; i < orig.length(); i++) {
			original[i] = orig.valueOf(orig.charAt(i));
			duplicate[i] = orig.valueOf(orig.charAt(i));
		}

		limit = orig.length();

		guesses = limit / 2;

		hintss = (limit / 2) - 1;

		hint = new String[limit]; // used for hints to be given
		// used to store correct guessed
		// letters

		for (i = 0; i < orig.length(); i++) {

			hint[i] = " _ ";
		}

	}

}
