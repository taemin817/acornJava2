package java2prj1.lamda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 선생님_람다실습 {

	public static void main(String[] args) {		 
		
		Runnable r =  ()-> System.out.println("람다식 시작");		
		//1.
		class A implements Runnable{
			@Override
			public void run() {
				System.out.println("람다식 시작"); 				
			}			
		}		
		A  a= new A();
		a.run();		
		
		//2.
		//Runnable rr  = new Runnable() {};
		Runnable rr  = new Runnable() {
			@Override
			public void run() {
				System.out.println("람다식 시작");				
			}};		
			
		rr.run();		
		////////////////////////////////////////////////////////
		Runnable r2 =  ()->  {
			String[] 할일= {
					"산책하기", "람다식연습2개" ,"매서드연습"
			};			
			System.out.println(  Arrays.toString(할일));
		};
		
		r.run();
		r2.run();
		/*
		 *  interface Consumer<T> {
		 *       void accept(T t);
		 *   }
		 */
		Consumer<Integer>   c  =   money  ->  {			
			int 소고기 =15000;
			int 떡 = 2000;
			money-=소고기;
			money-=떡;
			System.out.println( money);			
		} ;
				
		c.accept(30000);
		/*
		 *  interface Supplier<T> {
		 *      T get( );
		 *   }
		 */
		Supplier<String>  s =  () ->  {
			System.out.println("떡국을 끓인다");			
			return "떡국";			
		};
		String food =s.get();
		System.out.println(food);
		/*
		 *  interface Predicate<T> {
		 *      boolean test(T t );
		 *   }
		 */
		Predicate<String> p =  foodName  -> {
			if(foodName.equals("떡국")) {
				return  true;
			}
			return false;
		};
		
		boolean  result10 = p.test("떡국");
		boolean result11 = p.test("파스타");
		
		Function< Integer, int[]>   func=  num -> {
			// 금액  -> 화폐매수를 반환하는 함수 
			int[] qty= {5,3,1,5,3,5};
			return qty;
		};
		
		int[] resultA = func.apply(3000);
		System.out.println(  Arrays.toString(resultA));
	}

}
