package oblig2.oppg1;

/**
 * 
 * New Circle class!!
 *
 */
public class Circle {
	private int radius;
	private String color;
	
	public Circle(String c, int r) {
		color = c;
		radius = r;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		return color + " (" + radius + ")";
	}
}
