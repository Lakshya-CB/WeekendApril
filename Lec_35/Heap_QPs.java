package Lec_35;

import java.util.PriorityQueue;

public class Heap_QPs {
	public static void main(String[] args) {
//		int[] arr = { 20, 30, 60, 50, 10, 55, 57, 40 };
		int[][] arr = { { 10, 20, 30 }, { 15, 35 }, { 5, 7, 12, 25 }, { 17, 22, 40 } };
		
	}

	public static void topKAli(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for (int ali : arr) {
			PQ.add(ali);
			if (PQ.size() > k) {
				PQ.poll();
			}
		}
	}

	static class pair implements Comparable<pair> {
		int ali;
		int arr_idx;
		int ali_idx;
		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.ali -o.ali;
//			return o.ali -this.ali;
		
		}
	}
}
