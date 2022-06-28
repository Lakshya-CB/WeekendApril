package Lec_22;

import java.util.ArrayList;
import java.util.List;

public class Lexo_ {
	public static void main(String[] args) {
//		count(0, 1000);
		List<String> AL = new ArrayList<String>();
		kaat("nitin", "", AL);

	}

	public static void count(int curr, int limit) {
		if (curr > limit) {
			return;
		}
		System.out.println(curr);// a
		int digit = 0;
		if (curr == 0) {
			digit = 1;
		}
		for (; digit <= 9; digit++) {
			count(curr * 10 + digit, limit);
		}

	}

	public static void kaat(String table, String parts, List<String> AL) {
		if (table.isEmpty()) {
			System.out.println(parts);
//			System.out.println(AL);

		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if (isPlain(piece)) {
				String bacha = table.substring(chakku);
				AL.add(piece);
				kaat(bacha, parts + "-" + piece, AL);
			}
		}

	}

	public static boolean isPlain(String piece) {
		// TODO Auto-generated method stub
		int s = 0;
		int e = piece.length() - 1;
		while (s < e) {
			if (piece.charAt(s) != piece.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
