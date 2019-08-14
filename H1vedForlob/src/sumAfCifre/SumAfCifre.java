package sumAfCifre;

import java.util.LinkedList;
import java.util.Scanner;

public class SumAfCifre {

private static Scanner input;
	
	public static void main(String[] args) {

		
		input = new Scanner(System.in);

		System.out.print("Enter a number! \n" );
		
		if(input.hasNextInt()) {

			int num = Integer.parseInt(input.nextLine());
			
			LinkedList<Integer> stack = new LinkedList<Integer>();
			// divides by 10 to get each digit from num, puts it into a LinkedList
			while (num > 0) {
			    stack.push( num % 10 );
			    num = num / 10;
			}
			// adds up the LinkedList with each digit
			int sum = 0;
			for (int i : stack) {
			    sum += i;
			}
			
			System.out.println("The sum is " + sum);
			
			
			
		} else {
		 	System.out.println("Invalid input");
		}

	}
		
}
