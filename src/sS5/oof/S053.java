package sS5.oof;

//
import sS5.manpac.MathUtil;

public class S053 {
	public static void main(String[] args) {
		//
		int r = 5;
		
		MathUtil mu = new MathUtil();
		
		double area = mu.getArea(r);
		
		System.out.println(area);
		
		
		int result = mu.sum(6, 4);
		System.out.println(result);
		
		
		System.out.println(mu.sum(5, 9, 1));
		
		
	}

}
