
class TestRectangle {
	public static void main(String[] args){
		Rectangle rec1 = new Rectangle(4,40);
		Rectangle rec2 = new Rectangle(3.5,35.9);
		System.out.println("Rectangle 1: \n\nWidth: " + rec1.width + "\nHeight: " + rec1.height + "\nArea: " + rec1.getArea()+ "\nPerimeter: " + rec1.getPerimeter());
		System.out.print("\nRectangle 2: \n\nWidth: " + rec2.width + "\nHeight: " + rec2.height + "\nArea: " + rec2.getArea()+ "\nPerimeter: " + rec2.getPerimeter());
	}
}
