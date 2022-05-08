package Lec_09_10;

public class Matrix_QPS {
	public static void main(String[] args) {
		int[][] mat = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		for (int[] row_aloo : mat) {
//			System.out.println(row);
			for (int aloo : row_aloo) {
				System.out.print(aloo + " ");
			}
			System.out.println();
		}
		System.out.println("=================");
		wavey(mat);
	}

	public static void wavey(int[][] mat) {
		for (int c = 0; c < mat[0].length; c++) {
			for (int r = 0; r < mat.length; r++) {
				int row_tp = r;
				if (c % 2 == 1) {
					row_tp = mat.length - 1 - r;
				}
				System.out.print(mat[row_tp][c] + " ");
			}
			System.out.println();
		}
	}
}
