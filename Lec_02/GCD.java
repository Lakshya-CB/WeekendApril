package Lec_02;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc_LOLOLO = new Scanner(System.in);
		int a = sc_LOLOLO.nextInt();
		int b = sc_LOLOLO.nextInt();
		int div = 1;
		int jeb = 1;
		while (div <= a) {
			if (a % div == 0 && b % div == 0) {
				System.out.println("Commons Fhactor mila!!" + div);
//				jeb = div;
			}
			div++;
		}
		System.out.println(jeb);
	}
}
