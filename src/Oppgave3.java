import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oppgave3 {
	public static <E extends Comparable<E>> void count(E[] list)
	{
		int pos = 0;
		int length = 0;
		int l = 1;
		int p = 0;
		
		for (int i = 1; i < list.length; i++)
		{
			if (list[i].compareTo(list[i-1]) == -1)
				l=1;
			else
				l++;
			if(l>length)
				length=l;
		}
		
		System.out.print(length);
		//return list[pos];
	}
	
	
	public static void read() throws IOException{

		List<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Skriv inn en sekvens med heltall, avslutt med 0 (null): ");
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
				System.out.println("Bare tall, takk");
				done=true;
			}
		} while(!done);
		
		System.out.print("Takk! ");
		System.out.println(numbers.toString());
		
		
		Integer[] ints = new Integer[numbers.size()];
		
		int i = 0;
		for (Integer myInt : numbers)
		{
			ints[i] = myInt;
			i++;
		}
		
		count(ints);
//		
//		
//		while (!(numbers.equals("0"))){
//			numbers = in.read();
//			
//			if (!(numbers.equals("0"))){
//				String[] n = numbers.split("\\s+");
//				Integer[] nn = new Integer[n.length];
//				for (int i = 0; i < n.length; i++)
//					nn[i] = Integer.parseInt(n[i]);
//				count(nn);
//			}
//		}
	}
}