package stream;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class getLottoNum {

	public static void main(String[] args) {
		
		HashSet<Integer> lottos = new HashSet<>();
		Random r = new Random();
		
		for (int i = 0; i <20; i++) {
			lottos.add(r.nextInt(45)+1);
		}
		System.out.println(lottos.size());
		
		Object[] lottosArray = lottos.toArray();
		Integer[] result = new Integer[6];
		
		System.arraycopy(lottosArray, 0, result, 0, 6);
		
		System.out.println("로또 번호다!");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
		IntStream is = new Random().ints(1, 46);
		
		System.out.println("\n스트림으로 로또 생성");
		
		is.distinct().limit(6).sorted().forEach(number -> System.out.print(number + " "));
		
		
		
		
		
	}

}
