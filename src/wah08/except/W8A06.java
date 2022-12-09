package wah08.except;

import wah08.pacman.NumberPrinter;

public class W8A06 {
	public static void main(String[] args) throws InterruptedException {
		NumberPrinter np = new NumberPrinter();
		np.printNumber();
		
		
		throw new NullPointerException();
		
	}
}
