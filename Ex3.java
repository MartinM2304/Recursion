
public class Ex3 {

	public static void main(String[] args) {
		System.out.println(RecursiveTwo(3));
		

	}
	public static int RecursiveTwo(int x) {
		
		if(x==0) {
			return 1;
		}
		
		return 2*RecursiveTwo(x-1);
	}
	public static int IterativeTwo(int x) {
		int result = 1;
		for(int i = 1; i <= x; i++) {
			
			result*=2;
		}
		return result;
	}

}
