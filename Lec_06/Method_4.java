package Lec_06;

public class Method_4 {
	public static void main(String[] args) {
		Global =2;
		int Global = 200;
		System.out.println(Global);
		System.out.println(Method_4.Global);
//		int a1 = 1;
//		
//		int b1 = 20;
//		System.out.println(a1 + " : " + b1);
//		swap(a1, b1);
//		System.out.println(a1 + " : " + b1);
//        System.out.println(Global);
	}

	static int Global = 10090909;

	public static void swap(int a, int b) {
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
		System.out.println(Global);

	}

}
