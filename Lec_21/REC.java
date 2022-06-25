package Lec_21;

import java.util.ArrayList;
import java.util.List;

public class REC {
	public static void main(String[] args) {
//		CS(0, 3, "");
//		List<String> AL = new ArrayList<>();
//
//		Gen(3, 3, "", AL);
//		System.out.println(AL);
//		Coin_Toss(3, "", false);
		MazePath(0, 0, 2, 2, "");
	}

	public static void CS(int curr, int dest, String str) {
		if (curr == dest) { // +ve BC
			System.out.println(str);
			return;
		}
		if (curr > dest) {// -ve BC
			return;
		}

		CS(curr + 1, dest, str + 1);
		CS(curr + 2, dest, str + 2);
		CS(curr + 3, dest, str + 3);

	}

	public static void Gen(int open, int close, String str, List<String> AL) {
		if (open == 0 && close == 0) {
//			System.out.println(str);
			AL.add(str);
		}
		if (open > close) {
//			System.out.println(str+ "galat hein bhai");
			return;
		}

		if (open > 0) {
			Gen(open - 1, close, str + "(", AL);
		}
		if (close > 0) {
			Gen(open, close - 1, str + ")", AL);
		}
	}

	public static void Coin_Toss(int n, String str, boolean isHead) {
		if (n == 0) {
			System.out.println(str);
			return;
		}
		if (isHead == false) {
			Coin_Toss(n - 1, str + "H", true);
		}
		Coin_Toss(n - 1, str + "T", false);

	}

	public static void MazePath(int r, int c, int dest_r, int dest_c, String path) {
		if (r == dest_r && c == dest_c) {
			System.out.println(path);
			return;
		}
		if (r > dest_r || c > dest_c) {
			return;
		}

		MazePath(r + 1, c, dest_r, dest_c, path + "D");
		MazePath(r, c + 1, dest_r, dest_c, path + "R");

	}
}
