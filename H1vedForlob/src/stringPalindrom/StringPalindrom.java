package stringPalindrom;

import java.util.Scanner;

public class StringPalindrom {

	private static Scanner input;
	
	public static void main(String[] args) {
		

        input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        
        String userInput, b = "";
        userInput = input.nextLine();

        int n = userInput.length();
        // adds userInput to b starting from the last char
        for(int i = n - 1; i >= 0; i--) {
            b = b + userInput.charAt(i);
            System.out.println(b);
        }
        // checks if userInput match's b
        if(userInput.equalsIgnoreCase(b))  {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
	}

}
