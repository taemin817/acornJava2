package test;


public class Toybox<T> {
	private Object[] obj;
	private int index;

	Toybox() {
		obj = new Object[10];
		index = 0;
	}

	public void add(T toy) {
		obj[index] = toy;
		index++;
	}

	public  int size() {
		return index;
	}

	public T get(int index) {
		return (T) obj[index];
	} 
 
}
