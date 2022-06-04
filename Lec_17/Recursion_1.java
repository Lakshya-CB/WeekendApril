package Lec_17;

public class Recursion_1 {
	public static void main(String[] args) {
//		PD(5);
//		PI(5);
		PDI(5);
	}

	public static void PD(int n) {
//		BS , smallest problem 
		if (n == 0) {
			return;
		}

//		BP : PD(n)
//		SP : PD(n-1)
		System.out.println(n);
		PD(n - 1);
	}

	public static void PI(int n) {
//		if(n==0) {return}
		if (n == 1) {
			System.out.println(n); // ? pata nahi n kyu ?
			return;
		}
//		BP : PI(n)
//		SP : PI(n-1)
		PI(n - 1);
		System.out.println(n);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
//		BP : PDI(n)
//		SP : PDI(n-1)
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}
}
