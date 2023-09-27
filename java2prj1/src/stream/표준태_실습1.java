package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class 표준태_실습1 {
	public static void main(String[] args) {
		// String 배열
		String[] slist = { "새우깡", "썬칩", "홈런볼", "먹태깡", "감자깡", "옥수수깡" };
		Arrays.stream(slist).forEach(s -> System.out.println(s));
		
		// int 배열
		int[] ilist = { 9, 5, 1, 4, 7, 8, 5, 1 };
		
		Arrays.stream(ilist).sorted().forEach(s -> System.out.println(s));;
		
		
		// ArrayList 배열
		ArrayList<String> alist = new ArrayList<>();
		alist.add("고양이");
		alist.add("강아지");
		alist.add("강아지");
		alist.add("강아지");
		alist.add("강아지");
		alist.add("강아지");
		alist.add("고양이");
		alist.add("고양이");
		alist.add("고양이");
		alist.add("고양이");

		
		
		long a = alist.stream().filter(f -> f.equals("고양이")).count();
		System.out.println(a);
		
		alist.stream().filter(f -> f.equals("고양이")).forEach(e -> System.out.println(e));;
		
	}
}
