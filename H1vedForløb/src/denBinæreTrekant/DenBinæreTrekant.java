package denBinæreTrekant;

import java.util.Scanner;

public class DenBinæreTrekant {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);

		System.out.print("Enter a number: " );
		
		if(input.hasNextInt()) {

			int num = Integer.parseInt(input.nextLine());
			
			byte count = 1;
			String tri = "";
			// outputs "1"'s and "0"'s based on input
			for(int binary = 0; binary < num; binary++) {
			
			    for(int i = 1; i <= binary; i++) {
			    	if (count <= num) {
			    		tri += "1";
			    		count++;
			    		System.out.println(tri);
			    	}
			    	if (count <= num) {
			    		tri += "0";
			    		count++;
			    		System.out.println(tri);
			    	}
			    }
			}
			
		} else {
			System.out.println("Invalid input");
		}

	}

}
