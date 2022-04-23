package Lec_05;

public class F_to_c {
	public static void main(String[] args) {
		int min_F = 0;
		int max_F = 100;
		int step = 20;

//		int F = min_F;
//		while (F <= max_F) {
//			System.out.println(F);
//			F = F + step;
//
//		}
		for (int F = min_F; F <= max_F; F = F + step) {
			int C = 5 * (F - 32) / 9;
			System.out.println(F + " " + C);
		}
	}
}
