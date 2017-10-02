package hangmaan;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class test extends JPanel {

	public static void main(String args[]) throws IOException {

		JFrame frame = new JFrame();
		Subscription g = new Subscription(frame);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(g);
		frame.setSize(1000, 1000);
		frame.setBounds(0, 0, 1366, 768);
		frame.setVisible(true);

	}

}
