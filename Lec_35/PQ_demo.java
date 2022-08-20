package Lec_35;

import java.util.PriorityQueue;

public class PQ_demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		PQ.add(10);// log(n)
		PQ.add(100);
		PQ.add(5);
		PQ.add(15);
		System.out.println(PQ);
		System.out.println(PQ.poll());//log(n)
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		
	}
}
