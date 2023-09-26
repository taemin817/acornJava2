package generic;

public class GListTest {

	public static void main(String[] args) {
		
		GList<Score> list = new GList<Score>();
		
		list.add(new Score("김채원", 90, 60));
		list.add(new Score("허윤진", 70, 100));

		for(int i = 0; i<list.size(); i++) {
			Score s = list.get(i);
			System.out.println(s);
			System.out.println(s.getEng());
		}
	}

}
