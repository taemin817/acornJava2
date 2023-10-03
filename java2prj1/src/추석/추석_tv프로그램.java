package 추석;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 추석_tv프로그램 {

	public static void main(String[] args) {

		ArrayList<TvProgram> list = new ArrayList<>();
		list.add(new TvProgram(22, 5, "KBS1", "타이타닉"));
		list.add(new TvProgram(20, 33, "EBS", "다큐3일"));
		list.add(new TvProgram(18, 2, "Mnet", "엠카"));
		list.add(new TvProgram(16, 7, "SBS", "인기가요"));
		list.add(new TvProgram(12, 4, "KBS2", "전국노래자랑"));

//		list.stream().forEach(str->System.out.println(str));

		// 일정 관리 프로그램

		Scanner sc = new Scanner(System.in);
		int menu;
		loop: while (true) {
			System.out.print("메뉴 선택 : 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료");
			String menu_ = sc.nextLine();
			menu = Integer.parseInt(menu_);

			switch (menu) {
			case 1:
				System.out.println("프로그램 시작시간을 입력하세요");
				String time_ = sc.nextLine();
				int time = Integer.parseInt(time_);
				System.out.println("채널번호를 입력하세요");
				String channelNum_ = sc.nextLine();
				int channelNum = Integer.parseInt(channelNum_);
				System.out.println("채널명을 입력하세요");
				String channulNm = sc.nextLine();
				System.out.println("프로그램 제목을 입력하세요");
				String subject = sc.nextLine();

				list.add(new TvProgram(time, channelNum, channulNm, subject));
				System.out.println("등록 완료");
				break;

			case 2:
				System.out.println("프로그램 전체를 시간순으로 조회합니다");
				Collections.sort(list, Comparator.comparing(TvProgram::getTime));
				for (TvProgram program : list) {
					System.out.println(program);
				}
				break;

			case 3:
				System.out.println("변경할 프로그램 순번을 입력하세요");
				String i_ = sc.nextLine();
				int i = Integer.parseInt(i_);
				System.out.println(list.get(i));

				if (i >= 0 && i < list.size()) {
					System.out.println("프로그램 시작시간을 입력하세요");
					String ctime_ = sc.nextLine();
					int Newtime = Integer.parseInt(ctime_);
					System.out.println("채널번호를 입력하세요");
					String cchannelNum_ = sc.nextLine();
					int NewchannelNum = Integer.parseInt(cchannelNum_);
					System.out.println("채널명을 입력하세요");
					String NewchannulNm = sc.nextLine();
					System.out.println("프로그램 제목을 입력하세요");
					String Newsubject = sc.nextLine();
					list.set(i, new TvProgram(Newtime, NewchannelNum, NewchannulNm, Newsubject));
					System.out.println("프로그램이 변경되었습니다.");
				} else {
					System.out.println("잘못된 입력입니다.");
				}
				break;

			case 4:
				System.out.print("삭제할 프로그램 순번(0부터 시작)을 입력하세요");
				String indexRm_ = sc.nextLine();
				int indexRm = Integer.parseInt(indexRm_);
				if (indexRm >= 0 && indexRm < list.size()) {
					list.remove(indexRm);
					System.out.println("프로그램이 삭제되었습니다.");
				} else {
					System.out.println("잘못된 입력입니다.");
				}
				break;

			case 5:
				System.out.println("종료");
				break loop;

			default:
				System.out.println("잘못된 입력입니다");
			}
		} // while의 끝
		System.out.println("bye");
	}

}
