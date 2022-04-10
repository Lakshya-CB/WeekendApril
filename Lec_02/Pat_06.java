package Lec_02;

public class Pat_06 {
	public static void main(String[] args) {
		int n = 15;
		int row = 1;
		int nsp = 0;
		int nst = n;
		while (row <= n) {
			int csp = 1;
			while(csp <=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			while(cst <=nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
			nsp=nsp+2;
			nst--;
		}
	}
}
