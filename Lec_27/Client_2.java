package Lec_27;

public class Client_2 {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		s1.setAge(-10);
		try {
			System.out.println("try S");
			s1.setAge(10);
			System.out.println("try E");
		} catch (Exception e) {

			System.out.println("Cat S");
//			e.printStackTrace();
			System.out.println("Cat E");
		} finally {
			System.out.println("FF");
		}

		System.out.println("end");

	}
}
