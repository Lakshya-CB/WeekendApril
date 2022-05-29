package Lec_16;

public class String_demo {
	public static void main(String[] args) {
//		Special ?! IP or SP
		String str1 = "LULKY";
		String str2 = "LULKY";

		System.out.println(str1 == str2);
		String str00 = new String("LULKY");

		System.out.println(str1 == str00);

		System.out.println(str1.equals(str00));

		String str11 = new String("LULKY");
		System.out.println(str00 == str11);

		long start = System.currentTimeMillis();
		int n = 100000;
		String ans = "";
		for (int i = 0; i < n; i++) {
			ans = ans + i; //O(1) ?! O(n)
//			int l = i + 1; //O(1)
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
}
