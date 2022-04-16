package Lec_03;

public class Pat_7 {
	public static void main(String[] args) {
		int n = 9;
		int row = 1;
		int nst = n;
		while (row <= n) { // Step 1
//		Step 2:
			int cst = 1;
			while (cst <= nst) {

//				if (row == 1 || row == n ||cst==1||cst==n) {
				if (row == cst || row + cst == n + 1) {

					System.out.print("* ");
				} else {
					System.out.print("  ");

				}
				cst++;
			}

			System.out.println();
			row++;
		}
	}
}
