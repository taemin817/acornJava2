package stream;

import java.util.stream.IntStream;

public class Stream {

	public static void main(String[] args) {

		IntStream is = IntStream.range(1, 10);
											// 범위가 1이상 10미만
		is.skip(3).limit(5).forEach(num -> System.out.println(num));
		// skip: 3개를 건너뜀 => 1 2 3 을 건너뛰고 4부터 나옴
		// limit: 최대 5개까지 => 4 5 6 7 8 (5개)
		
		
		// 중복 제거
		IntStream is2 = IntStream.of(1, 2, 2, 4, 5, 3, 3, 3, 6, 7);		// 1, 2, 2, 4, 5, 3, 3, 3, 6, 7 이런 스트림을 생성
		is2.distinct().forEach(num -> System.out.print(num + " "));		// 중복제거 후 출력
		
		// filter로 조건에 맞는 것만 검색
		System.out.println("\n1이상 10미만 중 짝수만");
		IntStream is3 = IntStream.range(1, 10);
		is3.filter(i -> i%2 == 0).forEach(num -> System.out.print(num + " "));
		
	}

}
