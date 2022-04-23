package Lec_05;

public class Decimal_to_Binary {
	public static void main(String[] args) {
		int num = 57;
		int ans =0;
		int out_base = 2;
		
		int mult = 1;
		
		while (num>0) {
			int rem = num % out_base;
			System.out.println(rem);

			ans  = ans + rem * mult;
			
			mult = mult*10;
			num = num / out_base;
		}
		System.out.println(ans);
	}
}
