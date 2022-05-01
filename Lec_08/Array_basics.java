package Lec_08;

import java.util.Arrays;

public class Array_basics {
	public static void main(String[] args) {
//		int[] arr = { 11, 12, 4, -9, 100, 5 };
//		System.out.println(max(arr));
//		System.out.println(find(arr, 10));
//		System.out.println("Org arr = " + Arrays.toString(arr));
//		rev3(arr);

//		int[] arr = { 10, 20, 30, 40, 50 };
//		rotation3(arr, 6);
		System.out.println(-11 % 5);
	}

	public static int max(int[] arr) {
//		int jeb = arr[0];
		int jeb = Integer.MIN_VALUE; // -inf
		for (int i = 0; i < arr.length; i++) {
			int aam = arr[i];
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ali) {
				return i;
			}
		}
		return -1;
	}

	public static void rev(int[] arr1) {
		int[] arr2 = new int[arr1.length];
		int idx2 = arr1.length - 1;
		int idx1 = 0;
		while (idx2 >= 0) {
			arr2[idx1] = arr1[idx2];
			idx1++;
			idx2--;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		for (int idx = 0; idx < arr1.length; idx++) {
			arr1[idx] = arr2[idx];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

	public static void rev2(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
//			System.out.println(Arrays.toString(arr) + " s = "+s+ " , e = "+e);
//			
			s++;
			e--;
		}
		System.out.println(Arrays.toString(arr) + " s = " + s + " , e = " + e);

	}

	public static void rev_parts(int[] arr, int s, int e) {
//		int s = 0;
//		int e = arr.length - 1;
		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
//			System.out.println(Arrays.toString(arr) + " s = "+s+ " , e = "+e);
//			
			s++;
			e--;
		}
//		System.out.println(Arrays.toString(arr) + " s = " + s + " , e = " + e);

	}

	public static void rev3(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
//			arr[i] = arr[arr.length - i - 1] ; ????
//			swap  i and arr.length - i - 1

			System.out.println(Arrays.toString(arr));
		}

	}

	public static void rotation(int[] arr, int r) {
		r = r % arr.length;
		for (int R = 0; R < r; R++) {
			int[] arr2 = new int[arr.length];
			arr2[0] = arr[arr.length - 1];
			for (int idx = 0; idx <= arr.length - 2; idx++) {
				arr2[idx + 1] = arr[idx];
			}
			System.out.println(Arrays.toString(arr2));
			arr = arr2;
		}
	}

	public static void rotation2(int[] arr, int r) {
		r = r % arr.length;
		for (int R = 0; R < r; R++) {
			int backup = arr[arr.length - 1];
			for (int idx = arr.length - 2; idx >= 0; idx--) {
				arr[idx + 1] = arr[idx];
			}
			arr[0] = backup;
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void rotation3(int[] arr, int rot) {
		rot = rot % arr.length;
		if (rot < 0) {
			rot = rot + arr.length;
		}
//		System.out.println(Arrays.toString(arr));

//		step 1 : rotate complete array!!
		rev_parts(arr, 0, arr.length - 1);
//		System.out.println(Arrays.toString(arr));

//		part 2 : 0 to rot-1 !! 
		rev_parts(arr, 0, rot - 1);
//		System.out.println(Arrays.toString(arr));
//		part 1 : rot  to arr.len-1

		rev_parts(arr, rot, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

}
