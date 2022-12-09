package wah0$.array;

public class W002 {
	public static void main(String[] args) {
		
		String[] names = new String[6];
		names[0] = "Pikachu";
		names[1] = "Raichu";
		names[2] = "Charmander";
		names[3] = "Squirtle";
		names[4] = "Butterfree";
		names[5] = "Slowbro";
		
		System.out.println(names[3]);
		
		System.out.println(names.length);
		
		for (int i=0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		names[4] = "Snorlax";
		
		
		for(String tmp : names) {
			System.out.println(tmp);
		}
		
	}
	
}
