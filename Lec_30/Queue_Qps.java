package Lec_30;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Qps {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);

//		RevDisp(Q, 0);
//		System.out.println(Q);
		int[] arr = { -20, 10, -5, 4, 6, -9, -80, 60, 50 };
		FirstNeg(arr, 3);
	}

	public static void RevDisp(Queue<Integer> Q, int count) {
		if (count == Q.size()) {
			return;
		}
		int temp = Q.poll();
		Q.add(temp);
		RevDisp(Q, count + 1);
		System.out.println(temp);
	}

	public static void Rev(Queue<Integer> Q) {
		if (Q.isEmpty()) {
			return;
		}
		int temp = Q.poll();

		Rev(Q);
		Q.add(temp);
	}

	public static void FirstNeg(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<Integer>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}
		dispArr(arr, 0, k-1);
		System.out.println(" => " + arr[Q.peek()]);
	
		for (int s = 1; s <= arr.length - k; s++) {
			int e = s + k - 1;
			if (arr[e] < 0) {
				Q.add(e);
			}
			if (Q.peek() == s - 1) {
				Q.poll();
			}
			dispArr(arr, s, e);
			System.out.println(" => " + arr[Q.peek()]);
		}
	}

	public static void dispArr(int[] arr, int s, int e) {
		for (int i = s; i <= e; i++) {
			System.out.print(arr[i] + " ");
		}
//		System.out.println();
	}
}
