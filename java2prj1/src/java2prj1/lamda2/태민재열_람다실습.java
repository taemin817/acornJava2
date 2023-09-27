package java2prj1.lamda2;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class 태민재열_람다실습 {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bc = (mineral, gas) -> {
			System.out.println("벌처는 미네랄을 " + mineral + ", 가스를 " + gas + "만큼 소비한다");
		};

		bc.accept(75, 0);

		BiFunction<Integer, Integer, String> bf3 = (bf1, bf2) -> {

			if (bf1 == 75 && bf2 == 0) {
				return "벌처";
			} else
				return "크리처";
		};

		String result2 = bf3.apply(20, 20);

		System.out.println(result2);

		BiPredicate<String, String> bp3 = (bp1, bp2) -> {
			if (bp1 == bp2) {
				return true;
			}
			return false;
		};
		boolean result3 = bp3.test("aaa", "bbb");

		System.out.println(result3);

	}

}
