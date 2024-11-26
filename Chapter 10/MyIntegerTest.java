class MyIntegerTest {
	public static void main(String[] args) {
		MyInteger num1 = new MyInteger(5);
		System.out.println("New MyInteger created with a value of 5");
		System.out.println("Even: "+ num1.isEven());
		System.out.println("Odd: "+ num1.isOdd());
		System.out.println("Prime: "+ num1.isPrime());
		System.out.println("Does it equal the int 5?: " +num1.equals(5));
		System.out.println("Testing int 6.");
		System.out.println("Even: " + MyInteger.isEven(6));
		System.out.println("Odd: " + MyInteger.isOdd(6));
		System.out.println("Prime: " + MyInteger.isPrime(6));
		System.out.println("Testing MyInteger num1");
		System.out.println("Even: " + MyInteger.isEven(num1));
		System.out.println("Odd: " + MyInteger.isOdd(num1));
		System.out.println("Prime: " + MyInteger.isPrime(num1));
		MyInteger num2 = new MyInteger(3);
		System.out.println("Comparing num1 to num2: " + num1.equals(num2));
		char[] chararray = {'1','2','3'};
		System.out.println("Testing parseInt(char[]): " + MyInteger.parseInt(chararray));
		String string = "321";
		System.out.println("Testing parseInt(String): "+ MyInteger.parseInt(string));
	}
}