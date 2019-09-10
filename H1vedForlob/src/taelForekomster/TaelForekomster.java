package taelForekomster;

import java.util.ArrayList;
import java.util.Scanner;


public class TaelForekomster {

	private static Scanner input;

	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);

		System.out.print("Enter a number! " );
		
		// checks for int input
		if(input.hasNextInt()) {

			
			// assigns input as the numArray size
			int num = Integer.parseInt(input.nextLine());
			String numArray[] = new String[num];
			// Asks which number to look for
			System.out.print("Enter which Number to look for: ");
			int choosen = Integer.parseInt(input.nextLine());
			
			ArrayList<Integer> matchArray = new ArrayList<Integer>();
			
			for (int i = 0; i < numArray.length; i++) {
				System.out.print("Enter Number " + (i+1) + " : ");
				numArray[i] = input.nextLine();
				// checks if the choosen number matches with the number inserted into numArray
				if (Integer.parseInt(numArray[i]) == choosen) {
					int pcount = (Integer.parseInt(numArray[i]));
					matchArray.add(pcount);
				}
			}
			
			
			if (matchArray.size() > 1)
			System.out.println("The Number " + choosen + " was found " + matchArray.size() + " times");
			else {
				System.out.println("The Number " + choosen + " was found " + matchArray.size() + " time");
			}
			
		// failsafe	lol
		} else {
		 	System.out.println("Input invalid");
		}
	}

}
