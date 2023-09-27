package collection;

import java.util.Scanner;

public class SimpleProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산기 프로그램");
		
		System.out.println("첫번째 수 입력>");
		int su1 = sc.nextInt();
		System.out.println("두번째 수 입력>");
		int su2 = sc.nextInt();
		
		// 디펜더
		CalculatorI cal = new Caculator1();
		
		int result = cal.add(su1, su2);
		System.out.println(result);
	}

}
