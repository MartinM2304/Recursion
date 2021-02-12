
public class Ex4 {
	public static void main(String[] args) {
		
		
	}
		public static int RecursiveXNDegree(int x, int n) {
		
		if(n==0) {
			return 1;
		}
		
		return x*RecursiveXNDegree(x, n-1);
		
	}
		public static int IterativeXNDegree(int x, int n) {
			int result = 1;
			for(int i = 0; i < n; i++) {
				result*=x;
			}
			return result;
		}

}
