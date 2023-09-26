package test;

public class toyboxTest {

	public static void main(String[] args) {
		
		Toybox<String> list = new Toybox<>();

		list.add("실바니안 패밀리");
		list.add("레고");
		list.add("디지몬 펜들럼");
		list.add("케이캅스");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
