package Lec_28;

public class Queue {
	int[] arr;
	int s = 0;
	int size = 0;

	public Queue() {
		arr = new int[5];
	}

	public Queue(int cap) {
		arr = new int[cap];
	}

	public int Size() {
		return size;
	}

	public boolean isEmpty() {
		return Size() == 0;
	}

	public boolean isFull() {
		return Size() == arr.length;
	}

	public void add(int ali) {
		if (isFull()) {
			throw new RuntimeException("bhara hein");
		}
		int idx = s + size;
		idx = idx % arr.length;
		arr[idx] = ali;
		size++;
	}

	public int poll() {
		if (isEmpty()) {
			throw new RuntimeException("gaali hein");
		}
		int ans = arr[s];
		s++;
		s = s % arr.length;
		size--;
		return ans;
	}
	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("gaali hein");
		}
		return arr[s];
	}

	public void disp() {
		int idx = s;
		while (idx < s + Size()) {
			System.out.print(arr[idx % arr.length] + " ");
			idx++;
		}
		System.out.println();
	}
}
