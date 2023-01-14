package til.java.oop.chap_01.challenges;

import lombok.Setter;

import java.util.Scanner;

public class GameV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("[안내] TRPG 스타크래프트를 시작합니다.");
        System.out.println("[안내] 자신의 유닛 정보를 입력해주세요.");

        System.out.println("[시스템] 유닛 [이름]을 입력해주세요 : ex 레이스");
        String race = scanner.nextLine();
        System.out.println("[시스템] 유닛 [공격력]을 입력해주세요 : ex 50");
        int force = scanner.nextInt();
        System.out.println("[시스템] 유닛 [방어력]을 입력해주세요 : ex 1");
        int guard = scanner.nextInt();
        System.out.println("[시스템] 유닛 [체력]을 입력해주세요: ex 100");
        int health = scanner.nextInt();

        System.out.println();
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.println("[안내] 레이스 유닛이 게임에 참여했습니다.");
        System.out.println("[공격력] : 50");
        System.out.println("[방어력] : 1");
        System.out.println("[체력] : 100");

        System.out.println("==============================================");
        System.out.println("[시스템] 유닛 [이름]을 입력해주세요 : ex 히드라");
        String hydra = scanner.nextLine();
        System.out.println("[시스템] 유닛 [공격력]을 입력해주세요 : ex 50");
        int force1 = scanner.nextInt();
        System.out.println("[시스템] 유닛 [방어력]을 입력해주세요 : ex 1");
        int guard1 = scanner.nextInt();
        System.out.println("[시스템] 유닛 [체력]을 입력해주세요: ex 100");
        int health1 = scanner.nextInt();

        System.out.println();
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.println("[안내] 히드라 유닛이 게임에 참여했습니다.");
        System.out.println("[공격력] : 50");
        System.out.println("[방어력] : 1");
        System.out.println("[체력] : 100");
        System.out.println("==============================================");
        System.out.println("----------------------------------------------");







    }
}
