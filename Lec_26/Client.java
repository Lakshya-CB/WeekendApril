package Lec_26;

public class Client {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.Age);
		System.out.println(s.Name);

		s.Name = "golu";
		s.Age = 1;

		Student s1 = s;
		System.out.println(s1.Name);
	}	
}
