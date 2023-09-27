package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class dealPractice {

	public static void main(String[] args) {
		// car Array를
		String[] car = new String[] {"엑센트", "아반떼", "쏘나타", "그랜저"};
		// 정렬하고
		Arrays.sort(car);
		// 출력
		for(String s : car) {
			System.out.print(s + " ");
		}
		System.out.println();
		// car Array를 stream으로 바꾼 뒤
		Stream<String> s1 = Arrays.stream(car);
		// 정렬하고 출력
		s1.sorted().forEach(c -> System.out.print(c + " "));
		System.out.println();
		// char Array를
		char[] alphabet = new char[] {'a', 'c', 'd', 'e', 'j', 'o', 'z'};
		// 정렬하고
		Arrays.sort(alphabet);
		// 출력
		for (char c : alphabet) {
			System.out.print(c + " ");
		}
		System.out.println();
		// char Array를 stream으로...char는 stream이 제공되지 않아서 실패
		//Arrays.stream(alphabet);
		
		// ArrayList animal String을
		ArrayList<String> animal = new ArrayList<>();
		animal.add("goat");
		animal.add("tiger");
		animal.add("lion");
		animal.add("eagle");
		animal.add("whale");
		// 걍 출력
		for (String string : animal) {
			System.out.print(string + " ");
		}
		System.out.println();
		// ArrayList를 stream으로 바꾼 뒤
		Stream<String> list = animal.stream();
		// 정렬하고 출력
		list.sorted().forEach(a -> System.out.print(a + " "));
		
	}

}
