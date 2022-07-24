package Lec_29;

import Lec_28.Dynamic_Stack;

public class min_Stack extends Dynamic_Stack {
	int min;

	public int getMin() {
		if(super.isEmpty()) {
			throw new RuntimeException("gulla kha");
		}
		return min;
	}

	public int peek() {
		int temp = super.peek();
		if (temp < min) {
			return min;
		} else {
			return temp;
		}
	}
	@Override
	public void Add(int ali) {
		if(super.isEmpty()) {
			min = ali;
		}
		if(ali>=min) {
			super.Add(ali);
		}else {
			int prev_min = min;
			min = ali;
			int x = 2*ali-prev_min;
			super.Add(x);
		}
	}
	@Override
	public int pop() {
		if(super.peek()>=min) {
			return super.pop();
		}else {
			int x = super.pop();
			int prev_min = 2*min - x;
			int curr_min = min;
			min = prev_min;
			return curr_min;
		}
	}

}
