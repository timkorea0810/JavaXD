package wah0$.method;

public class W011 {
	public static String name;
	
	public static void main(String[] args) {
		System.out.println("s");
		
		
		hello();
		
		
		printName("tim");
		printName("tim", -256);
		
		setName("Pikachu");
		
		String sus = getName();
		
		System.out.println(sus);
		
		String eMon = getEvolution("Squirtle");
		
		System.out.println(eMon);
		
	}
	
	
	public static void hello() {
		System.out.println("Hello WARIO");
	}
	
	
	public static void printName(String name) {
		System.out.println("Hello" + name);
	}
	
	
	public static void printName(String name, int age) {
		System.out.println("Hello" + name);
	}
	
	
	public static void setName(String name) {
		W011.name = name;
	}
	
	
	public static String getName() {
		return name;
	}
	
	
	public static String getEvolution(String mon) {
		String eMon = "";
		if(mon.equals("Squirtle")) {
			eMon = "Wartortle";
		}else if(mon.equals("Wartortle")) {
			eMon = "Blastoise";
		}
		
		return eMon;
	}
}
