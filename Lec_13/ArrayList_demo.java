package Lec_13;

import java.util.ArrayList;

public class ArrayList_demo {
	public static void main(String[] args) {
//		ArrayList<Integer> AL = new ArrayList<>();
		ArrayList<Integer> AL = new ArrayList<>(5);
		

		System.out.println(AL);
		System.out.println(AL.size());
//		System.out.println(AL.get(AL.size()-1));
		AL.add(10);
		AL.add(20);
		AL.add(30);
		AL.add(40);
		
		System.out.println(AL);
		AL.add(2, 9);
		System.out.println(AL);
		AL.add(0, null);
		System.out.println(AL);
		
//		remove
		Integer ali = AL.remove(0);
		System.out.println(AL);
		System.out.println(ali);
		
	}
}
