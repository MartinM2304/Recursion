package tema3;

public class ex3_4 {

	public static void main(String[] args) {
		
		System.out.println( Array(0, new int[]{2, 5, 6}, 0));

	}
	public static double Array(int index,int n[], int result){
		if (n.length==index)
		return Double.valueOf(result)/n.length;
		
		return Array(index+1, n, result + n[index]);
		
	}

}
