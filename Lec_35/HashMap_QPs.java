package Lec_35;

import java.util.HashMap;

public class HashMap_QPs {
	public static void main(String[] args) {
		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
		intersection(arr1, arr2);
	}

	public static void intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int ali : arr2) {
			if (HM.containsKey(ali)) {
				int prev = HM.get(ali);
				HM.put(ali, prev + 1);
			} else {
				HM.put(ali, 1);
			}
		}

		System.out.println(HM);
		for(int ali: arr1) {
			if(HM.containsKey(ali)&& HM.get(ali)>0) {
				System.out.println(ali);
				int prev = HM.get(ali);
				HM.put(ali,prev-1);
			}
		}
	}
}
