package Lec_09;

import java.util.Arrays;

public class Sorting_algos {
	public static void main(String[] args) {
		int[] arr = { 88, 66, 55, 44, 22 };
		bubble(arr);

	}

	public static void bubble(int[] arr) {
		for (int count = 1; count <= arr.length - 1; count++) {
			for (int s = 0; s < arr.length - 1; s++) {
				if (arr[s] > arr[s + 1]) {
//				swap!!
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	

}
