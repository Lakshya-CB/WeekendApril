package Lec_03;

public class Pat_13 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		while (row <= 2 * n - 1) {
//			System.out.println("jadoo");
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			System.out.println();
			if (row <= n) {
				nst++;

			} else {
				nst--;
			}
			
			row++;
		}
	}
}
