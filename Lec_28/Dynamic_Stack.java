package Lec_28;

public class Dynamic_Stack extends Stack {

	@Override
	public void Add(int ali) {
		if(this.isFull()) {
			int[] biggy = new int[this.arr.length*2];
			for(int i=0;i<this.arr.length;i++) {
				biggy[i] = arr[i];
			}
			arr = biggy;
		}
		super.Add(ali);
	}
}
