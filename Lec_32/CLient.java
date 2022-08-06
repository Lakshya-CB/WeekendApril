package Lec_32;

public class CLient {
public static void main(String[] args) {
	int[] In = {40,20,50,10,30,70};
	int[] Pre = {10,20,40,50,30,70};
	Btree BT = new Btree(In, Pre);
	BT.Disp();
}
}
