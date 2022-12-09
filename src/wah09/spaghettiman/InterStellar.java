package wah09.spaghettiman;


public class InterStellar implements Runnable {
	
	@Override
	public void run() {
		System.out.println("stars");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("blackhole");
	}

}
