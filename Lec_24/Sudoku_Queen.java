package Lec_24;

public class Sudoku_Queen {
	public static void main(String[] args) {
		// System.out.println("Welcome to Online IDE!! Happy Coding :)");
		// comb(0,0,4,4,3,0,"", new boolean[4][4]);

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		solve(board, 0, 0);

	}

	public static boolean isSafeSu(int i, int r, int c, char[][] board) {
		char ch = (char) (i + '0');
		for (int cc = 0; cc < 9; cc++) {
			if (board[r][cc] == ch) {
				return false;
			}
		}
		for (int rr = 0; rr < 9; rr++) {
			if (board[rr][c] == ch) {
				return false;
			}
		}
		int boxr = r / 3;
		int boxc = c / 3;
		for (int rr = boxr * 3; rr < boxr * 3 + 3; rr++) {
			for (int cc = boxc * 3; cc < boxc * 3 + 3; cc++) {
				if (board[rr][cc] == ch) {
					return false;
				}
			}
		}
		return true;
	}

	public static void solve(char[][] board, int r, int c) {
		// r,c

		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
			disp_ch(board);
			return;
		}
		if (board[r][c] != '.') {
			solve(board, r, c + 1);
		} else {
			for (int num = 1; num <= 9; num++) {
				if (isSafeSu(num, r, c, board)) {
					board[r][c] = (char) ('0' + num);
					solve(board, r, c + 1);
				}
			}
			board[r][c] = '.';

		}
	}

	public static void comb(int r, int c, int t_r, int t_c, int total_Q, int curr_Q, String path, boolean[][] board) {
		if (curr_Q == total_Q) {
			System.out.println(path);
			disp(board);
			return;
		}
		if (c == t_c) {
			c = 0;
			r++;
		}
		if (r == t_r) {
			return;
		}
		// r c
		if (isSafe(r, c, board)) {
			board[r][c] = true;
			comb(r, c + 1, t_r, t_c, total_Q, curr_Q + 1, path + "{" + r + "," + c + "}", board);
			board[r][c] = false;
		}
		comb(r, c + 1, t_r, t_c, total_Q, curr_Q, path, board);

	}

	public static void disp(boolean[][] b) {
		for (boolean[] r : b) {
			for (boolean ali : r) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
		System.out.println("===================");
	}

	public static void disp_ch(char[][] b) {
		for (char[] r : b) {
			for (char ali : r) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
		System.out.println("===================");
	}

	public static boolean isSafe(int r, int c, boolean[][] board) {
		for (int cc = 0; cc < c; cc++) {
			if (board[r][cc]) {
				return false;
			}
		}
		for (int rr = 0; rr < r; rr++) {
			if (board[rr][c]) {
				return false;
			}
		}
		int rr = r;
		int cc = c;
		while (rr >= 0 && cc >= 0) {
			if (board[rr][cc]) {
				return false;
			}
			rr--;
			cc--;

		}
		rr = r;
		cc = c;
		while (rr >= 0 && cc < board[0].length) {
			if (board[rr][cc]) {
				return false;
			}
			rr--;
			cc++;

		}
		return true;
	}
}
