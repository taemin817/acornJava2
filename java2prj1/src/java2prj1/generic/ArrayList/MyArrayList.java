package java2prj1.generic.ArrayList;

public class MyArrayList {

	private Object[] nums;
	private int current;

	public MyArrayList() {
		nums = new Object[5];
		current = 0;
	}
	
	// 평소에 배열만들고 list.add(어쩌구) 하던 내용들을 직접 구현해 보았다
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
