package Lec_05;

public class Rot_2 {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 6;

		int copy = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = copy;
		rot = rot % nod;
		int mult = (int) Math.pow(10, rot);
		int part1 = num / mult;
		int part2 = num % mult;
//		System.out.println(part1 + " , " + part2);
		int ans = (int) (part2 * Math.pow(10, nod - rot) + part1);
		System.out.println(ans);

	}
}
