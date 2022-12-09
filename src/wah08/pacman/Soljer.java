package wah08.pacman;

public class Soljer {
	public Wepin w;
	
	
	
	public Soljer(Wepin w) {
		this.w = w;
		w.attac();
		
		System.out.println(System.identityHashCode(w));
	}

}
