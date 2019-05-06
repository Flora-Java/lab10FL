
public class Circle {
	
	//Defining variables
	
	private double radius;
	private final double PI = Math.PI;
	private double circumference;
	
	
	public Circle(double radi) {
		radius = radi;
	}
	
	// method to calc circunference
	public double getCircumference() {
		return 2 * PI * radius;
	}
	
	//  method to calc area
	public double getArea() {
		return PI * (radius * radius);
	}	
	private static String formatNumber(double x ) {
		x = (Math.round(x * 100.0) / 100.0);
		return Double.toString(x);
	}
	
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	@Override
	public String toString() { // we let eclipse create this method for us
		return "Radius of the circle = " + radius;
	}
	
}
