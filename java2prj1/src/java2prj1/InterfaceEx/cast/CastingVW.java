package java2prj1.InterfaceEx.cast;

import java.util.ArrayList;

public class CastingVW {

	public static void main(String[] args) {

		Motorsgroup bentley = new Motorsgroup("Bentley", 1998);
		Motorsgroup audi = new Motorsgroup("Audi", 1964);
		Motorsgroup skoda = new Motorsgroup("skoda", 1991);
		Motorsgroup lamborghini = new Motorsgroup("lamborghini", 1998);

		String b = bentley.including(bentley);
		String a = audi.including(audi);
		String s = skoda.including(skoda);
		String l = lamborghini.including(lamborghini);

		ArrayList<String> list = new ArrayList<String>();
		
		list.add(b);
		list.add(a);
		list.add(s);
		list.add(l);

		System.out.println("폭스바겐그룹은 다음의 회사를 인수합병함");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
