package java2prj1.lamda;


public class 표준태 {
	interface AddInterface {
		int randomsu  (int su);
	};
	public static void main(String[] args) {
		
		//1번 클래스를 만들어서 만들기
		class No1 implements AddInterface{

			@Override
			public int randomsu(int su) {
				
				return (int)(Math.random()*su);
			}
			
		}
		No1 n1 = new No1();
		int result =n1.randomsu(7);
		System.out.println(result);
		
		
		//2번 익명 함수로 만들기
		AddInterface No2 = new AddInterface() {

			@Override
			public int randomsu(int su) {
				return (int)(Math.random()*su);
			}
			
		};
		int result2 = No2.randomsu(5);
		System.out.println(result2);
		
		//3번 람다 통해서 만들기
		AddInterface No3 = su -> (int)(Math.random()*su);
		int result3 = No3.randomsu(6);
		System.out.println(result3);
		
	}
}
