package Lec_28;

public class Stack {
	int[] arr;
	int tos;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
		tos = -1;
	}

	public Stack(int C) {
		arr = new int[C];
		tos = -1;
	}

	public int Size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return Size() == 0;
	}

	public boolean isFull() {
		return Size() == arr.length;
	}

	public void Push(int ali) {
		

		Add(ali);
	}

	public void Add(int ali) {
		if (isFull()) {
			throw new RuntimeException("bhara hein");
		}
		tos++;
		arr[tos] = ali;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("gaali hein");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}
	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("gaali hein");
		}
		return arr[tos];
	}

	public void disp() {
		int copy = tos;
		while (copy >= 0) {
			System.out.print(arr[copy] + " ");
			copy--;
		}
		System.out.println();
	}
}
