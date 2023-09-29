package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class streamEx {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("hi");
		list.add("hello");
		list.add("hello");
		list.add("bye");
		list.add("hello");

		// 값이 hello인 애들 구하기
		Stream<String> stream1 = list.stream();
		System.out.println("=='hello'인 애들==");
		stream1.filter( str -> str.equals("hello")).forEach(s->System.out.println(s));
		
		// hello가 몇개인지 구하기
		Stream<String> stream2 = list.stream();
		long result = stream2.filter(str -> str.equals("hello")).count();
		System.out.println("hello의 갯수 : " + result);
		
		// 최대 2개의 hello 구하기
		System.out.println("==최대 2개의 hello==");
		Stream<String> stream3 = list.stream();
		stream3.filter(str -> str.equals("hello")).limit(2).forEach(s -> System.out.println(s));
	}

}
