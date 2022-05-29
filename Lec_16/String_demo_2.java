package Lec_16;

public class String_demo_2 {
	public static void main(String[] args) {
		String str1 = new String("LOL");
		str1.intern();
		String str2 = "LOL";
		System.out.println(str1==str2);

	}
}
