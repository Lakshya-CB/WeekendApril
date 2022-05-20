package Lec_11;

public class Matrix_QPS {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 },
				{ 51, 52, 53, 54 },

		};
		Anti_clock(arr);

	}

	public static void Anti_clock(int[][] mat) {
		int rs = 0;
		int re = mat.length - 1;
		int cs = 0;
		int ce = mat[0].length - 1;
		while (rs <= re && cs <= ce) {

			for (int r = rs; r <= re; r++) {
				System.out.print(mat[r][cs] + " ");
			}
			System.out.println();

			for (int c = cs + 1; c <= ce; c++) {
				System.out.print(mat[re][c] + " ");
			}
			System.out.println();

			for (int r = re - 1; r >= rs; r--) {
				System.out.print(mat[r][ce] + " ");
			}

			System.out.println();

			for (int c = ce - 1; c >= cs + 1; c--) {
				System.out.print(mat[rs][c] + " ");
			}
			System.out.println();
			System.out.println("===============");
//			
			rs++;
			re--;
			cs++;
			ce--;
		}

	}

}
