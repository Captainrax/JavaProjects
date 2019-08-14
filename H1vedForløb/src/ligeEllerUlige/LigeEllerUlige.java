package ligeEllerUlige;

import java.util.Scanner;

public class LigeEllerUlige {

	private static Scanner input;
	
	
	public static void main(String[] args) {

		
		input = new Scanner(System.in);

		System.out.print("Enter a number! \n" );
		
		if(input.hasNextInt()) {

			int num = Integer.parseInt(input.nextLine());
			// checks if num is even or Odd
			if ((num % 2) == 0) {
				System.out.println("Number is Even");
			} else {
				System.out.println("Number is Odd");
			}
			
		} else {
			System.out.println("Invalid input");
		}

	}

}
