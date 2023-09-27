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
		// 이름이라는 문자열을 사전순서로 비교하여 정렬. 반환값은 양수(기준이 비교보다 작다) 음수(기준이 비교보다 큼) 0(같음)
	}
	
}
