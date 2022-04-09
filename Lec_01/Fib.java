package Lec_01;

public class Fib {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		
		int ith = 5;
		int count = 1;
		while (count <= ith) {
			c = a + b;
//			System.out.println(c);
//			update!!
			a = b;
			b = c;

			count++;
		}

		System.out.println(a);
	}
}
