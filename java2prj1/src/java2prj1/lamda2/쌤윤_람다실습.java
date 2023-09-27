package java2prj1.lamda2;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class 쌤윤_람다실습 {

	public static void main(String[] args) {
	
		ArrayList<String > list  = new ArrayList<>();
		
		list.add("one");
		list.add("one");
		list.add("one");
		
		list.forEach( b -> System.out.println(b +"어머"));
		
		
		
	   // 함수 입력 한 개  -> 반환이 있는 거 
	  // 이윤  ->  이윤 로또 당첨 
		
		Function<String, String > f  =   lotte ->    lotte + "로또 당첨^^^^^" ;		
		Function<String, String > f2  =  lotte ->   {return  lotte +"로또 당첨" ; };
		 
		String result  =f.apply("이윤");
		System.out.println( result);
		
		String result2  =f.apply("우주연");
		System.out.println( result2);
		
		// BiConsumer<T,U>  :  두 개 매개변수
		// 강남, 빌딩
		BiConsumer<String, String> bc  =  ( 지역,건물) -> {			
			System.out.println( "내가 살고 싶은 곳==>" + 지역);
			System.out.println( "내가 사고 싶은 것===>" + 건물);			
		};
		
		
		bc.accept("강남", "빌딩");
		
		
		BiConsumer<String , Integer> bc2= ( 문자, 반복횟수) ->{
			
			 for( int i=1; i<=반복횟수; i++) {
				 
				 System.out.println( 문자);
			 }
		}; 
		
		bc2.accept("＆", 10);
		

		
		// BiPredicate<T,U>    :  두 개 매개변수 하나의 boolean 형 반환
		
		//
		BiPredicate<String, ArrayList<String>>  bip  = ( 찾고싶은상품 , 상품목록) ->{
			
			
			for( String item : 상품목록) {
				if( item.equals(찾고싶은상품)) {
					return true;
				}				
			}
			return false;
		};
		
		
		ArrayList<String> shopList = new ArrayList<>();
		shopList.add("금10돈");
		shopList.add("샤넬 백");
		shopList.add("강남 집문서");		
		
		
		boolean results=   bip.test("빌딩", shopList);
		System.out.println( results);
	}

}
