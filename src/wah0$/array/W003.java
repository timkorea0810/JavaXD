package wah0$.array;

public class W003 {
	public static void main(String[] args) {
		
		String[] names = {"Pikachu", "Raichu", "Charmander", "Squirtle", "Grimer"};
		
		
		for(int i=0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		for(String tmp : names) {
			System.out.println(tmp);
		}
		
	}
	
}
