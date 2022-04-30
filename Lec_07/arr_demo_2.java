package Lec_07;

public class arr_demo_2 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10 };
		System.out.println("///////////////");
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		
		for (int ali : arr) {
			ali = 0;
		}
		System.out.println();
		
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
	}
}
