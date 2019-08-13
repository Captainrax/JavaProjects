package startopGennemsnit;

import java.util.Arrays;
import java.util.Scanner;

public class StartopGennemsnit {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.print("Enter a number! type # to End ");
		int num = Integer.parseInt(input.nextLine());
 
		String numArray[] = new String[num];
		for (int i = 0; i < numArray.length; i++) {
			System.out.print("Enter Number " + (i+1) + " : ");
			numArray[i] = input.nextLine();
		}
		
		float result = 0;
		for(int i=0;i < numArray.length;i++) {
		    result = result + Integer.parseInt(numArray[i]);
		}
		
		
			System.out.print("Average of " + Arrays.toString(numArray) + " is " +  (result / numArray.length));

	}

}
