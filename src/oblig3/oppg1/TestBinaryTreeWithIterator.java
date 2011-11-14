package oblig3.oppg1;

import java.util.Arrays;
import java.util.Iterator;

import oblig3.*;

public class TestBinaryTreeWithIterator {
	public static void main(String[] args) {
		// Opprett et tre
		BinaryTree<String> tree = new BinaryTree<String>();
		String[] names = {"John", "Per", "Ole", "Nils", "Anton", "Rolf", "Tor"};
		for (int i = 0; i < names.length; i++) {
			tree.insert(names[i]);
		}
		System.out.println("Inserted values: " + Arrays.toString(names) + "\n");
		
		// Test inorder iteratoren
		System.out.println("Oppg1: Testing inorder iterator:");
		Iterator ii = tree.inorderIterator();
		while(ii.hasNext())
			System.out.print(ii.next().toString() + " ");
		System.out.println("\n");
		
		// Test preorder iteratoren
		System.out.println("Oppg2: Testing preorder iterator:");
		Iterator ii1 = tree.preorderIterator();
		while(ii1.hasNext())
			System.out.print(ii1.next().toString() + " ");
		System.out.println("\n");
		
		// Test postorder iteratoren
		System.out.println("Oppg2: Testing postorder iterator:");
		Iterator ii11 = tree.postorderIterator();
		while(ii11.hasNext())
			System.out.print(ii11.next().toString() + " ");
		System.out.println("\n");
		
		System.out.println("Oppg3: Number of leaves: " + tree.getNumberOfLeaves());
		
		System.out.println("Oppg4: Number of non leaves: " + tree.getNumberOfNonLeaves());
		
		System.out.println("Oppg5: minimum: " + tree.findMin());
		System.out.println("Oppg5: maximum: " + tree.findMax());
	}
}