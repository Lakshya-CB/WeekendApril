package Lec_07;

public class swap_1 {
	
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 23, 12, 14, 7 };

		System.out.println(a1[0] + " , " + a2[0]);
//		swap(a1[0], a2[0]);
		swap_in(a1, a2, 0);
//		swap_arr(a1, a2);

		System.out.println(a1[0] + " , " + a2[0]);
	}

	public static void swap_arr(int[] a, int[] b) {
		int[] d = a;
		a = b;
		b = d;
	}
	
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swap_in(int[] a, int[] b, int c) {
		int d = a[c];
		a[c] = b[c];
		b[c] = d;
	}

	

}