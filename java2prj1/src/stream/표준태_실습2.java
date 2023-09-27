package stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class 표준태_실습2 {
	public static void main(String[] args) {
		Customer c =new Customer();
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("감자", "vvip", 3001));
		list.add(new Customer("고구마", "vvip", 3501));
		list.add(new Customer("먹태", "bronze", 500));
		list.add(new Customer("옥수수", "vip", 2700));
		list.add(new Customer("새우", "vip", 2828));
		
		System.out.println("vvip 인원수 확인");
		long vvip=list.stream().filter( cus -> cus.getGrade().equals("vvip")).count();
		System.out.println(vvip);
		
		System.out.println("vip 인원 확인");
		list.stream().filter( cus -> cus.getGrade().equals("vip")).forEach(arr -> System.out.println(arr));
		
		System.out.println("포인트 순으로 정렬");
		list.stream().sorted((a, b) -> b.getPoint() - a.getPoint()).forEach(arr2 -> System.out.println(arr2)); 
	}
	
}
