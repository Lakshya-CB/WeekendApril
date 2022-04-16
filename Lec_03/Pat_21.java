package Lec_03;

public class Pat_21 {
	public static void main(String[] args) {
		int n = 9;
		int row = 1;
		int nst = 1;
		int nsp = 2 * n - 3;

		while (row <= n) {
			
			
			int cst1 = 1;
			while (cst1 <= nst) {
				System.out.print("* ");
				cst1++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			
//			if(row==n) { // last row!, AVOID THIS !!
//				nst--;
//			}
			int cst2 = 1;
			if(row==n) { // last row!
				cst2=2;
			}
			while (cst2 <= nst) {
				System.out.print("* ");
				cst2++;
			}
			System.out.println();
			row++;
			nst++;
			nsp=nsp-2;
		}
	}
}
