package java2prj1.generic.ArrayList;

public class MAL {

	private Object[] nums;
	private int current;

	public MAL() {
		nums = new Object[5];
		current = 0;
	}

	public void add(Object obj) {
		nums[current] = obj;
		current++;
	}

	public Object get(int index) {
		return nums[index];
	}

	public int size() {
		return current;
	}

	public int clear() {
		return current = 0;
	}

	public void forEach(MyConsumer c) {
		for (int i = 0; i < current; i++) {
			c.accept(get(i));
		}
	}
}
