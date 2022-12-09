package wah08.pacman;

public class MyUtil {
	
	public String name = "Antonball";
	public static String nname = "Antonblast";	
	
	
	public class HelloPrinter{
		
		
		public void printHello() {
			System.out.println("sup " + name);
			System.out.println("hw");
		}
	}
	
	
	public static class Calculator {
		
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println(nname);
			System.out.println(result);
		}
	}
}
