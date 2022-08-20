package Lec_35;

import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {
//		<Key, Value>
		HashMap<String, Integer> map = new HashMap<>();
		map.put("chomu", 10); //O(1)
		map.put("bintu", null);
		map.put("asd", 90);
		map.put("chinto", 15);
		map.put("tony", 2);
		
		System.out.println(map.get("tony"));//O(1)
		map.put("toopony", 25);
		System.out.println(map.get("tony"));//O(1)
		
		System.out.println(map);
		System.out.println(map.containsKey("bintu"));
		Set<String> Keys = map.keySet();
		for(String Key : Keys) {
			System.out.println(Key+"-"+map.get(Key));
		}
		map.remove("chomu");
		System.out.println(map); 
		
	}
}
