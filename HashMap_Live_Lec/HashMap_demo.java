package HashMap_Live_Lec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Chomu", 20); // O(1)
		map.put("Kaka", 25);
		map.put("Shamu", 40);
		map.put("Vishal", 45);

		System.out.println(map.get("shamu")); // O(1)

		System.out.println(map.containsKey("Golu"));// O(1)

		System.out.println(map.size());
		map.put("Vishal", 50);
		System.out.println(map.get("Vishal")); // O(1)

		map.remove("Chomu"); // O(1)
		System.out.println(map.containsKey("chomu"));// O(1)
		map.put("AZ101", 45);
		map.put("A2", 405);

		System.out.println(map);
		System.out.println(map.keySet());
		Set<String> Keys = map.keySet();
		System.out.println(Keys);
		for (String key : Keys) {
			System.out.println(key);
		}
		ArrayList<String> AL = new ArrayList<>(Keys);
		System.out.println("==" + AL);
		for(String key : map.keySet()) {
			System.out.println(key +"="+map.get(key));
		}
	}
	
}
