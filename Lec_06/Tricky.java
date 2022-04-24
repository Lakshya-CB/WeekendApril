package Lec_06;

public class Tricky {
	static int val = 200;
	public static void main(String[] args) {
		System.out.println(Tricky.val);
		fun(20);
	}

	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(Tricky.val);
		val = val + 60;
		Tricky.val = val + 10;
		System.out.println(val);
		System.out.println(Tricky.val);
	}
}