package wah09.spaghettiman;

public class Sis extends Thread {
	public Walet walet;
	public int kromer;
	
	public Sis(Walet walet) {
		this.walet = walet;
	}
	
	@Override
	public void run() {
		while(true) {
			
			int re = walet.getKromer();
			if(re == 0)
				break;
			
			kromer = kromer + re;
		}
		System.out.println("S"+kromer);
	}

}
