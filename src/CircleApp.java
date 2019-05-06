import java.util.Scanner;

//import com.gc.Room;

public class CircleApp {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		char flag = 'y';
		double radius;
		System.out.println("Welcome to the Circle Tester");
		System.out.println();
	do {
		radius = Validator.getDouble(scan, "Enter radius: ");
		
		Circle round = new Circle(radius);
		
		System.out.println("Circumference: " + round.getFormattedCircumference());
		
		System.out.println("Radius: " + round.getFormattedArea());
		System.out.println("Continue? (y/n)" );
		flag = scan.next().charAt(0);
		
	} while (flag == 'y' || flag == 'Y');
		System.out.println("Goodbye!");
	}
	
	
}
