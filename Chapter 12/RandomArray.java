import java.util.*;

public class RandomArray {
	public static void main(String[] args) {
		int[] array = new int[100];
		for (int i = 0; i<100; i++){
			array[i] = (int)(Math.random()*10);
		}
		try{
			System.out.print("Enter an index of the array: ");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			System.out.print(array[choice]);
		}
		catch (ArrayIndexOutOfBoundsException ex){
			System.out.print("Out of Bounds.");
		}
	}
}