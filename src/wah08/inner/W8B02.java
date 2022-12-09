package wah08.inner;

import wah08.pacman.MyUtil;
import wah08.pacman.MyUtil.Calculator;
public class W8B02 {
	public static void main(String[] args) {
		
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		
		hp.printHello();
		
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		
		hp2.printHello();
		
		
		
		MyUtil.Calculator c = new Calculator();
		c.calc(10, 20);
		
		
	}

}
