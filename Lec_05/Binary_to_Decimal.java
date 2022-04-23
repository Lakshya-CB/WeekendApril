package Lec_05;

public class Binary_to_Decimal {
	public static void main(String[] args) {
		int num = 111001; // binary
		int input_base = 2;
		int output_base = 10;

		int mult = 1; //
		int ans = 0;
		while (num>0) {
			int digit = num % output_base;

			ans = ans + digit * mult;
			mult = mult * input_base;

			num = num / output_base;
		}
		System.out.println(ans);
	}
}
