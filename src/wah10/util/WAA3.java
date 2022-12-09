package wah10.util;

import java.util.Vector;

public class WAA3 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		
		vec.add("pikachu");
		vec.add("raichu");
		vec.add("charmander");
		
		
		String str = vec.get(0);
		System.out.println(str);
		
		
		for (String name : vec) {
			System.out.println(name);
		}
		
		
	}

}
