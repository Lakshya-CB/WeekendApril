package HashMap_Live_Lec;

public class DP_1 {

	public static int Fibo(int n, Integer[] dp) {
//		int n!! Fibo(n)!!!
		if (n <= 1) {
			return n;
		}
		if(dp[n]!=null) {
			return dp[n];
		}
		int sp1 = Fibo(n - 1, dp);
		int sp2 = Fibo(n - 2, dp);
		dp[n] = sp1 + sp2;
		return sp1 + sp2;
	}
}
