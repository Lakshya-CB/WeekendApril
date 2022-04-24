package Lec_06;

public class Armstrong {
	public static void main(String[] args) {
		int n = 1000;
		PrintArmStrongTill(n);

	}

	public static void PrintArmStrongTill(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArmstrong(num)) {
				System.out.println(num);
			}
		}

	}

	private static boolean isArmstrong(int num) {
		// TODO Auto-generated method stub
		int backup = num;
		int nod = nod(num);
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
			ans = ans + (int)Math.pow(digit,nod);
			num = num / 10;
		}
		return ans==backup;
	}

	public static int nod(int num) {
		int ans = 0;
		while (num > 0) {
			ans++;
			num = num / 10;
		}
		return ans;
	}
}
