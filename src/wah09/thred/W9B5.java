package wah09.thred;

import wah09.spaghettiman.InterStellar;

public class W9B5 {
	public static void main(String[] args) {
		
		Runnable iStellar = new InterStellar();
		
		Thread thread = new Thread(iStellar);
		
		thread.start();
		
		System.out.println("mended");
		
		
		
		
	}

}
