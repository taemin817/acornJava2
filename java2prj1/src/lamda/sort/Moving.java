package lamda.sort;

public class Moving implements Comparable<Moving>{

	String name;
	String code;
	int power;
	
	@Override
	public String toString() {
		return "Moving [name=" + name + ", code=" + code + ", power=" + power + "]";
	}
	
	public Moving(String name, String code, int power) {
		super();
		this.name = name;
		this.code = code;
		this.power = power;
	}
	
	public Moving() {}
	
	@Override
	public int compareTo(Moving o) {
		return this.name.compareTo(o.name);
	}
	
}
