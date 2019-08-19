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
			ArrayList<Integer> matchArray = new ArrayList<Integer>();
			
			for (int i = 0; i < numArray.length; i++) {
				System.out.print("Enter Number " + (i+1) + " : ");
				numArray[i] = input.nextLine();
				// adds input if positive or negative to their own arrays
				if (Integer.parseInt(numArray[i]) == 1) {
					int pcount = (Integer.parseInt(numArray[i]));
					matchArray.add(pcount);
				}
			}
			
			
			if (matchArray.size() > 1)
			System.out.println("The Number 1 was found " + matchArray.size() + " times");
			else {
				System.out.println("The Number 1 was found " + matchArray.size() + " time");
			}
			
		// failsafe	
		} else {
		 	System.out.println("Invalid input");
		}
	}

}
