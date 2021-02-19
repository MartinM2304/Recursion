package tema3;

public class ex3_2 {
	public static void main(String[] args) { System.out.println(foo(5,15)); } public static int foo (int x, int y) { if (y == 0) return x; else return foo(y, x % y); }
}

