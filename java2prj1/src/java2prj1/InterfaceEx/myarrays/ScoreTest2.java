package java2prj1.InterfaceEx.myarrays;

import java.util.Arrays;

public class ScoreTest2 {
	public static void main(String[] args) {
		Score[] list = new Score[4];
		list[0] = new Score(100, 90);
		list[1] = new Score(80, 90);
		list[2] = new Score(30, 90);
		list[3] = new Score(70, 60);

		for (Score score : list) {
			System.out.println(score);
		}
		
		Arrays.sort(list);
		
		System.out.println("정렬 후");
		for(Score score : list) {
			System.out.println(score);
		}
	}
}
