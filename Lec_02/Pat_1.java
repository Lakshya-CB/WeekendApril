package Lec_02;

public class Pat_1 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = n;
		while (row <= n) { // Step 1
//			Step 2:
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
		}
	}
}
