package wah09.thred;

public class W9B6 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("start");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Indeed");
			}
		}).start();
		
		System.out.println("mended");
	}
}
