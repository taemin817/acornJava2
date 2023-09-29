package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BookTest {
	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("신의영역 유머집", 5000));
		list.add(new Book("초급 유머집", 2000));
		list.add(new Book("고급 유머집", 4000));
		list.add(new Book("중급 유머집", 3000));
		
		Stream<Book> stream = list.stream();
		System.out.println("가격 4천원 이상 출력");
		stream.filter(book -> book.getPrice()>=4000).forEach(item -> System.out.println(item));
		
		System.out.println("가격의 오름차순 정렬");
		stream = list.stream();
		stream.sorted((o1, o2) -> o1.getPrice()-o2.getPrice()).forEach(item -> System.out.println(item));
		//stream.sorted((o1, o2) -> o2.getPrice()-o1.getPrice()).forEach(item -> System.out.println(item));	//내림차순
	}
}
