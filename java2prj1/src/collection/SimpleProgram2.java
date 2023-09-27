package collection;

import java.util.Scanner;

public class SimpleProgram2 {

	// 의존성 dependency
	private CalculatorI cal;
	
	// dependency injection
	public void setCal(CalculatorI cal) {
		this.cal = cal;
	}

	public void run() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산기 프로그램");
		
		System.out.println("첫번째 수 입력>");
		int su1 = sc.nextInt();
		
		System.out.println("두번째 수 입력>");
		int su2 = sc.nextInt();

		int result = cal.add(su1, su2);
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		SimpleProgram2 p = new SimpleProgram2();
		p.setCal(new Caculator1());
		p.run();
		
	}

}
