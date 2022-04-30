package Lec_07;

public class arr_demo_4 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
//		int[] arr2 = arr1;
//		System.out.println(arr1);
//		System.out.println(arr2);

		arr1[0] = 99;
		
//		System.out.println(arr2[0]);
		int[] arr2 = new int[5];
		 arr2 = arr1;
		arr2[0]=100;
		System.out.println(arr1[0]);
		
	}
}
