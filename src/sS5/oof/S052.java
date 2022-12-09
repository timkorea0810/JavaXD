package sS5.oof;

import sS5.manpac.Book;

public class S052 {
	public static void main(String[] args) {
		Book book1 = new Book();
		
		System.out.println("scarlet " + book1.subject);
		System.out.println("prof " + book1.writtter);
		
		book1.read();
		book1.key();
	}
	
}
