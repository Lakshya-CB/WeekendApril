package Lec_27;

public class Client {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Name = "laalu";
		s1.Age = 51;
		System.out.println(s1);
//		s1.party();
//		s1.Intro();
		s1.partyWith("lallu");
		
		Student s2 = new Student();
		s2.Name = "lallu";
		s2.Age = 15;
		s1.partyWithS(s2);
		
//		s2.Intro();
//		
//		
	}
}
