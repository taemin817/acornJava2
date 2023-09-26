package java2prj1.InterfaceEx.cast;

public class 캐스팅연습 {

	public static void main(String[] args) {
		Score s = new Score("홍길동", 99, 90);
		System.out.println(s);
		
		// upcasting(부모형으로)
		// 상속관계에서 부모형으로 다루는(참조하는) 것, 부모형으로 참조가 축소됨
		//Object o = s;	
		
		// downcasting(자식형으로)
		//Score s2 = (Score) o;
		
		print(s);
	}
	
	public static void print(Object obj) {
		Score s = (Score) obj;
		System.out.println(s.getEng());
	}
}
