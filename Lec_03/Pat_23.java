package Lec_03;

public class Pat_23 {
	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		int num = 1;
		while (row <= n) {
			int var = num;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print(var + "\t");
				if (cst < nst / 2 + 1) {
					var++;
				} else {
					var--;
				}
				cst++;
			}
// 			preparation for the next row!!
			System.out.println();
			row++;
			nsp--;
			num++;
			nst = nst + 2;
		}
	}
}
