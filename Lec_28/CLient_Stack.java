package Lec_28;

public class CLient_Stack {
	public static void main(String[] args) {
		Stack S = new Stack();
		S.Add(10);
		S.Add(20);
		S.Add(30);
		S.Add(40);
		S.Add(50);
		S.disp();
		System.out.println(S.pop());
		S.disp();

	}
}
