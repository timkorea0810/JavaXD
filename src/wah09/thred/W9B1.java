package wah09.thred;

import wah09.spaghettiman.Spaghettiman;

public class W9B1 {
	public static void main(String[] args) {
		System.out.println("메인");
		Spaghettiman spaghetti1 = new Spaghettiman();
		spaghetti1.start();
		System.out.println("종료 메인");
	}
}
