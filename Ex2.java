package lesson2;

public class Ex2 {
	
	public static void main(String[] args) {
		System.out.println(dec2Bin(11));
		
		}
	public static String dec2Bin ( int value ) {
		if (value ==0)return "";
		return dec2Bin((int)Math.floor(value/2)) + value%2;
	}

}
