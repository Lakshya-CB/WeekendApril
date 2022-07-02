package Lec_22_23;

import java.util.ArrayList;
import java.util.List;

public class solve {
	public static void main(String[] args) {
//		count(0, 1000);
		List<String> AL = new ArrayList<String>();
		List<List<String>> BIG = new ArrayList<List<String>>();

		kaat("nitin", "", AL,BIG);
		System.out.println(BIG);

	}

	public static void kaat(String table, String parts, List<String> AL,List<List<String>> BIG) {
		if (table.isEmpty()) {
//			System.out.println(parts);
			System.out.println(AL);
			ArrayList<String> copy = new ArrayList<>(AL);// copy karne ka

//			ArrayList<String> copy = new ArrayList<>();
//			for(String ali: AL) {
//				copy.add(ali);
//			}
			BIG.add(copy);
//			System.out.println("=========");

		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if (isPlain(piece)) {
				String bacha = table.substring(chakku);
				AL.add(piece); // prep for the AL
				kaat(bacha, parts + "-" + piece, AL, BIG);
				AL.remove(AL.size() - 1);// undo the work
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


