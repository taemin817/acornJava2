package java2prj1.lamda2;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		
		Runnable r  = () -> System.out.println("람다식 시작");
		
		class A implements Runnable{
			@Override
			public void run() {
				System.out.println("람다식 시작2");
			}
		}
		
		A a = new A();
		a.run();
		
		
		Runnable rr = new Runnable() {
			@Override
			public void run() {
				System.out.println("람다식 시작3");
			}
		};
		rr.run();
		
		Runnable r2 = () -> {
			String[] 할일 = {
					"산책", "밥먹기", "잠자기"
			};
			 System.out.println(Arrays.toString(할일));
		};

		r.run();
		r2.run();
		
		
		Consumer<Integer> c = money -> {
			int 쇠고기 = 16000;
			int 떡 = 2000;
			money-=쇠고기;
			money-=떡;
			System.out.println(money);
		};
		c.accept(30000);
		
		Supplier<String> s = () -> {
			System.out.println("떡국을 끓인다");
				 return "떡국";
		};
		String food = s.get();
		System.out.println(food);
		
		Predicate<String> p = foodName -> {
			if(foodName.equals("떡국")) {
				return true;
			}
			return false;
		};
		boolean result0 = p.test("떡국");
		boolean result1 = p.test("떡국");
		
		Function<Integer, int[]> func = num -> {
				int[] qty = {1,3,2,4,5, 2};
				return qty;
		};
		
		int[] result2 = func.apply(3000);
		System.out.println(Arrays.toString(result2));
		
	}

}
