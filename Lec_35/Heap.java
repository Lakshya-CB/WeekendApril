package Lec_35;

import java.util.ArrayList;

public class Heap {
	ArrayList<Integer> AL;

	public Heap() {
		// TODO Auto-generated constructor stub
		AL = new ArrayList<>();
	}

	public int size() {
		return AL.size();
	}

	public boolean isEmpty() {
		return AL.isEmpty();
	}

	public int peek() {
		return AL.get(0);
	}

	public void disp() {
		System.out.println(AL);
	}

	public String toString() {
		return AL + "";
	}

	public void add(int ali) {
		AL.add(ali);
		upHeapify(AL.size() - 1);

	}

	private void upHeapify(int child) {
		int p = (child - 1) / 2;
		if (AL.get(p) > AL.get(child)) {
			swap(p, child);
			upHeapify(p);
		}
	}

	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = AL.get(i);
		AL.set(i, AL.get(j));
		AL.set(j, temp);
	}

	public int poll() {
		int ans = AL.get(0);
		AL.set(0, AL.get(AL.size() - 1));
		AL.remove(AL.size() - 1);
		downHeapify(0);
		return ans;
	}

	private void downHeapify(int p) {
		int L = 2 * p + 1;
		int R = 2 * p + 2;
		int min_idx = p;
		if (L < AL.size() && AL.get(min_idx) > AL.get(L)) {
			min_idx = L;
		}
		if (R < AL.size() && AL.get(min_idx) > AL.get(R)) {
			min_idx = R;
		}
		if(p!=min_idx) {
			swap(p, min_idx);
			downHeapify(min_idx);
		}
	}
	
}
