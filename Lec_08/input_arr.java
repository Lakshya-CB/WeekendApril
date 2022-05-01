package Lec_08;

import java.util.Scanner;

public class input_arr {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
		for(int alu : arr) {
			System.out.print(alu + " ");
		}
		System.out.println();
//		System.out.println((int)'0');
//		String str = "123456";
//		System.out.println(str);
//		System.out.println(str.charAt(2)-'0');
		
	}
}
