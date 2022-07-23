package Lec_28;

public class Client_Q {
	public static void main(String[] args) {
		Queue Q = new Queue();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
		Q.disp();
		System.out.println(Q.poll());
		Q.disp();
		Q.add(60);
		Q.disp();
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		
		System.out.println(Q.poll());
		System.out.println(Q.Size());
	}
}
