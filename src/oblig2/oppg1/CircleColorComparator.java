package oblig2.oppg1;
import java.util.*;

public class CircleColorComparator implements Comparator<Circle> {
	
	@Override
	public int compare(Circle c1, Circle c2) {
		String c1c = ((Circle) c1).getColor();
		String c2c = ((Circle) c2).getColor();
		return c1c.compareTo(c2c);
	}	
}
