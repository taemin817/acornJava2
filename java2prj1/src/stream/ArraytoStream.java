package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArraytoStream {
	public static void main(String[] args) {

		// 배열을
		String[] arr = new String[] {"one", "two", "three"};
		// 정렬(String에서 sort의 기본정렬은 오름차순)하고
		Arrays.sort(arr);
		// 출력
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println("\n==========");
		
		// ArrayList를
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		// 출력
		for(String s : list) {
			System.out.print(s + " ");
		}
		System.out.println("\n==========");
		
		// 배열을 stream으로
		Stream<String> stream1 = Arrays.stream(arr);
		
		// ArrayList를 stream으로
		Stream<String> stream2 = list.stream();
		
		stream1.sorted().forEach(s -> System.out.println(s));

		System.out.println("==========");
		stream2.sorted().forEach(s -> System.out.println(s));
		
		// 내림차순
		Stream<String> stream3= list.stream();
		stream3.sorted( (o1,o2)-> o2.compareTo(o1)).forEach( item -> System.out.println( item));
		
		
	}
}
