package Lec_04;

public class Print_digits_rev {
	public static void main(String[] args) {
		int num = 123456;
//	int num_of_dig = 6;
		int backup = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
//		System.out.println(nod);
		num=backup;
//		System.out.println(num);
		
		while(num>0) {
			int mult =(int) Math.pow(10, nod-1);
			
			int digit = num/mult;
			System.out.println("digit = "+digit);
			num = num %mult;
			System.out.println("num = "+num);
			nod--;
		}
		
	}
}
