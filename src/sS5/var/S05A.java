package sS5.var;

import sS5.manpac.Kard;

public class S05A {
	public static String cVar;
	
	public static void main(String[] args) {
		Kard k1 = new Kard();
		
		System.out.println(k1.kardType);
		System.out.println(k1.number);
		System.out.println(k1.width);
		System.out.println(k1.height);
		
		System.out.println("");
		
		Kard k2 = new Kard();
		k2.kardType = "keke";
		k2.number = "K";
		k2.width = 69;
		k2.height = 96;
		System.out.println(k2.kardType);
		System.out.println(k2.number);
		System.out.println(k2.width);
		System.out.println(k2.height);
		
		System.out.println("");
		
		System.out.println(k1.kardType);
		System.out.println(k1.number);
		System.out.println(k1.width);
		System.out.println(k1.height);
	}
	
	
}
