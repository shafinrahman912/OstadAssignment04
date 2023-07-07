package root;

import java.util.Scanner;
import checking.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringCheck stringOne = new StringCheck();

		System.out.println("\nEnter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("\nGiven String: " + str);
		sc.close();

//		method that checks whether all the characters in a given string are vowels or not.

		stringOne.isVowel(str);

	}

}
