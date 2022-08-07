package Lec_32_33;

public class CLient {
	public static void main(String[] args) {
//	int[] In = {40,20,50,10,30,70};
//	int[] Pre = {10,20,40,50,30,70};
//	Btree BT = new Btree(In, Pre);
//		int[] lvl = { 10, 20, 30, 40, 50, -1, 70 };
//		Btree BT = new Btree(lvl);
		int[] pre = { 10,20,40,-1,-1,50,-1,-1,30,-1,70,-1,-1};
		Btree BT = new Btree(pre, true);
		
		
		BT.Disp();
	}
}
