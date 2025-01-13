public class OctagonTest {
	public static void main(String[] args) {
		Octagon o1 = new Octagon(1,"red", true);
		Octagon o2 = (Octagon)o1.clone();
		System.out.println(o1.compareTo(o2));
	}
}