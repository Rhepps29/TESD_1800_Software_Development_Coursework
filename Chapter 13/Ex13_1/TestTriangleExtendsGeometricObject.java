import java.util.*;

public class TestTriangleExtendsGeometricObject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Side 1: ");
		double s1 = input.nextDouble();
		System.out.print("Enter Side 2: ");
		double s2 = input.nextDouble();
		System.out.print("Enter Side 3: ");
		double s3 = input.nextDouble();
		System.out.print("Enter Color: ");
		String color = input.next();
		System.out.print("Enter filled state (true or false): ");
		boolean filled = input.nextBoolean();
		Triangle triangle = new Triangle(s1,s2,s3,color,filled);
		System.out.println("Area: "+triangle.getArea());
		System.out.println("Perimeter: "+triangle.getPerimeter());
		System.out.println("Color: "+triangle.getColor());
		System.out.println("Filled: "+triangle.isFilled());
	}
}