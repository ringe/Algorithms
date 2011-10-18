package oblig1;
import java.util.Random;

public class Oppgave1
{
	private int n;
	private int[] a;
	
	// Oppgave a
	public Oppgave1(int n)
	{
		this.n = n;
		this.a = new int[n];            // plass til n heltall
		   
		for (int i = 0; i < a.length; i++)
		   a[i] = i+1;
	}
	
	// Oppgave b
	Oppgave1(int n, boolean yes) throws Exception
	{
		if ( n % 2 != 0 )
			throw new Exception("You have to give an even number here");
		
		this.a = new int[n];            // plass til n heltall
		this.n = n;
		
		int b = -(n/2);   
		for (int i = 0; i < a.length; i++){
			if (b==0)
				b+=1;
			a[i] = b;
		    b+=1;
		}
	}
	
   // Get an array of numbers
   public void getNum() {
	   for (int i = 0; i < a.length; i++)
		   a[i] = i+1;
   }
   
   
   
   // Permutation
   public int[] permute() {
	   Random r = new Random();         // class Random fra java.util
	   
	   for (int i = 0; i < a.length; i++)
	   {
		   int n = a.length;
		   int o = r.nextInt(n - i); 	// Get a random number in the range n - i
		   o += i;						// Add i to the number, to skip ahead in the array
		   o += 1;						// Add 1 to the number, to transform from position to real number
		   
		   if (o < n) {
			   int h = a[i];
			   a[i] = a[o];
			   a[o] = h;
		   }
	   }
	   return a;
   }
   
   // Print array
   public void print(String s)
   {
	   String res = "";
	   System.out.println(s);
	   for (int i = 0; i < a.length; i++)
		   res += a[i] + " ";
	   System.out.println(res);
   }
   
   // Test the randomness of the permutation
   public void testPermutation(int times) {
	   // Prepare results collection
	   int[][] results = new int[n][n];
	   
	   // Run permutation a hundred times
	   for (int i = 0; i < times; i++) {
		   getNum(); 				// Get a new array
		   int[] out = permute(); 	// Retrieve results of permutation
		   
		   // Record the results in results[pos][num] where pos is position and num is
		   // how many times a number was placed here.
		   for (int pos = 0; pos < n; pos++) {
			   int num = out[pos];			// get the number at the given position 
			   results[pos][num - 1]++;		// for this position, count the number 
		   }
	   }
	   
	   // Print the results
	   String o = "When run " + times + " times:";
	   for (int i = 0; i < results.length; i++)
		   o += "\t" + (i + 1);
	   System.out.println(o);
	   o = "===================";
	   for (int i = 0; i < results.length; i++)
		   o += "\t=";
	   System.out.println(o);
	   for (int pos = 0; pos < results.length; pos++) {
		   System.out.print("Position " + pos + " counted:\t");
		   int num = 1;
		   for (int count : results[pos]) {
			   System.out.print(count + "\t");
			   num++;
		   }
		   System.out.println("");
	   }
			   			   
	   
   }
}