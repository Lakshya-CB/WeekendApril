package Lec_09_10;

import java.util.Arrays;

public class Sorting_algos {
	public static void main(String[] args) {
//		int[] arr = {  66, 55, 44, 22 ,88};

//		bubble(arr);
//		Selection(arr);

		int[] arr = { 50,40,30,20,10 };
		Insertion(arr);
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

	public static void Selection(int[] arr) {
		for (int count = 1; count <= arr.length - 1; count++) {
//		min num pf swaps!!
			int max_idx = 0;
			for (int i = 0; i <= arr.length - count; i++) {
				if (arr[max_idx] < arr[i]) {
					max_idx = i;
				}
			}

//		swap max_idx and arr.len -1;
			int last_idx = arr.length - count;
			if (last_idx != max_idx) {
				int temp = arr[last_idx];
				arr[last_idx] = arr[max_idx];
				arr[max_idx] = temp;

				System.out.println(Arrays.toString(arr));
			}
		}
	}

	public static void Insertion(int[] arr) {
		for (int count = 1; count <= arr.length - 1; count++) {
			int backup = arr[count];
			int idx = count - 1;
			while (idx >= 0 && arr[idx] > backup) {
				arr[idx + 1] = arr[idx];
				idx--;

//			System.out.println(Arrays.toString(arr));
			}
			arr[idx + 1] = backup;

			System.out.println(Arrays.toString(arr));
		}
	}
}
