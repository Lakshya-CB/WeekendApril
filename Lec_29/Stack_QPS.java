package Lec_29;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
//		Stack<Integer> S = new Stack<Integer>();
//		S.add(10);
//		S.add(20);
//		S.add(30);
//		S.add(40);
//		S.add(50);
////		System.out.println(S);
////		RevPrint(S);
//		System.out.println(S);
//		Reverse(S);
//		System.out.println(S);
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		NextGr8_2(arr);

	}

	public static void RevPrint(Stack<Integer> S) {
		if (S.isEmpty()) {
			return;
		}
		int temp = S.pop();
		RevPrint(S);
		System.out.println(temp);
		S.push(temp);
	}

	public static void Reverse(Stack<Integer> S) {
		Stack<Integer> Copy = new Stack<Integer>();
		Copy(S, Copy);
		while (!Copy.isEmpty()) {
			int temp = Copy.pop();
			S.add(temp);
		}
	}

	public static void Copy(Stack<Integer> S, Stack<Integer> Copy) {
		if (S.isEmpty()) {
			return;
		}
		int temp = S.pop();
		Copy(S, Copy);
		Copy.add(temp);
		// S.push(temp);
	}

	public static void NextGr8(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for (int idx = 0; idx < arr.length; idx++) {
			int B = arr[idx];
			while (!S.isEmpty() && S.peek() < B) {
				System.out.println(S.pop() + "=>" + B);
			}
			S.add(B);
		}
		while (!S.isEmpty()) {
			System.out.println(S.pop() + "=>" + -1);
		}
	}

	public static void NextGr8_2(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> S = new Stack<>();
		for (int idx = 0; idx < arr.length; idx++) {
			int B = arr[idx];
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();

				System.out.println(arr[A_idx] + "=>" + B);
				ans[A_idx] = B;
			}
			S.add(idx);
		}
		while (!S.isEmpty()) {
			int A_idx = S.pop();
			System.out.println(arr[A_idx] + "=>" + -1);
			ans[A_idx] = -1;
		}
		System.out.println(Arrays.toString(ans));
	}
}
