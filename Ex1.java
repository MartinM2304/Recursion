package lesson2;

public class Ex1 {
	
	public static void main(String[] args) {
	System.out.println(Odd(2)); 
	}
	
	public static boolean Odd(int n) {
	if(n == 1 || n == 0) return n==1;
	return Odd(n-2);
	}

	public static boolean Even(int n) {
	return !Odd(n);
	}

	}
