package Lec_15;

import java.util.Arrays;

public class Min_num_Seq {
	public static void main(String[] args) {
		String str = "ID";
		solve(str);

	}

	public static void solve(String str) {
		int[] ans = new int[str.length() + 1];
		int digit = 1;
		int numD = 0;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				numD++;
				int idx = i;
				while (numD > 0) {
					ans[idx] = digit;
					digit++;
					idx--;
					numD--;
				}
				System.out.println(Arrays.toString(ans));

			} else if (str.charAt(i) == 'D') {
				numD++;
			}

		}
	}
}
