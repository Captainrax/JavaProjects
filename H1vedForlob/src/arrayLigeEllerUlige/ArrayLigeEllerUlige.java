package arrayLigeEllerUlige;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLigeEllerUlige {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);

		System.out.print("Enter a number! " );
		// !try catch 
		if(input.hasNextInt()) {

			// assigns input as the numArray size
			int num = Integer.parseInt(input.nextLine());
			if (num > 10) {
				System.out.println("Max size is 10, try agian.");
				return;
			}
			int numArray[] = new int[num];
			ArrayList<Integer> EvenArray = new ArrayList<Integer>();
			ArrayList<Integer> UnevenArray = new ArrayList<Integer>();
			// loop adds each input to numArray
			for (int i = 0; i < numArray.length; i++) {
				System.out.print("Enter Number " + (i+1) + " : ");
				// checks for Int input
				
				while ( input.hasNextInt() == false) {
					numArray[i] = input.nextInt();
				}
				
//				try {
//					numArray[i] = input.nextInt();
//				} catch (Exception e) {
//					System.out.println("No");
//				}
//				if ( input.hasNextInt()) {
//					numArray[i] = input.nextInt();
//				} else {
//					System.out.println("Not an Int");
//				}
			
				// checks if Even or Uneven and adds to own Arrays
				if ((numArray[i] % 2)  == 0) {
					int pcount = numArray[i];
					EvenArray.add(pcount);
				} else {
					int pcount = numArray[i];
					UnevenArray.add(pcount);
				}
				
			}
			
			System.out.println("Even: " + EvenArray);
			System.out.println("Uneven: " + UnevenArray);
			
			
		} else {
		 	System.out.println("Invalid input");
		}
	}

}
