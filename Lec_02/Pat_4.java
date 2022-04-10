package Lec_02;

public class Pat_4 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {
//			Step 2: code!!
			int csp = 1; // curr space
			while (csp <= nsp) { // nsp num of space in each row
				System.out.print("  ");
				csp++;
			}
			int cst = 1; // curr star
			while (cst <= nst) { // nst num of star in each row
				System.out.print("* ");
				cst++;
			}

			System.out.println();
			row++;
			nsp--;
			nst++;
		}
	}
}
