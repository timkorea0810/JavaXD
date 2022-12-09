package wah09.spaghettiman;

public class Bro extends Thread {
	public Walet walet;
	public int kromer;
	
	public Bro(Walet walet) {
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
		System.out.println("B"+kromer);
	}
}
