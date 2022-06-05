package Lec_18;

public class Recursion_2 {
	public static void main(String[] args) {
//		int sol = Fac(5);
//		System.out.println(sol);
		int ans = Fibo(4);
	}

	public static int Fac(int n) {
		if (n == 0) {
			return 1;
		}
//		 BP : Fac(5)
//		SP : Fac(4)
		int sp = Fac(n - 1);
		return sp * n;
	}

	public static int Pow(int x, int n) {
//		Bp : Pow(x,n);
//		SP : Pow(w,n-1);
		int sp = Pow(x, n - 1);
		return sp * x;
	}

	public static int Fibo(int n) {
		if(n<=1) {
			return n;
		}
//		BP : Fibo(n)
//		SP : Fibo(n-1) , Fibo(n-2) 
		int sp1 = Fibo(n-1);
		int sp2 = Fibo(n-2);

		return sp1+sp2;
	}
}
