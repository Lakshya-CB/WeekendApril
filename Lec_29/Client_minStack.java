package Lec_29;

public class Client_minStack {
	public static void main(String[] args) {
		min_Stack S = new min_Stack();
//		3,40,4,60,5,50,10
		S.Add(10);
		System.out.println(S.getMin());
		S.Add(50);
		System.out.println(S.getMin());
		S.Add(5);
		System.out.println(S.getMin());
		S.Add(60);
		System.out.println(S.getMin());
		S.Add(4);
		System.out.println(S.getMin());
		S.Add(40);
		System.out.println(S.getMin());
		S.Add(3);
		System.out.println(S.getMin());
		System.out.println("=================");
		System.out.println(S.pop()+" "+S.getMin());
		System.out.println(S.pop()+" "+S.getMin());
		System.out.println(S.pop()+" "+S.getMin());
		System.out.println(S.pop()+" "+S.getMin());
		System.out.println(S.pop()+" "+S.getMin());
		System.out.println(S.pop()+" "+S.getMin());
		System.out.println(S.pop()+" "+S.getMin());
		
		
	
	
	}
}
