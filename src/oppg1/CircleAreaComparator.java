package oppg1;

import java.util.*;

public class CircleAreaComparator implements Comparator<Circle> {
	
	@Override
	public int compare(Circle c1, Circle c2){
		double c1r = ((Circle)c1).getRadius();
		double c2r = ((Circle)c2).getRadius();
		
		if(c1r < c2r)
			return -1;
		if(c1r == c2r)
			return 0;
		return 1;
		
	}

}
