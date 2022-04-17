package Lec_04;

import java.util.Scanner;

public class Chew_Bakka {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		long mult = 1;
		long ans = 0;
		while (num != 0) {
			long digit = num % 10;

			num = num / 10;
			boolean is_first_digit_9 = num == 0 && digit == 9;
			if (digit >= 5 && !is_first_digit_9) {
				digit = 9 - digit;
			}

			ans = digit * mult + ans;
			mult = mult * 10;

//		System.out.println(digit+" ,, "+num+" ,, "+ans);
		}

		System.out.println(ans);

	}
}
