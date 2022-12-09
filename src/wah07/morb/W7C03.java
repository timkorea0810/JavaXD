package wah07.morb;

import wah07.pacman.AkWepin;
import wah07.pacman.M4A1Wepin;
import wah07.pacman.Scop;
import wah07.pacman.Wepin;

public class W7C03 {
	public static void main(String[] args) {
		
		AkWepin ak = new AkWepin();
		ak.attac();
		ak.doSnip();
		
		
		
		Wepin w1 =new AkWepin();
		w1.attac();
		
		
		
		AkWepin ak2 = (AkWepin) w1;
		Scop s1 = ak2;
		
		s1.doSnip();
		
		System.out.println(System.identityHashCode(w1));
		System.out.println(System.identityHashCode(ak2));
		System.out.println(System.identityHashCode(s1));
		
		classifyWepin(ak2);
		
		M4A1Wepin m4 = new M4A1Wepin();
		
		classifyWepin(m4);
		
	}
	
	public static void classifyWepin(Object obj) {
		if(obj instanceof Scop) {
			System.out.println("저");
		}else {
			System.out.println("일");
		}
		
	}


}
