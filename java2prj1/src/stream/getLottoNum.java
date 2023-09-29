package stream;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class getLottoNum {

	public static void main(String[] args) {

		HashSet<Integer> lottos = new HashSet<>();
		/*
		 - HashSet -
		 중복 요소 방지
		 순서 없음
		 빠른 검색 및 삽입: 해시 테이블을 사용하여 요소를 저장=> 검색 및 삽입 작업이 빠름
		 이러한 빠른 검색 및 삽입은 대용량 데이터 세트에서 유용
		 NULL 허용
		 */

		Random r = new Random();

		for (int i = 0; i < 20; i++) {
			lottos.add(r.nextInt(45) + 1);
		}
		System.out.println(lottos.size());

		Object[] lottosArray = lottos.toArray();		// 객체의 요소들을 배열로 변환
		Integer[] result = new Integer[6];

		System.arraycopy(lottosArray, 0, result, 0, 6);
		// lottosArray의 0번째부터 복사함. result의 0번째부터 6개를 붙여넣음
		System.out.println("로또 번호다!");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

		IntStream is = new Random().ints(1, 46);		// 1이상 46미만의 정수를 생성
					
		System.out.println("\n스트림으로 로또 생성");

		is.distinct().limit(6).sorted().forEach(number -> System.out.print(number + " "));
		// distinct : 중복요소 제거
	}

}
