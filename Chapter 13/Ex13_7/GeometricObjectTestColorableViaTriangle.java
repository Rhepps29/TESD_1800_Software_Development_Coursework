public class GeometricObjectTestColorableViaTriangle{
	public static void main(String[] args) {
		GeometricObject[] array = {new Triangle(3,4,5), new Triangle(6,8,10), new Triangle(3,4,6), new Triangle(), new Triangle(4,5,8)};
		for (int i = 0; i<array.length; i++){
			System.out.println("Area: "+array[i].getArea());
			if (array[i] instanceof Colorable){
				System.out.println(((Triangle)array[i]).howToColor());
			}
		}
	}
}