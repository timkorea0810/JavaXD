package wah08.inner;

public class W8B01 {
	public static void main(String[] args) {
		new W8B01.InnerClass().doSomething();
		new InnerClass().doSomething();
		
	}
	
	static class InnerClass {
		public void doSomething() {
			System.out.println("Kirby, you gotta DO SOMETHING!!!");
		}
	}
	
}
