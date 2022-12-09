package wah07.pacman;

public class AkWepin implements Wepin, Scop {
	
	@Override
	public void attac() {
		System.out.println("공격");
	}
	
	@Override
	public void atcski() {
		System.out.println("공중");
	}
	
	@Override
	public void doSnip() {
		System.out.println("저격");
	}

}
