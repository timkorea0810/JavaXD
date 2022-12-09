package wah09.thred;

import wah09.spaghettiman.Bro;
import wah09.spaghettiman.Sis;
import wah09.spaghettiman.Walet;

public class W9B4 {
	public static void main(String[] args) {
		
		Walet walet = new Walet();
		
		
		Sis sis = new Sis(walet);
		
		
		Bro bro = new Bro(walet);
		
		sis.start();
		bro.start();
		
		System.out.println("mended");
	}
}
