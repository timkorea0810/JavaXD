package wah08.except;

import java.util.Random;

public class W8A03 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		try {
			System.out.println("DB");
			System.out.println(ran.nextInt()/0);
		} catch (Exception e) {
			System.out.println("Failboat");
		} finally {
			System.out.println("ended");
		}
		
	}
}
