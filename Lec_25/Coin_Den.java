package Lec_25;

public class Coin_Den {
	public static void main(String[] args) {
//		int[] coins = { 1, 2, 3, 4 };

//		T1_Perm(coins, 4, "");
//		T1_Comb(coins, 4, 0, "");
		int[] coins = { 1, 1, 2, 2, 3, 4 };
		T3_Comb(coins, 4, -1, "");
	}

// T-1 : coins supply infinite!! perm!!, unique
	public static void T1_Perm(int[] coins, int A, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0) {
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			T1_Perm(coins, A - coins[i], path + coins[i] + " ");
		}
	}

	public static void T1_Comb(int[] coins, int A, int last_coin, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0) {
			return;
		}
		for (int i = last_coin; i < coins.length; i++) {
			T1_Comb(coins, A - coins[i], i, path + coins[i] + " ");
		}
	}

// T2 finite supply, unique
	public static void T2_Comb(int[] coins, int A, int last_coin, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0) {
			return;
		}
		for (int i = last_coin + 1; i < coins.length; i++) {
			T2_Comb(coins, A - coins[i], i, path + coins[i] + " ");
		}
	}

// 	Finite Supply and duplicates
	public static void T3_Comb(int[] coins, int A, int last_coin, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0) {
			return;
		}
		for (int i = last_coin + 1; i < coins.length; i++) {
			if (i==last_coin + 1||coins[i] != coins[i - 1]) {
				T3_Comb(coins, A - coins[i], i, path + coins[i] + " ");
			}
		}
	}

}
