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
		
		quicksort(list1, new CircleColorComparator());
		printList(list1);

		quicksort(list1, new CircleAreaComparator());
		printList(list1);
	}

	public static <AnyType> void quicksort(AnyType[] list, Comparator<? super AnyType> comparator) {
		quickSort(list, 0, list.length - 1, comparator);
	}
	
	/**
     * Internal quicksort method that makes recursive calls.
     * Uses median-of-three partitioning and a cutoff of 10.
     * @param a an array of Comparable items.
     * @param low the left-most index of the subarray.
     * @param high the right-most index of the subarray.
     */
    private static <AnyType extends Comparable<? super AnyType>> void quickSort( AnyType [ ] a, int low, int high, Comparator<? super AnyType> comparator )
    {
            // Sort low, middle, high
            int middle = ( low + high ) / 2;
            if( a[ middle ].compareTo( a[ low ] ) < 0 )
                Sort.swapReferences( a, low, middle );
            if( a[ high ].compareTo( a[ low ] ) < 0 )
                Sort.swapReferences( a, low, high );
            if( a[ high ].compareTo( a[ middle ] ) < 0 )
            	Sort.swapReferences( a, middle, high );

                // Place pivot at position high - 1
            Sort.swapReferences( a, middle, high - 1 );
            AnyType pivot = a[ high - 1 ];

                // Begin partitioning
            int i, j;
            for( i = low, j = high - 1; ; )
            {
            	while( comparator.compare(a[ ++i ], pivot) < 0 )
            		;
            	while( comparator.compare(pivot, a[ --j ]) < 0 )
            		;
            	if (i >= j)
            		break;
            	Sort.swapReferences( a, i, j );
//                while( a[ ++i ].compareTo( pivot ) < 0 )
//                    ;
//                while( pivot.compareTo( a[ --j ] ) < 0 )
//                    ;
//                if( i >= j )
//                    break;
//                Sort.swapReferences( a, i, j );
            }

                // Restore pivot
            Sort.swapReferences( a, i, high - 1 );

            quickSort( a, low, i - 1, comparator );    // Sort small elements
            quickSort( a, i + 1, high, comparator );   // Sort large elements
        
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
