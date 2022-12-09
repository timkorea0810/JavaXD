package wah09.pizzaman;

public class SmartRotom {
	public String model;
	
	
	
	static {
		System.out.println("s");
	}
	
	{
		System.out.println("i");
	}
	
	public SmartRotom() {
		this.model = "Rotom";
		System.out.println("로토");
	}
	
	
	public SmartRotom(String model) {
		this.model = model;
		System.out.println("로" + model + "토");
	}

}
