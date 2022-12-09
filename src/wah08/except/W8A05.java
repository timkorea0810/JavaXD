package wah08.except;

import wah08.pacman.NumberPrinter;

public class W8A05 {
	
	public static void main(String[] args) {
		NumberPrinter np = new NumberPrinter();
		
		try {
			np.printNumber();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
