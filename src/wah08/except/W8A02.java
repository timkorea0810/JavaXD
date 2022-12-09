package wah08.except;

import java.util.Random;

public class W8A02 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		Random ran = null;
		
		try {
			ran.nextInt();
			
			result = num1/num2;
			
		} catch (ArithmeticException aeugh) {
			System.out.println("sus");
		} catch (NullPointerException nyeh) {
			System.out.println("No");
		} catch (Exception e) {
			System.out.println("F");
			e.printStackTrace();
		}
		
	}

}
