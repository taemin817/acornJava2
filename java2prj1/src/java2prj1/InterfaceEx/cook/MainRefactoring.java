package java2prj1.InterfaceEx.cook;

import java.util.ArrayList;

public class MainRefactoring {

    public static void main(String[] args) {
        ArrayList<Cook> list = prepareCookList();
        ArrayList<한식가능한> 한식요리사 = new ArrayList<>();
        ArrayList<중식가능한> 중식요리사 = new ArrayList<>();
        ArrayList<양식가능한> 양식요리사 = new ArrayList<>();

        categorizeCooks(list, 한식요리사, 중식요리사, 양식요리사);

        System.out.println("--한식 요리사 입니다--");
        printCooks(한식요리사);

        System.out.println("--중식 요리사 입니다--");
        printCooks(중식요리사);

        System.out.println("--양식 요리사 입니다--");
        printCooks(양식요리사);

        int random = getRandomNumber(3);

        String selectedKind = getSelectedKind(random);
        System.out.println("==========>선택된 요리사 kind  ====>" + selectedKind);

        Cook finalCook = selectFinalCook(selectedKind, 한식요리사, 중식요리사, 양식요리사);

        System.out.println("====>최종선발 3 초후 공개");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(finalCook);
    }

    private static ArrayList<Cook> prepareCookList() {
        ArrayList<Cook> list = new ArrayList<>();
        list.add(new ArraylistEx김민규("김민규"));
        list.add(new ChineseCook("chineseCook"));
        // 나머지 요리사 객체들 추가
        return list;
    }

    private static void categorizeCooks(ArrayList<Cook> list, ArrayList<한식가능한> 한식요리사,
            ArrayList<중식가능한> 중식요리사, ArrayList<양식가능한> 양식요리사) {
        for (Cook cook : list) {
            if (cook instanceof 한식가능한) {
                한식요리사.add((한식가능한) cook);
            } else if (cook instanceof 중식가능한) {
                중식요리사.add((중식가능한) cook);
            } else if (cook instanceof 양식가능한) {
                양식요리사.add((양식가능한) cook);
            }
        }
    }

    private static void printCooks(ArrayList<? extends Cook> cooks) {
        for (Cook cook : cooks) {
            System.out.println(cook);
        }
    }

    private static int getRandomNumber(int max) {
        return (int) (Math.random() * max);
    }

    private static String getSelectedKind(int random) {
        String[] kinds = { "한식가능한", "중식가능한", "양식가능한" };
        return kinds[random];
    }

    private static Cook selectFinalCook(String selectedKind, ArrayList<한식가능한> 한식요리사,
            ArrayList<중식가능한> 중식요리사, ArrayList<양식가능한> 양식요리사) {
        int randomRange = 0;
        int finalOne;
        Cook fianlCook = null;

        switch (selectedKind) {
            case "한식가능한":
                printCooks(한식요리사);
                randomRange = 한식요리사.size();
                finalOne = getRandomNumber(randomRange);
                fianlCook = 한식요리사.get(finalOne);
                break;

            case "중식가능한":
                printCooks(중식요리사);
                randomRange = 중식요리사.size();
                finalOne = getRandomNumber(randomRange);
                fianlCook = 중식요리사.get(finalOne);
                break;

            case "양식가능한":
                printCooks(양식요리사);
                randomRange = 양식요리사.size();
                finalOne = getRandomNumber(randomRange);
                fianlCook = 양식요리사.get(finalOne);
                break;
        }

        return fianlCook;
    }
}
