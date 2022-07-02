package Lec_22_23;

public class permutation {
	public static void main(String[] args) {
//		perm(new boolean[4], 2, "");
//		comb_wrt_U(4, 2, -1, "");
//		comb_wrt_box(4, 0, 2, "");
		Queen_comb_2D(3, 3, 0, 0, 2, "");

	}

	public static void perm(boolean[] selected, int toslect, String path) {
		if (toslect == 0) {
			System.out.println(path);
			return;
		}
		for (int i = 0; i < selected.length; i++) {
			if (selected[i] == false) {
				// select ith box
				selected[i] = true;
				perm(selected, toslect - 1, path + "b" + i + " ");
				selected[i] = false; // undo

			}
		}
	}

	public static void comb_wrt_U(int boxes, int toselect, int last_box, String path) {
		if (toselect == 0) {
			System.out.println(path);
			return;
		}
		for (int i = last_box + 1; i < boxes; i++) {
//			select ith box!!
			comb_wrt_U(boxes, toselect - 1, i, path + "b" + i);

		}
	}

	public static void comb_wrt_box(int numCol, int curr, int toselect, String path) {
		if (toselect == 0) { // +ve BC
			System.out.println(path);
			return;
		}
		if (curr == numCol) {
			return;
		}

		// curr box!!
		comb_wrt_box(numCol, curr + 1, toselect - 1, path + "q" + curr);
		comb_wrt_box(numCol, curr + 1, toselect, path);

	}

	public static void Queen_comb_2D(int numRow, int numCol, int r, int c, int toselect, String path) {
		if (toselect == 0) { // +ve BC
			System.out.println(path);
			return;
		}
//		BC
		if (c == numCol) {
			r++;
			c = 0;
		}
		if(r==numRow) {
			return;
		}

		// curr box!! r,c
		Queen_comb_2D(numRow, numCol, r, c + 1, toselect - 1, path + "q{" + r + "," + c + "}");
		Queen_comb_2D(numRow, numCol, r, c + 1, toselect, path);

	}
}
