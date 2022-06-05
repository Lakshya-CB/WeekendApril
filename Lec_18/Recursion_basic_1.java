package Lec_18;

public class Recursion_basic_1 {
	public static void main(String[] args) {
		PID(1, 5);
	}

	public static void PID(int s, int e) {
		if (s > e) {
			return;
		}
		System.out.println(s);
		PID(s + 1, e);
		System.out.println(s);
	}
}
