package java2prj1.lamda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class forEachTest {

	public static void main(String[] args) {
		/*
		 * 장주원 이미현 김두식 전계도 프랭크 김봉석 장희수 이강훈
		 */
		ArrayList<String> list = new ArrayList<>();
		list.add("장주원");
		list.add("이미현");
		list.add("김두식");
		list.add("전계도");
		list.add("프랭크");
		list.add("김봉석");
		list.add("장희수");
		list.add("이강훈");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("======");
		
		for(String name : list) {
			System.out.println(name);
		}

		// interface를 구현하는 방법
		// 1.이름있는 클래스작성 후 인터페이스 구현
		// 2.익명클래스
		// 3.람다식
		// funtional interface(한개의 추상메소드만 가지는 인터페이스)
		
		// 1.
		class A implements Consumer<String>{
			@Override
			public void accept(String t) {
				System.out.println(t + " ");
			}
		}
		System.out.println("\n1.이름있는 클래스작성 후 인터페이스 구현");
		list.forEach(new A());
		
		//2.
		System.out.println("\n2.익명클래스");
		list.forEach(new Consumer<>() {
			@Override
			public void accept(String t) {
				System.out.println(t + " ");
			}
		});
		
		//3.
		System.out.println("\n3.람다식");
		list.forEach(item -> System.out.println(item));
		}

	
	}

