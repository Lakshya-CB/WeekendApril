package Lec_01;

public class Prime_Nuum {
	public static void main(String[] args) {
		int num = 13;
		int div = 1; // Initialize!!
		int factor = 0;

		while (div <= num) {
			if (num % div == 0) {
//				System.out.println("Phactor!" + div);
				factor++;

			}

			div++; // Updation!!
		}
		System.out.println(factor);
		if(factor==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
}
