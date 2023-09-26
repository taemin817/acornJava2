package java2prj1.InterfaceEx.myarrays;

public class ScoreTest {
	public static void main(String[] args) {
		Score[] list = new Score[4];
		list[0] = new Score(100, 90);
		list[1] = new Score(80, 90);
		list[2] = new Score(30, 90);
		list[3] = new Score(70, 60);

		for (Score score : list) {
			System.out.println(score);
		}

		for(int i = 0; i < list.length-1; i++) {
			for(int j=+1; j<list.length; j++) {
				if(list[i].kor > list[j].kor) {
					Score tmp;
					tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
					
			}
		}
		System.out.println("------------->");
		for(Score score: list) {
			System.out.println(score);
		}
	}
}
