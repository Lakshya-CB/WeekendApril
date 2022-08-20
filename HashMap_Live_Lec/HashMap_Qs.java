package HashMap_Live_Lec;

import java.util.HashMap;

public class HashMap_Qs {
	public static void main(String[] args) {
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		Intersection(arr1, arr2);
		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		LongestCOnseqSeq(arr);
		
	}

	public static void Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int ali : arr2) {
//			if (map.containsKey(ali)) {
//				int prev_freq = map.get(ali);
//				map.put(ali, prev_freq + 1);
//			} else {
//				map.put(ali, 1);
//			}
			int prev_freq = map.getOrDefault(ali, 0);
			map.put(ali, prev_freq + 1);
		}
		System.out.println(map);
		for(int ali : arr1) {
			if(map.containsKey(ali)&& map.get(ali)>0) {
				System.out.println(ali);
				int prev_freq = map.get(ali);
				map.put(ali, prev_freq - 1);
			}
		}
	}
	public static void LongestCOnseqSeq(int[] arr) {
		HashMap<Integer, Boolean> Map = new HashMap<>();
		for(int ali : arr) {
			if(Map.containsKey(ali-1)) {
				Map.put(ali, false);
			}else {
				Map.put(ali, true);	
			}
			if(Map.containsKey(ali+1)) {
				Map.put(ali+1, false);
			}
		}
		for(int key : Map.keySet()) {
			if(Map.get(key)) {
//				System.out.println(key);
				int temp = key;
				while(Map.containsKey(temp)) {
					System.out.print(temp+" ");
					temp++;
				}
				System.out.println();
			}
		}
	}
}
