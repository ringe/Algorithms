package oblig1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oppgave3 {
	public static <E extends Comparable<E>> void count(E[] list)
	{
		if (list.length > 0)
		{
			int pos = 0;
			int length = 0;
			int l = 1;
			int p = 0;
			
			for (int i = 1; i < list.length; i++)
			{
				if (list[i].compareTo(list[i-1]) == 0)
					l++;
				else {
					l = 1;
					p = i;
				}
				if(l>length) {
					pos = p;
					length = l;
				}
			}
			
			System.out.println("" + length + " occurences of the number " + list[pos] + " starting at Array position " + pos);
		} else {
			System.out.println("You have to type some numbers.");
		}
	}
	
	
	public Oppgave3() throws IOException{

		List<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Type one number at a time, end with 0 (null): ");
		Scanner keyboard = new Scanner(System.in);

		boolean done=false;
		do {
			try {
				int i = keyboard.nextInt();
				if (i==0)
					done = true;
				else
					numbers.add(i);
			} catch(Exception e) {
				System.out.println("Only numbers, please.");
				done=true;
			}
		} while(!done);
		
		System.out.print("Thanks! ");
		System.out.println(numbers.toString());
		
		
		Integer[] ints = new Integer[numbers.size()];
		
		int i = 0;
		for (Integer myInt : numbers)
		{
			ints[i] = myInt;
			i++;
		}
		
		count(ints);
	}
}