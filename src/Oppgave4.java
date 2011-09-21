import java.io.IOException;
import java.util.Scanner;

public class Oppgave4 {
	public Oppgave4() throws IOException {
		
		System.out.println("Type a short text: ");
		Scanner keyboard = new Scanner(System.in);

		String input = keyboard.nextLine();
		String reverse = reverse(input);
		
		System.out.println(input + ":" + reverse);
		System.out.println("The given string is " + (checkPalindrome(input, reverse) ? "a " : "not a " ) + "palindrome.");
		
	}
	
	public static boolean checkPalindrome(String value, String reverse)
	{
		char[] val = value.toCharArray();
		char[] rev = reverse.toCharArray();
		boolean res = true; 
		
		for (int i = 0; i < val.length; i++)
			if (val[i] != rev[i])
				res = false;

		return res;
	}
	
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
