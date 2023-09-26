package generic;

public class GList<T> {
	
	private Object[] nums;
	private int current; 	
	
// 평소에 제네릭스만들고 list.add(어쩌구)하던 내용들을 직접 구현해 보았다	
	public GList() {		 
		nums = new Object[3];
		current=0;
	}
	
	public void add(T obj) {
		nums[current] = obj;
		current++;
	}
	
	public int size() {
		return current;
	}

	public void clear() {
		//current 초기화
		current=0;
		// nums= new int[3];		
	}
	
	public T get(int index) { 
		return (T) nums[index];
	}	
	
}
