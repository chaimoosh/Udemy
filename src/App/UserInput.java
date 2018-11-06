package App;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// here it asks for text
		System.out.println("Enter text here");
		String line = input.nextLine();
		
		System.out.println("You entered " + line);
	}
}
