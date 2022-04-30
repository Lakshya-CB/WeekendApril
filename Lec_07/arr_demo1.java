package Lec_07;

public class arr_demo1 {
	public static void main(String[] args) {
//		create
		int var = 5;
		int[] arr = new int[var]; // 10k
		System.out.println(arr);
//		int[] arr2 = new int[var]; //20k
//		System.out.println(arr2);
//		arr = null;
//		System.out.println(arr);
//		
//		System.out.println(arr2.length);
//		System.out.println(arr.length);
		int size = arr.length;
		System.out.println(size);
		System.out.println("///////////////////");
//		get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		System.out.println(arr[5]);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		update 
		arr[0] =10;
		arr[1] =20;
		arr[2] =30;
		arr[3] =40;
		arr[4] =50;
		
//		arr[5000000] = 100;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = 2*(i+1);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("///////////////");
		for(int ali : arr) {
			System.out.print(ali+ " ");
		}
		
	}
}
