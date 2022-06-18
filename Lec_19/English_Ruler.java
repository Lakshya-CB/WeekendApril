package Lec_19;

public class English_Ruler {
	public static void main(String[] args) {
		ruler(4, 4);
	}

	public static void pat(int n) {
		if (n == 0) {
			return;
		}
//		BP: pat(n)
//		SP : pat(n-1)
		pat(n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();
		pat(n - 1);
	}

	public static void ruler(int len, int major_tick) {
//		System.out.println("MAJORTICK");
		for (int l = 0; l < major_tick; l++) {
			System.out.print("-");
		}
		System.out.println(0);

		for (int i = 0; i < len; i++) {
			
			pat(major_tick - 1);
			
			
			
//			System.out.println("MAJORTICK");
			for (int l = 0; l < major_tick; l++) {
				System.out.print("-");
			}
			System.out.println(i+1);

		}
	}
}
