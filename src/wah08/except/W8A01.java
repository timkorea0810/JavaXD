package wah08.except;

public class W8A01 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		int result = 0;		
		
		try {
			result = num1/num2;
			System.out.println(result);
		} catch(Exception e) {
			System.out.println("Failboat");
			e.printStackTrace();
			System.out.println(e);
		}
	}
	
	
}
