package wah06.accessarc;

import wah06.pacman.MobilePhone;
import wah06.pacman.Phone;

/*
 * [[접근제어자]]
 * public
 * protected
 * default
 * private
 */
public class W6A1 {

	public static void main(String[] args) {
		Phone phone = new Phone();
		
		// System.out.println(Phone.name);
		
		MobilePhone mp = new MobilePhone();
		System.out.println(mp.getName());
		
		// mp.name = "Wa"
		mp.setName("Wa");
		System.out.println(mp.getName());
	}
}
