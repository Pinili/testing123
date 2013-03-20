//Science Fair 2012-2013

package mainpackage;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your password: ");

		String pass = scan.nextLine();
		if (pass.length() == 0)
			System.out.println("At least enter a character, COME ON!");
		else if (pass.length() == 1)
			System.out.println("Finally, a character!");
		else if (pass.length() == 2)
			System.out.println("OMG, two characters!");
		else if (pass.length() >= 3 && pass.length() <= 5)
			System.out.println("Easy to crack in 5 seconds...");
		else if (pass.length() >= 6 && pass.length() <= 10)
			System.out.println("Not bad for a regular password...");
		else if (pass.length() >= 11 && pass.length() <= 15)
			System.out.println("Very strong password!");
		
	}
}
