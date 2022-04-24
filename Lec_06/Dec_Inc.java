package Lec_06;

import java.util.Scanner;

public class Dec_Inc {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean dec = true;
		boolean ans = false;
		int prev = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			int curr = scn.nextInt();
			if (curr > prev && dec) {
				dec = false;
			}
			if (dec == false && curr < prev) {
				ans = true;
				System.out.println("false");
				break;
			}
			if (prev == curr) {
				ans = true;
				System.out.println("false");
				break;
			}
			prev = curr;
		}
		if (ans == false) {
			System.out.println("true");
		}
//		int i =0;
//		while(i<n) {
//			int num = scn.nextInt();
//			i++;	
//		}
	}
}
