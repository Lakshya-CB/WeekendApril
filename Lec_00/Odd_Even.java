package Lec_00;

public class Odd_Even {
	public static void main(String[] args) {
		int num = 11;
		int rem = num % 2;
		System.out.println(rem);
//		if(cond 1){}
		if(0==rem) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
		System.out.println("ENDY");
	}
}
