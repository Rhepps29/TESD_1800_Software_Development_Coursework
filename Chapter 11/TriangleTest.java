import java.util.*;

public class TriangleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side 1: ");
		double side1 = input.nextDouble();
		System.out.print("Enter side 2: ");
		double side2 = input.nextDouble();
		System.out.print("Enter side 3: ");
		double side3 = input.nextDouble();
		System.out.print("Enter color: ");
		String color = input.next();
		System.out.print("Enter filled boolean: ");
		boolean filled = input.nextBoolean();
		Triangle test = new Triangle(side1,side2,side3);
		test.setColor(color);
		test.setFilled(filled);
		System.out.println("Area: "+test.getArea());
		System.out.println("Perimeter: "+test.getPerimeter());
		System.out.println("Color: "+test.getColor());
		System.out.println("Date Created: "+test.getDateCreated());
		System.out.println("Filled: "+test.isFilled());
	}
}