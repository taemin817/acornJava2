package practice;

public class foodboxTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foodbox<Food> list = new Foodbox<>();
		Foodbox<Pasta> list2 = new Foodbox<>();
	//	Foodbox<water> list3 = new Foodbox<>();
		
		list.add( new Food("김치찌개"));
		list.add( new Food("된장찌개"));
		list.add( new Food("고추장찌개"));
		list.add( new Food("비지찌개"));
		list.add( new Food("부대찌개"));
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list2.add( new Pasta("알리오올리오"));
		
		
	}

}
