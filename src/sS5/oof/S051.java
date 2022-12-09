package sS5.oof;

public class S051 {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("Forgotten land " + car1.model);
		System.out.println("kirby " + car1.color);
		
		car1.drive();
		car1.autopilot();		
		
		Car car2 = new Car();
		car2.model = "Cerby";
		car2.color = "yellow";
		System.out.println("Forgotten land " + car2.model);
		System.out.println("keeby " + car2.color);
		
		car2.drive();
		car2.autopilot();
	}
}

class Car {
	String model = "Carby";
	String color = "pink";
	
	//
	public void drive() {
		System.out.println("Drive");
	}
	
	//
	public void autopilot() {
		System.out.println("Autopilot");
	}
}