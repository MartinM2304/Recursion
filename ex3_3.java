package tema3;

public class ex3_3 {

	public static void main(String[] args) {
		System.out.println(powRecursive(2,4,1));
	}
    public static int powRecursive( int x, int n,int result ) {
      	 if (n == 0) {
      		 return result;
      	 }
      	 
      	 return  powRecursive(x, n - 1,result*x );
       }


}
