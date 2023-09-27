package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class 태민_CustomerTest {

	public static void main(String[] args) {

		ArrayList<태민_Customer> c = new ArrayList<>();
		c.add(new 태민_Customer("aaaa", "john", "vip", 100000));
		c.add(new 태민_Customer("bbbb", "methew", "vvip", 150000));
		c.add(new 태민_Customer("cccc", "michael", "vip", 120000));
		c.add(new 태민_Customer("dddd", "mike", "vvip", 169423));
		c.add(new 태민_Customer("eeee", "sainz", "vvip", 178209));
		c.add(new 태민_Customer("ffff", "max", "vvip", 189612));
		c.add(new 태민_Customer("gggg", "jimmy", "vip", 112048));
		c.add(new 태민_Customer("hhhh", "jim", "silver", 48205));
		c.add(new 태민_Customer("iiii", "paul", "gold", 77777));
		c.add(new 태민_Customer("jjjj", "kathy", "vip", 130000));
		
		// 등급이 vvip인 사람 세기
		Stream<태민_Customer> clist1 = c.stream();
		long howmany = clist1.filter(vvv -> vvv.getGrade().equals("vvip")).count();
		System.out.println("등급 vvip 는 몇 명? " + howmany + "명");
		System.out.println();
		
		// 등급이 vip인 사람만 출력
		Stream<태민_Customer> clist2 = c.stream();
		clist2.filter(vlist -> vlist.getGrade().equals("vip")).forEach(v->System.out.println(v));
		System.out.println();
		
		// 포인트 높은 사람부터 출력
		Stream<태민_Customer> clist3 = c.stream();
		clist3.sorted((o1, o2) ->o2.getPoint()	- o1.getPoint()).forEach(p -> System.out.println(p));	
		}
}
