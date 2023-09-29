package java2prj1.lamda;

// 람다식 : 메소드를 간단한 식으로 표현한 것. 익명객체
// 인터페이스(functional interface - 추상메소드가 한개인 인터페이스)를 제공.

@FunctionalInterface
interface AddInterface {
	int add(int a, int b);
}

public class AddInterfaceEx {
	public static void main(String[] args) {

		// 1.
		class AddInterfaceImp implements AddInterface {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		}
		
		AddInterfaceImp f1 = new AddInterfaceImp();
		int result1 = f1.add(10, 5);
		System.out.println(result1);

		// 2. AddInterface f2 = new AddInterface() {}; -> 익명클래스 정의
		AddInterface f2 = new AddInterface() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		int result2 = f2.add(6, 1);
		System.out.println(result2);

		// 3.
		// AddInterface f3 = (int a, int b) -> {return a+b;};
		AddInterface f3 = (a, b) -> a + b;
		int result3 = f3.add(5, 3);
		System.out.println(result3);
	}
}
