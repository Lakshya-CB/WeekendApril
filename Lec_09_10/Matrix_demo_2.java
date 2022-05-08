package Lec_09_10;

import java.util.Scanner;

public class Matrix_demo_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] mat = new int[3][3];
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++) {
				mat[r][c] = scn.nextInt();
			}
		}
		for (int[] row_aloo : mat) {
//			System.out.println(row);
			for (int aloo : row_aloo) {
				System.out.print(aloo + " ");
			}
			System.out.println();
		}
		
	}
}
