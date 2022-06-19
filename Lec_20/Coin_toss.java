package Lec_20;

public class Coin_toss {
	public static void main(String[] args) {
//		Toss(3, "");
//		SubSeqASCII("abc", "");
//		System.out.println(count);
		LKC("234", "");
	}

	public static void Toss(int n, String type) {

		if (n == 0) {
			System.out.println(type);
			return;
		}
//		BP : toss n coins!!
//		SP : toss n-1 coins!!
		Toss(n - 1, type + "H");
		Toss(n - 1, type + "T");

	}

	static int count = 0;

	public static void SubSeq(String word, String team) {
		if (word.isEmpty()) {
			System.out.println(team + "==");
			count++;
			return;
		}
		char ch = word.charAt(0);
		String remain = word.substring(1);
		SubSeq(remain, team + ch); // Including
		SubSeq(remain, team); // Excluding

	}

	public static void SubSeqASCII(String word, String team) {
		if (word.isEmpty()) {
			System.out.println(team + "==");
			count++;
			return;
		}
		char ch = word.charAt(0);
		String remain = word.substring(1);
		SubSeqASCII(remain, team + ch); // Including
		SubSeqASCII(remain, team); // Excluding
		SubSeqASCII(remain, team + (int) ch); // Excluding

	}

	public static void LKC(String number, String path) {
		if (number.isEmpty()) {

			System.out.println(path);
			return;
		}
//		number = 235;

		char ch = number.charAt(0); // 2
		String remain = number.substring(1); // 35
		String options = getComb(ch);// "abc"
		for (int i = 0; i < options.length(); i++) {
			LKC(remain, path + options.charAt(i));
		}

	}

	public static String getComb(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {

			return "def";
		} else if (ch == '4') {

			return "ghi";
		} else if (ch == '5') {

			return "jkl";
		} else if (ch == '6') {

			return "mno";
		} else if (ch == '7') {

			return "pqrs";
		} else if (ch == '8') {

			return "tuv";
		} else if (ch == '9') {

			return "wxyz";
		}
		return "";
	}
}
