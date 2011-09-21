public class Oppgave2 {
	public static <E extends Comparable<E>> E max(E[] list)
	{
		E top = list[0];
		
		for (int i = 0; i < list.length; i++)
			if (list[i].compareTo(top) == 1)
				top = list[i];
		
		return top;
	}
	
	@SuppressWarnings("unchecked")
	public static <E extends Comparable<E>> E maxInt(int[] out) 
	{
		E top;
		// Convert the array to object array
		Integer[] ints = new Integer[out.length];
		for (int i = 0; i < out.length; i++)
			ints[i] = out[i];
		top = (E) max(ints);
		return top;
	}
}
