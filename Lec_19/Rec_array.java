package Lec_19;

public class Rec_array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		print1(arr, 0);
		print2(arr, arr.length - 1);

	}

	public static void print1(int[] arr, int idx) {

		if (idx == arr.length) {
			return;
		}
//		BP p(idx)
//		SP p(idx+1)
		System.out.println(arr[idx]);
		print1(arr, idx + 1);
	}

	public static void print2(int[] arr, int e) {
		if (e < 0) {
			return;
		}

//		BP p(e)
//		SP p(e-1)
		print2(arr, e - 1);
		System.out.println(arr[e]);
	}

	public static void rev(int[] arr, int s) {
		if (s == arr.length) {
			return;
		}
//		BP : rev(s)
//		SP : rev(s+1)

		rev(arr, s + 1);
		System.out.println(arr[s]);
	}

	public static int Max(int[] arr, int idx) {
		if (idx == arr.length) {
			return Integer.MIN_VALUE;
		}
//		BP : Max(0)
//		SP : Max(1)
		int sp = Max(arr, idx + 1);
		return Math.max(arr[idx], sp);
	}

	public static int FirstO(int[] arr, int s, int ele) {
		if (s == arr.length) {
			return -1;
		}
		int sp = FirstO(arr, s + 1, ele);
		if (arr[s] == ele) {
			return s;
		} else {
			return sp;
		}
	}

	public static int LastO(int[] arr, int s, int ele) {
		if (s == arr.length) {
			return -1;
		}
		int sp = LastO(arr, s + 1, ele);
		if (arr[s] == ele && sp == -1) {
			return s;
		} else {
			return sp;
		}
	}

	public static int[] AllO(int[] arr, int s, int ali, int cnt) {
		if (s == arr.length) {
			return new int[cnt];
		}

		if (arr[s] == ali) {
			int[] sp = AllO(arr, s + 1, ali, cnt + 1);
		} else {
			int[] sp = AllO(arr, s + 1, ali, cnt);

		}
	}

}
