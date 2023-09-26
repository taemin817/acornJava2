package test;

public class Pasta extends Food {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pasta [name=" + name + "]";
	}

	public Pasta(String name) {
		super(name);
		this.name = name;
	}
	
	public Pasta() {
		// TODO Auto-generated constructor stub
	}
}
