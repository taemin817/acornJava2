package test;

public class Food {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + "]";
	}

	public Food(String name) {
		super();
		this.name = name;
	}
	public Food() {
		// TODO Auto-generated constructor stub
	}
	
}
