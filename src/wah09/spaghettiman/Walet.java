package wah09.spaghettiman;

public class Walet {
	public int totalKromer;
	
	public Walet() {
		this.totalKromer = 10000;
	}
	
	public synchronized int getKromer() {
		
		if(totalKromer == 0) 
			return 0;
		
		totalKromer = totalKromer - 1;
		System.out.println(totalKromer);
		return 1;
		
		
	}

}
