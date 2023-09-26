package java2prj1.generic.ArrayList;

import java.util.ArrayList;
import java.util.function.Consumer;

public class 와일드문자로제한 {
	// 구현할 메소드가 하나뿐인 인터페이스 : functional Interface -> 람다식으로 표현 가능
	public static void print(ArrayList<String> list) {
		for( int i=0; i< list.size() ; i++) {		
			System.out.println(list.get(i));
		}
	}

	// 메소드 인자에서 제네릭 제한
	// ? super String -> string과 부모는 가능. 하한이 string
	// ? extends String -> string만 가능. 상한이 string
	public static void print2(ArrayList<? super String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");

		print(list);	// ArrayList<String> list
		System.out.println("=====print(list)끝=====");
		
		print2(list);	// ArrayList<? super String> list
		System.out.println("=====print2(list)끝=====");

		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("one");
		list2.add("two");
		list2.add("three");

		// print(list2); -> 오류
		print2(list2);
		System.out.println("=====print2(list2)끝=====");
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("one");
		list3.add("two");
		list3.add("three");

		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}

		System.out.println("=====println(list3).get(i)끝=====");
		
		class aaa implements Consumer<String> {
			public void accept(String t) {
				System.out.println(t);
			}
		}

		list3.forEach(new aaa());

		System.out.println("========aaa() 끝========");
		list3.forEach(new Consumer<>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

		System.out.println("==forEach로 accept(String t) 끝==");

		list3.forEach(t -> System.out.println(t));

		System.out.println("========람다식 사용완료========");
	}


}
