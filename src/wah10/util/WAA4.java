package wah10.util;

import java.util.HashSet;
import java.util.Iterator;

public class WAA4 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("pikachu");
		hs.add("raichu");
		hs.add("charmander");
		hs.add("pikachu");
		
		
		System.out.println(hs.size());
		
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			
			String value = it.next();
			
			System.out.println(value);
			
			
		}
		
		
	}

}
