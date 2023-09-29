package java2prj1.InterfaceEx.myarrays;

public class ScoreTest2 {
	public static void main(String[] args) {
		Score[] list = new Score[4];
		list[0] = new Score(100, 90);
		list[1] = new Score(80, 95);
		list[2] = new Score(30, 80);
		list[3] = new Score(70, 60);

		for (Score score : list) {
			System.out.println(score);
		}
		
		MyArrays.sort(list);
		
		System.out.println("정렬 후");
		for(Score score : list) {
			System.out.println(score);
		}
	}
}
