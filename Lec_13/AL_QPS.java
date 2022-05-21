package Lec_13;

import java.util.ArrayList;

public class AL_QPS {
	public static void main(String[] args) {
		int[] arr1 = { 5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 80 };
		int[] arr2 = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
		ArrayList<Integer> ans = suvle(arr1, arr2);
		System.out.println(ans);
	}

	public static ArrayList<Integer> suvle(int[] arr1, int[] arr2) {
		ArrayList<Integer> ans = new ArrayList<>();

		int i1 = 0;
		int i2 = 0;
		while (i1 < arr1.length && i2 < arr2.length) {
			System.out.println(arr1[i1]+ "? == ?"+arr2[i2]);
			if (arr1[i1] == arr2[i2]) {
				ans.add(arr1[i1]);
				i1++;
				i2++;
			} else if (arr1[i1] > arr2[i2]) {
				i2++;
			} 
		}
		return ans;

	}
}
