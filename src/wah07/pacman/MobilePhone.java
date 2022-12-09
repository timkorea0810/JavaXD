package wah07.pacman;

public class MobilePhone extends Phone {
	
	@Override
	public void call() {
		
		System.out.println("무선");
	}
	
	public void sendMsg() {
		System.out.println("문자");
	}

}
