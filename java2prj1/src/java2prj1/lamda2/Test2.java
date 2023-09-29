package java2prj1.lamda2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		for(String s : list) {
			System.out.println(s);
		}

System.out.println("==========");
		list.forEach(item -> System.out.println(item));

System.out.println("==========");
		list.forEach(new Consumer<>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		Collections.sort(list, new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		System.out.println("정렬 후 출력");
		// 배열로
		System.out.println(list);
		// 각각
		list.forEach(item -> System.out.println(item));
		
		Collections.sort(list, (o1,o2) -> o1.compareTo(o2));
	}

}
