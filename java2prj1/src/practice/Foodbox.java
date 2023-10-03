package practice;

public class Foodbox<T extends Food > {
	private Object[] obj;
	private int index;

	Foodbox() {
		obj = new Object[10];
		index = 0;
	}

	public void add(T food) {
		obj[index] = food;
		index++;
	}

	public  int size() {
		return index;
	}

	public T get(int index) {
		return (T) obj[index];
	} 
 
}

