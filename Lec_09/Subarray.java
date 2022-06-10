package Lec_09;

public class Subarray {
	public static void main(String[] args) {

//		int[] arr = { 10, 20, -30, 40 };
		int[] arr = { -15, 20, -55, 25, -6, 40, -73, 30, 41 };

//		int max_sum = Integer.MIN_VALUE;
//		for (int s = 0; s < arr.length; s++) {
//			int sum = 0;
//			for (int e = s; e < arr.length; e++) {
//				sum = sum + arr[e];
//				System.out.println("{" + s + "," + e + "}" + sum);
////				int sum = func_sum(arr, s, e);
//				max_sum = Math.max(max_sum, sum);
//			}
//		}
//		System.out.println(max_sum);
		System.out.println(Kadence(arr));
	}

	public static int Kadence(int[] arr) {
		int sum = 0;
		int max_sum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			max_sum = Math.max(max_sum, sum);
			sum = Math.max(sum, 0);
		}
		return max_sum;

	}

	private static int func_sum(int[] arr, int s, int e) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = s; i <= e; i++) {
//			System.out.print(arr[i]+ " ");
			sum = sum + arr[i];
		}
//		System.out.println("=>"+sum);
		return sum;
	}
}
