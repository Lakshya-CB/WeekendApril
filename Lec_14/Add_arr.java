package Lec_14;

import java.util.ArrayList;

public class Add_arr {
	public static void main(String[] args) {
		int[] arr1 = { 9,9};
		int[] arr2 = { 2,0 };
		func(arr1, arr2);
	}

	public static ArrayList<Integer> func(int[] arr1, int[] arr2) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int carry = 0;
		while (idx1 >= 0 || idx2 >= 0) {
			int sum = carry;
			if(idx1>=0) {
				sum = sum + arr1[idx1];
			}
			if(idx2>=0) {
				sum = sum + arr2[idx2];
			}
			int digit = sum % 10;
			carry = sum / 10;
			AL.add(0, digit);
			idx1--;
			idx2--;
		}
		if(carry>0) {
			AL.add(0,carry);
		}

		System.out.println(AL);
		return AL;

	}
}
