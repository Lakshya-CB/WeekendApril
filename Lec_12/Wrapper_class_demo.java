package Lec_12;

public class Wrapper_class_demo {
	public static void main(String[] args) {
		int  i =10;
		Integer I = 100;
		System.out.println(I);
		System.out.println(I==i);
		
//		I = i;// boxing, autoboxing!!
		
		i = I;  // unboxing !
		System.out.println(I);
		
		
		
	}
}
