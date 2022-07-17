package Lec_27;

public class Student {
	private String Name = "LOLI";
	private int Age = 90;

	public Student() {
		Name = "LOLIPOP";
		Age = 99;
	}

	public Student(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}

	public Student(String Name) {
		this.Name = Name;
		this.Age = 0;
	}

	public void party() {
		System.out.println("masti kar");
	}

	public void Intro() {
		
//		this is 10k
		System.out.println(this);
		System.out.println("Hi " + Name + " age " + Age);
	}

	public void partyWith(String Name) {
		
		System.out.println(this.Name + " party with " + Name);
	}

	public int getAge() {
		return this.Age;
	}

	public String getName() {
		return this.Name;
	}

	public void setAge(int Age) {
		if (Age < 0) {
			throw new IndexOutOfBoundsException("sdfgsdfg");
		}
		this.Age = Age;
	}

	public void partyWithS(Student s2) {

		System.out.println(this.Name + " party with " + s2.Name);
	}
}
