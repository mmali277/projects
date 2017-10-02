package hangmaan;

public class Hints extends DifficultyLevel {
	public void Hint() {

		switch (choosemode) {
		case 1:

			String getHint = FinalGUI.forField;

			if (stop == false) {
				for (int i = 0; i < hintss; i++) {
					for (int j = 0; j < orig.length(); j++) {

						if (getHint.valueOf(getHint.charAt(i)).equals(duplicate[j])) {
							hint[j] = duplicate[j];
							System.out.println("it runs " + hintss + " times");
							duplicate[j] = " _ ";
							j = orig.length();
							stop = true;

						}
					}
				}
			}
			for (int i = 0; i < orig.length(); i++) {
				System.out.print(hint[i]);

			}

			break;
		case 2:
			for (int i = 0; i < orig.length(); i++)
				hint[i] = " _ ";
			for (i = 0; i < (hintss); i++) {

				int loc = khan1.nextInt(orig.length()); // channnnngedjedjejjejjjjjjjjjjjjjjjjjjjjj
				hint[loc] = original[loc];
				System.out.print("loc is " + loc);
			}
			System.out.print("hint [i] is ");
			for (int i = 0; i < orig.length(); i++)
				System.out.print(hint[i]);
			break;

		}

	}
}
