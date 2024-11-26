public class MyInteger{
	int value;
	MyInteger(int value){
		this.value = value;
	}
	int getValue(){
		return value;
	}
	boolean isEven(){
		return value % 2 == 0;
	}
	boolean isOdd(){
		return value % 2 == 1;
	}
	boolean isPrime(){
		if (value <= 1)
			return false;
		
		for (int i = 2; i < value; i++)
			if (value % i == 0)
			return false;
		
		return true;
	}
	static boolean isEven(int value){
		return value % 2 == 0;
	}
	static boolean isOdd(int value){
		return value % 2 == 1;
	}
	static boolean isPrime(int value){
		if (value <= 1)
			return false;
		
		for (int i = 2; i < value; i++)
			if (value % i == 0)
			return false;
		
		return true;
	}
	static boolean isEven(MyInteger value){
		return value.getValue() % 2 == 0;
	}
	static boolean isOdd(MyInteger value){
		return value.getValue() % 2 == 1;
	}
	static boolean isPrime(MyInteger value){
		if (value.getValue() <= 1)
			return false;
		
		for (int i = 2; i < value.getValue(); i++)
			if (value.getValue() % i == 0)
			return false;
		
		return true;
	}
	boolean equals(int value){
		return this.value == value;
	}
	boolean equals(MyInteger value){
		return this.value == value.getValue();
	}
	static int parseInt(char[] array){
		String stringvalue = "";
		for (int i = 0; i<array.length; i++){
			stringvalue += array[i];
		}
		return Integer.parseInt(stringvalue);
	}
	static int parseInt(String string){
		return Integer.parseInt(string);
	}
}