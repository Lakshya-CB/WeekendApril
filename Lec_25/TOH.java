package Lec_25;

public class TOH {
	public static void main(String[] args) {
		solve(3, 'A', 'C', 'B');
	}

	public static void solve(int n, char src, char dest, char help) {
		if (n == 0) {
			return;
		}
		solve(n - 1, src, help, dest);
		System.out.println(n + " disk from " + src + " to " + dest);
		solve(n - 1, help, dest, src);

	}
}
