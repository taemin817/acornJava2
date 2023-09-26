package java2prj1.InterfaceEx.cast;

public class 캐스팅연습2 {

	public static void main(String[] args) {
		
		Score s = new Score("홍길동", 99, 90);
		Score s2 = new Score("고길동", 80, 99);
		
		int result = s.compareTo(s2);
		System.out.println(result);
		
	}
}
