package Lec_28;

import java.util.ArrayList;

public class Client_In {
	public static void main(String[] args) {
//		Case 1:
		Parent P = new Parent();
//		Case 2:
		Parent obj1 = new Child();

		System.out.println(obj1.dataP);
//		variable collision
		System.out.println(obj1.data);
		System.out.println(((Child) obj1).data);
//		function collision
		obj1.funP();

		obj1.fun();
		((Child) obj1).fun();
//		case 3
		Child C = new Child();
//		case 4
//		Child C2 = new Parent();
		System.out.println(C);
		Object x = C;
		ArrayList<Integer> AL = new ArrayList<>();
	}
}
