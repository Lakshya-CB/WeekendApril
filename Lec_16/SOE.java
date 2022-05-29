package Lec_16;

import java.util.Arrays;

public class SOE {
	public static void main(String[] args) {
		int n = 150000000;

		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);// O(n)
		for (int div = 2; div * div <= n; div++) {
			if (isPrime[div]) {
				for (int table = div * 2; table <= n; table = table + div) {
					isPrime[table] = false;
				}
			}
		}
		for(int num= 2;num<=n;num++) {
			if(isPrime[num]) {
				System.out.println(num);
			}
		}
	}
}
