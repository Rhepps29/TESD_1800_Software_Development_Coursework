import java.io.*;
import java.util.*;

public class RandomIntTextFile {
	public static void main(String[] args) throws java.io.IOException {
		File text = new File("Exercise12_15");
		if (text.exists()){
			System.out.print("File already exists.");
			System.exit(1);
		}else{
			java.io.PrintWriter output = new java.io.PrintWriter("Exercise12_15");
			for (int i = 0; i<100; i++){
				output.print((int)(Math.random()*100) + " ");
			}
			output.close();
			Scanner input = new Scanner(new File("Exercise12_15"));
			ArrayList array = new ArrayList();
			for (int i = 0; i<100; i++){
				array.add(input.nextInt());
			}
			array.sort(null);
			System.out.println(array);
		}
	}
}