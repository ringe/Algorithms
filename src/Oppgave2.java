import java.util.Arrays;

public class Oppgave2 {
	public static <E extends Comparable<E>> E max(E[] list)
	{
		E top = list[0];
		
		for (int i = 0; i < list.length; i++)
			if (list[i].compareTo(top) == 1)
				top = list[i];
		
		return top;
	}
}
