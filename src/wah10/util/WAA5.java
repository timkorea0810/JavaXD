package wah10.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WAA5 {
	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<>();
		
		
		map1.put("Wario", "Land");
		map1.put("Pizza", "Tower");
		map1.put("Anton", "Blast");
		
		
		String value = map1.get("Wario");
		
		System.out.println("WARIO " + value + " 4");
		
		
		Set<String> set = map1.keySet();
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String keyValue = it.next();
			
			
			String value2 =map1.get(keyValue);
			
			
			System.out.println(value2);
			
			
			
		}
		
		
	}

}
