package wah08.inner;

import wah08.pacman.Soljer;
import wah08.pacman.Wepin;

public class W8B04 {
	public static void main(String[] args) {
		Soljer s = new Soljer(new Wepin() {
			
			@Override
			public void attac() {
				System.out.println("솔ㅈㅕ 공겨ㄱ!");
			}
		});
		
		System.out.println(System.identityHashCode(s.w));
		s.w.attac();
	}

}
