package wah09.thred;

import wah09.spaghettiman.CountPasta;

public class W9B3 {
	public static void main(String[] args) {
		CountPasta cPasta = new CountPasta();
		
		cPasta.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i*100);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("mended");
		
	}

}
