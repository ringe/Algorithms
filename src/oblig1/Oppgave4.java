package oblig1;
import java.io.IOException;
import java.util.Scanner;

public class Oppgave4 {
	public Oppgave4() throws IOException {
		
		System.out.println("Type a short text: ");
		Scanner keyboard = new Scanner(System.in);

		String input = keyboard.nextLine();
		
		// Recursive palindrome check
		System.out.println("The given string is " + (doWePal(input) ? "a " : "not a ") + "palindrome");
		
		// Less nice palindrome check
//		String reverse = reverse(input);
//		System.out.println(input + " : reverse : " + reverse);
//		System.out.println("The given string is " + (checkPalindrome(input, reverse) ? "a " : "not a " ) + "palindrome.");

	}
	
	// Check for palindrome recursively
	public static boolean doWePal(String value)
	{
		// If the string is one character, then it is a palindrome.
		// If the string is empty, then we already checked all possible characters.
		if (value.length() == 0 || value.length() == 1)
			return true;
		
		// If the first and the last character is the same, check the rest of the
		// string, minus the first and the last character.
		if (value.charAt(0) == value.charAt(value.length() - 1))
			return doWePal(value.substring(1, value.length() -1));
		
		// Base case.
		return false;
	}
	
	// Check for palindrome character by character
	public static boolean manPal(String value, String reverse)
	{
		char[] val = value.toCharArray();
		char[] rev = reverse.toCharArray();
		boolean res = true; 
		
		for (int i = 0; i < val.length; i++)
			if (val[i] != rev[i])
				res = false;

		return res;
	}
	
	// Return a given string reversed
	public static String reverse(String value) 
	{
		String rev = "";
		char[] inp = value.toCharArray();
		int i;
		
		for (i = inp.length - 1; i >= 0; i--)
			rev += inp[i];
		
		return rev;
	}

}
