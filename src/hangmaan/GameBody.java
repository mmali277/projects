package hangmaan;

public class GameBody extends Hints {
	public void Run() {

		System.out.println(
				"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "\n\n\n\n\n\n\n\n" + "\n\n\nenter letters:\n\n1.) You have "
						+ (guesses) + " chances" + "\n2.) You have " + (hintss) + " hints.\n Start!");
		for (i = 0; i < limit; i++) {
			System.out.print(hint[i]);
		}
		z = 0;

		if (!FinalGUI.getWord.isEmpty() && FinalGUI.getWord != "") {

			System.out.println("it runs");
			int checked = 0;
			String guessedword = FinalGUI.getWord;

			System.out.println("guessedword is " + guessedword);
			for (int f = 0; f < limit; f++) {
				if (original[f].equalsIgnoreCase(guessedword)) {

					if ((hint[f] == " _ ") && hint[f] != guessedword) {
						System.out.println("Right Guess");
						hint[f] = guessedword;
						RightGuessedwords = RightGuessedwords + " " + guessedword + " ";
						checked = 1;
					}
				}
			}
			if (checked == 0) {
				System.out.println("Wrong Guess");
				wrongGuessedwords = wrongGuessedwords + " " + guessedword + " ";
				chance++;
				remainChance--;
			}
			System.out.println("chance is " + chance);
			for (int i = 0; i < limit; i++) {
				System.out.print(hint[i]);
			}
			if (chance == guesses + 1) {
				System.out.println("\nYou Lose");
				lose = true;
				chance = 0;
				i = limit + (limit / 2) + 2;
				System.out.println("The Word was:");
				for (int i = 0; i < limit; i++) {
					System.out.print(original[i]);
				}
			}

			for (int y = 0; y < limit; y++) {
				if (hint[y].equalsIgnoreCase(original[y])) {
					z++;
				}
			}
			if (z == limit) {
				System.out.println("\nYou Won\nThe Word was:");
				z = 0;
				chance = 0;
				for (int i = 0; i < limit; i++) {
					System.out.print(original[i]);
				}
				win = true;
				System.out.println("\n\nYou Saved me!! I owe you my life!\n\n");
			}

		}

	}
}