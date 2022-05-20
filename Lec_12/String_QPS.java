package Lec_12;

import java.util.Scanner;

public class String_QPS {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
////		String str  = scn.next();
//		String str = "nitin";
//					  01234
//		System.out.println(palin_bekar(str));
//		printSS(str);
//		Palind_SS(str);
//		Palind_SS2(str);

		String str = "the sky is blue";
		Words(str);
	}

	public static void printSS(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				System.out.println(str.substring(s, e));
			}
		}
	}

	public static boolean palin_bekar(String str) {
		String ans = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ans = ans + str.charAt(i);// ?? magic
		}
		System.out.println(ans);
		return ans.equals(str);
	}

	public static boolean isPalin(String str) {
//		nitin
//		01234
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {

				return false;
			}
			s++;
			e--;
		}
		return true;
	}

	public static void Palind_SS(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String ss = str.substring(s, e);
				if (isPalin(ss)) {
					System.out.println(ss);
				}
			}
		}
	}

	public static void Palind_SS2(String str) {
		for (int c = 0; c < str.length(); c++) {
			for (int r = 0; r + c < str.length() && c - r >= 0; r++) {
				if (str.charAt(r + c) == str.charAt(c - r)) {
//				c-r to c+r palindrome!!!
					System.out.println(str.substring(c - r, c + r + 1));
				} else {
					break;
				}
			}
		}
		for (double c = 0.5; c < str.length(); c++) {
			for (double r = 0.5; r + c < str.length() && c - r >= 0; r++) {
				if (str.charAt((int) (r + c)) == str.charAt((int) (c - r))) {
//				c-r to c+r palindrome!!!
					System.out.println(str.substring((int) (c - r), (int) (c + r + 1)));
				} else {
					break;
				}
			}
		}
	}

	public static void Words(String str) {
//		while (true) {
//			int idx = str.lastIndexOf(" ");
//			if(idx==-1) {
//				System.out.println(str);
//				break;
//			}
//			String word = str.substring(idx + 1);
//			str = str.substring(0, idx);
//			System.out.println(word);
//		}
		String[] arr =str.split("sky");
		for(String word : arr) {
			System.out.println(word);
		}
	}

}
