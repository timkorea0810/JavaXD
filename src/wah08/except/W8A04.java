package wah08.except;

import java.util.Iterator;

public class W8A04 {
	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
