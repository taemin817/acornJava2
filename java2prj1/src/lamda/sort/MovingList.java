package lamda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class MovingList {
	public static void main(String[] args) {

		ArrayList<Moving> list = new ArrayList<>();

		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new	 Moving("이미현", "경기", 80));
		list.add(new  Moving("김두식", "문산", 90));
		list.add(new  Moving("전영석", "봉평", 88));
		
		
		//	이름순 정렬 람다식 사용하여 출력
		Collections.sort(list);
		list.forEach(m -> System.out.println(m));
		
		System.out.println("=====================================");
		
		// 익명함수를 사용한 이름순 정렬
		list.forEach(new Consumer<>() {
			@Override
			public void accept(Moving t) {
				System.out.println(t);
			}});
		
		System.out.println("===============이름순 끝================");
		
		
		//	암호순 정렬
		Collections.sort(list, new Comparator<>() {
			@Override
			public int compare(Moving o1, Moving o2) {
				return o1.code.compareTo(o2.code);
			}});
		list.forEach(n -> System.out.println(n));
		
		System.out.println("===============암호순 끝================");
		
		
		//	파워순 정렬
		Collections.sort(list, new Comparator<>() {
			@Override
			public int compare(Moving o3, Moving o4) {
				return o3.power-o4.power;
			}});
		list.forEach(o -> System.out.println(o));

		System.out.println("===============파워순 끝================");
	}

}
