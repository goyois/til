package til.java.basic.control.control_1;

import java.util.Scanner;

public class ControlFlowStatementV2 {
    public static void main(String[] args) {
        /**
         * if - 2
         * Switch : 변수가 어떤 값을 갖는지에 따라 실행문을 선택할 수 있음
         * 경우의 수가 많아질수록 기본 if문은 코드가 더러워지지만 switch로 변수값에 따라서 실행시키면 비교적 간결해짐
         * switch문은 int,char,String 타입의 변수도 올 수 있음
         */


        Scanner sc = new Scanner(System.in);
        String dice = sc.nextLine();

        switch (dice) {
            case "김주원":
                System.out.println("700만원.");
                break; //다음 case를 실행하지않고 종료

            case "Junior" :
            case "Manager" :
                System.out.println("500만원");
                break;

            case "3":
                System.out.println("3번");
                break;

            default:      // switch문의 괄호 안 값과 같은 값이 없으면, 여기서 끝
                System.out.println("300만원");
                break;
        }
    }
}
