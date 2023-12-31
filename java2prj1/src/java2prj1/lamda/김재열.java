package java2prj1.lamda;

@FunctionalInterface
interface mathPow {
	int mathPow(int a, int b);
}

public class 김재열 {
	public static void main(String[] args) {
		
		class mathPowImp implements mathPow {
			@Override
			public int mathPow(int a, int b) {
				return (int) Math.pow(a, b);		// a의 b제곱
			}
		}
		
		mathPowImp f1 = new mathPowImp();
		int result1 = f1.mathPow(3, 4);
		System.out.println(result1);
		
		mathPow f2 = new mathPow() {
			@Override
			public int mathPow(int a, int b) {
				return (int) Math.pow(a, b);
			}
		};
		int result2 = f2.mathPow(2, 4);
		System.out.println(result2);

		
		mathPow f3 = (a, b) -> {
			int value;
			value = (int) Math.pow(a, b);
			return value;
		};
		int result3 = f3.mathPow(2, 4);
		System.out.println(result3);
	}
}
