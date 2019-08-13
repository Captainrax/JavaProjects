package arraySum;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySum {
	
	private static Scanner input;

	// function adds up sum of ArrayList
	public static int Arraysum( ArrayList<Integer> x) {
		
		int total = 0;
		for ( int i = 0; i < x.size(); i++) {
			total = total += x.get(i);
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);

		System.out.print("Enter a number! " );
		
		if(input.hasNextInt()) {

			// assigns input as the numArray size
			int num = Integer.parseInt(input.nextLine());
			String numArray[] = new String[num];
			ArrayList<Integer> pluscount = new ArrayList<Integer>();
			ArrayList<Integer> negativecount = new ArrayList<Integer>();
			ArrayList<Integer> zerocount = new ArrayList<Integer>();
			// loop adds each input to numArray
			for (int i = 0; i < numArray.length; i++) {
				System.out.print("Enter Number " + (i+1) + " : ");
				numArray[i] = input.nextLine();
				// adds input if positive or negative to their own arrays
				if (Integer.parseInt(numArray[i]) > 0) {
					int pcount = (Integer.parseInt(numArray[i]));
					pluscount.add(pcount);
				} else if (Integer.parseInt(numArray[i]) < 0) {
					int pcount = (Integer.parseInt(numArray[i]));
					negativecount.add(pcount);
				} else {
					int pcount = (Integer.parseInt(numArray[i]));
					zerocount.add(pcount);
				};
			}
			System.out.println("Positive Sum: " + Arraysum(pluscount));
			System.out.println("Negative Sum: " + Arraysum(negativecount));
			System.out.println("Zero's: " + zerocount.size());
		} else {
		 	System.out.println("Invalid input");
		}
	}

}
