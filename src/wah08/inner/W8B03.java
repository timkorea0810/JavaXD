package wah08.inner;

import wah08.pacman.Wepin;

public class W8B03 {
	public static void main(String[] args) {
		
		Wepin w = new Wepin() {
			
			int dmg =10;
			@Override
			public void attac() {
				System.out.println(dmg);
				
			}
		};
		
		w.attac();
		
	}

}
