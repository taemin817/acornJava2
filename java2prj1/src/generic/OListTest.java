package generic;

public class OListTest {

	public static void main(String[] args) {
		OList list = new OList();
		list.add(new Score("고길동", 99, 99));
		list.add(new Score("홍길동", 90, 80));
		list.add(new Score("길길동", 95, 90));
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
			//Object toString -> Score toString();
			// 오버라이딩된 메소드는 부모형으로 참조해도 실제 객체의 메소드가 동작 = 다형성
			
			Object obj = list.get(i);
			System.out.println(((Score) obj).getKor());
		}
	}

}
