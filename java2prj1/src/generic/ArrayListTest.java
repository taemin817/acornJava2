package generic;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<Score> list = new ArrayList<>();
		list.add(new Score("사쿠라", 80, 80));
		list.add(new Score("카즈하", 80, 90));
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
