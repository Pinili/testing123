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
			System.out.println("OMG, two character!");
		
	}
}
