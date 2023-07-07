package checking;

public class StringCheck {

	public void isVowel(String st) {

		boolean flag = true;
		String str = st.toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U') {

				flag = true;
			} else if (str.charAt(i) == ' ') {
				continue;

			} else {
				flag = false;
				break;
			}

		}
		if (flag)
			System.out.println("\nAll Charecters of the input string '" + st + "' are vowel");
		else
			System.out.println("\nAll Charecters of the input string '" + st + "' are not vowel");
	}

}
