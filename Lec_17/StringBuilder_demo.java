package Lec_17;

public class StringBuilder_demo {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		System.out.println(str1);
		
		StringBuilder sb = new StringBuilder(str1);
		System.out.println(sb);
		
		char ch = sb.charAt(0);// O(1) get
		sb.setCharAt(0, '~'); // O(1) set
		
		
		System.out.println(sb);
		
		System.out.println(sb.substring(0, 4));
		
		sb.deleteCharAt(0); //O(n)
		System.out.println(sb);
		sb.append("OLOLOL");
		System.out.println(sb);
		sb.insert(4, "k");
		System.out.println(sb);
		

		
		System.out.println("==============");

		long start = System.currentTimeMillis();
		int n = 1000000;
		for (int i = 0; i < n; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		

		System.out.println(end - start);
		String ans = sb.toString();
		
//		System.out.println(ans);
	}
}
