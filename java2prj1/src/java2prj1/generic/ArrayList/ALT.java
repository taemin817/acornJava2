package java2prj1.generic.ArrayList;

public class ALT {
public static void main(String[] args) {
	MyArrayList list = new MyArrayList();
	
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	list.add("e");
	
	for(int i = 0; i <list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	System.out.println("======for문 끝======");
	list.forEach(new MyConsumer() {
		public void accept(Object o) {
			System.out.println(o);
		}
	});
}
}
