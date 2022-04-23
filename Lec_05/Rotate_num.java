package Lec_05;

public class Rotate_num {
	public static void main(String[] args) {
		int num = 123456;
		int rot = 10;
		
		int copy = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		
		rot = rot % nod;
		num = copy;
//		System.out.println(nod + " , " + num);

		for (int r = 1; r <= rot; r++) {
			int digit = num % 10; // 6
			int remain = num / 10; // 12345
			int add = (int) (digit * Math.pow(10, nod-1)); // 6 * 100000
			num = add + remain; // 612345
			
		}
		System.out.println(num);
	}
}
