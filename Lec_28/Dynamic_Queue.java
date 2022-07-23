package Lec_28;

public class Dynamic_Queue extends Queue{

//	{60,70,30,40,50}
//	s =2
	@Override 
	public void add(int ali){
		if(isFull()) {
			int[] biggy = new int[this.arr.length*2];
			for(int i=s;i<s+Size();i++) {
				biggy[i-s] = arr[i%arr.length];
			}
			s=0;
			arr = biggy;
		}
		super.add(ali);
	}
}
