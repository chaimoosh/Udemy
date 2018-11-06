package App;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		
		do {
			System.out.println("Enter a number");
			value = scanner.nextInt();
		}
		while(value != 5);
	}

}
