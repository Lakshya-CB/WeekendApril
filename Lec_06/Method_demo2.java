package Lec_06;

public class Method_demo2 {
	public static void main(String[] args) {
		System.out.println("bro!");
		fun100();
		System.out.println("Bye!");
//		fun1();
		
	}

	public static void fun2() {
		System.out.println("fun3 start");
		System.out.println("fun3 end");
	}
	
	public static void fun20() {
		System.out.println("fun2 start");
		fun2();
		System.out.println("fun2 end");
	}
	public static void fun100() {
		System.out.println("fun1 start");
		fun2();
		System.out.println("fun1 end");
	}

	

	


}
