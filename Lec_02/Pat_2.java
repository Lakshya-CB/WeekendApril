package Lec_02;

public class Pat_2 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		while (row <= n) {
//		Step2
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			nst++;
			System.out.println();
			row++;
		}
	}
}
