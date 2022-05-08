package Lec_09_10;

public class matrix_demo {
	public static void main(String[] args) {
		int[][] arr = new int[3][5]; // RxC2
		System.out.println(arr);
		System.out.println(arr[2][0]);
		System.out.println(arr[2]);

		System.out.println(arr.length); // 100k.len , num of rows!!
		System.out.println(arr[0].length); // 10k.len , num of col!!!
		System.out.println(arr[1].length); // 10k.len , num of col!!!
		System.out.println(arr[2].length); // 10k.len , num of col!!!

		System.out.println("==========");

		for (int[] row_aloo : arr) {
//			System.out.println(row);
			for (int aloo : row_aloo) {
				System.out.print(aloo + " ");
			}
			System.out.println();
		}
		System.out.println("==========");
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		System.out.println("==========");

		for (int[] row_aloo : arr) {
//			System.out.println(row);
			for (int aloo : row_aloo) {
				System.out.print(aloo + " ");
			}
			System.out.println();
		}

	}
}
