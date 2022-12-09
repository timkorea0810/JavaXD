package wah09.spaghettiman;

public class Spaghettiman extends Thread {
	
	@Override
	public void run() {
		System.out.println("작업");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");
		
	}

}
