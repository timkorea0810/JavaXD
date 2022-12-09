package wah06.pacman;

public class MobilePhone extends Phone{
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		name += "rio";
		super.name = name;
		System.out.println(this.getName());
	}
}
