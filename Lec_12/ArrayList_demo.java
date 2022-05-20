package Lec_12;

import java.util.ArrayList;

public class ArrayList_demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(10);
		AL.add(20);
		AL.add(30);
		AL.add(40);
		AL.add(50);
		System.out.println(AL);
		for(int ali : AL) {
			System.out.println(ali);
		}
		System.out.println(AL.size());
//		get
		System.out.println(AL.get(2));
		System.out.println(AL.get(AL.size()-1));
//		set
		AL.set(0, 99);
		System.out.println(AL);
		AL.set(AL.size()-1, 200);
		System.out.println(AL);

		AL.set(0, null);
		System.out.println(AL);
		Integer I = null;
		System.out.println(I);
		int i = null;
		System.out.println(i);
		
	}
}
