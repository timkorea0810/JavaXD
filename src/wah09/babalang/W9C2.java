package wah09.babalang;

public class W9C2 {
	public static void main(String[] args) {
		
		boolean b = true;
		Boolean wb1 = new Boolean(true);
		Boolean wb2 = new Boolean(false);
		
		Boolean wb3 = Boolean.valueOf(true);
		
		Integer number1 = Integer.valueOf(10);
		Integer number2 = new Integer(10);
		int number3 = 10;
		
		System.out.println(number1);
		System.out.println(number2);
		
		System.out.println("x" + (number1 == number3));
		System.out.println("y" + (number1 == number2));
		
		int number4 = number1;
		int number5 = number2;
		System.out.println(number4 == number5);
		
		int iNum1 = Integer.parseInt("100");
		int iNum2 = Integer.parseInt("100");
		
		System.out.println(iNum1 + iNum2);
		
		
		
		
		
		
		
		
		
		
	}

}
