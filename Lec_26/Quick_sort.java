package Lec_26;

import java.util.Arrays;

public class Quick_sort {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
		System.out.println(Arrays.toString(arr));
		QS(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

	public static void QS(int[] arr, int s, int e) {
		if (e <= s) {
			return;
		}
		int mid = (s + e) / 2;
		int piv = arr[mid];
		int L = s;
		int R = e;
		while (L <= R) {
			while (arr[L] < piv) {
				L++;
			}
			while (arr[R] > piv) {
				R--;
			}
			if (L <= R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			}
		}
		QS(arr, s, R);
		QS(arr, L, e);

	}
}
