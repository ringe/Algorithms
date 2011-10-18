package oblig2;
import java.util.*;

public class CircleSorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] list = {2 , 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		Sort.quicksort(list);
		printList(list);
		
		Circle[] list1 = {
				new Circle("Red", 3),
				new Circle("Green", 8),
				new Circle("Blue", 12),
				new Circle("Yellow", 10),
				new Circle("Blue", 12),
				new Circle("Yellow", 11)
		};
		
		quickSort(list1, new CircleColorComparator());
		printList(list1);

		quickSort(list1, new AreaComparator());
		printList(list1);
	}

	public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {
		quickSort(list, 0, list.length - 1, comparator);
	}
	
	
	
	/**
	 * Print the contents of a list
	 */
	public static <E> void printList(E[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}

}
