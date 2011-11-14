package oblig2.oppg1;
import java.util.*;

public class CircleAreaComparator implements Comparator<Circle> {
	
	@Override
	public int compare(Circle c1, Circle c2) {
		double c1a = ((Circle) c1).getArea();
		double c2a = ((Circle) c2).getArea();
		
		if (c1a > c2a)
			return -1;
		
		if (c1a == c2a)
			return 0;
		
		// if (c1a < c2a)
		return 1;
	}	
}