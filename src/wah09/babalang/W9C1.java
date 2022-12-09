package wah09.babalang;

public class W9C1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car car1 = new Car();
		Car car2 = new Car();
//		Car car2 = car1;
		
		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));
		
		if(car1.equals(car2)) {
			System.out.println("same");
		} else {
			System.out.println("nope");
		}
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		
		System.out.println(car1);
		System.out.println(car2);
		
		String str = "hello";
		System.out.println(str.toString());
		System.out.println(str);
		
		
		Car car3 = (Car) car1.clone();
		
		Car car4 = car1;
		System.out.println(car1);
		System.out.println(car3);
		System.out.println(car4);
		
		
		
	}
}

class Car implements Cloneable {
	String model;
	String color;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}