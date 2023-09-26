package java2prj1.generic.ArrayList;

public class MyArrayTest {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();

		list.add("one");
		list.add("two");
		list.add("three");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("=======for문 끝=======");
		
		
		class a implements MyConsumer{

			@Override
			public void accept(Object o) {
			 System.out.println(o);
				
			}
		}
		
		list.forEach( new a());

		System.out.println("======상속받은거 끝======");
		// 익명클래스
		list.forEach( new MyConsumer() {

			@Override
			public void accept(Object o) {
				System.out.println( o);
				
			}});
		
		// foreEach의 문법 중 implements를 재정의하라는게 있어서 익명함수로 재정의해줌
		System.out.println("======forEach 끝======");
		list.forEach(item -> System.out.println(item));

		System.out.println("======람다식 끝======");
	}
	
	
}