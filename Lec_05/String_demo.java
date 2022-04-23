package Lec_05;

public class String_demo {
	public static void main(String[] args) {
		String str = "Hello ji" ;
		int i = 10;
		System.out.println(str +" => "+ i);
		System.out.println("Hello" + 10 + 20); // hello1020
		System.out.println("Hello" + (10 + 20)); // hello30
		System.out.println(10 + "Hello" + 10 + 20);// 10hello30 , 1020
		System.out.println(20 + 10 + "Hello”" + 10 + 20); //30 hello 1020

	}
}
