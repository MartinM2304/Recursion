
public class Ex1 {

	public static void main(String[] args) {
		
		 System.out.println("Sum is " + method(5));
	   	 

	}
	
		public static int method(int n) {
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}


}
