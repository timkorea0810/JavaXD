package wah08.pacman;

public class NumberPrinter {
	
	public void printNumber() throws InterruptedException {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
