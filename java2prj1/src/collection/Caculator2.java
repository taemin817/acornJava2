package collection;


public class Caculator2 implements CalculatorI {

	@Override
	public int add(int a, int b) {
		System.out.println("2호기");
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("2호기");
		return a-b;
	}

}
