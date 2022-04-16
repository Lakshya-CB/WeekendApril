package Lec_03;

public class Pat_9 {
	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		while (row <= n) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
// 			preparation for the next row!!
			System.out.println();
			row++;
			nsp--;
			nst = nst + 2;
		}
	}
}
