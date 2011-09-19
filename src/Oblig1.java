public class Oblig1 {
	static Oppgave1 oppg1;
	
	public static void main(String [] args) throws Exception {
		System.out.println("Oppgave 1: int array permutation\n================================");
		
		// Oppgave 1a
		oppg1 = new Oppgave1(15);
		oppg1.print("Oppgave a) Before permutation:");
		oppg1.permute();
		oppg1.print("Oppgave a) After permutation:");
//		oppg1.testPermutation(15000);
		
		// Oppgave 1b
		oppg1 = new Oppgave1(16, true);
		oppg1.print("Oppgave b) Before permutation:");
		int[] out = oppg1.permute();
		oppg1.print("Oppgave b) After permutation:");
		
		// Convert the array to object array
		Integer[] ints = new Integer[out.length];
		for (int i = 0; i < out.length; i++)
			ints[i] = out[i];
		
		// Oppgave 2
		Integer i = Oppgave2.max(ints);
		System.out.println("\nOppgave 2: And the highest number was: " +i);
		
		// Oppgave 3
		Oppgave3.read();
	}
}
