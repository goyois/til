package til.java.basic.control.control_1;

import java.util.Scanner;

public class ControlFlowStatementsV1 {
    public static void main(String[] args) {

        // if - 1
        /**
         * if (조건식1) {
         *  조건식1이 참이라면, 실행되는 블록입니다.
         *  }
         *  else if (조건식2) {
         *  조건식1이 참이 아니고 조건식2가 참일 떄, 실행
         *  }
         *  else {
         *  조건식1과 2가 모두 참이 아닐 때 최종적으로 실행
         *  else문은 생략도 가능함
         *  }
         */

        Scanner sc = new Scanner(System.in);

        String dice = sc.nextLine();

        if (dice.equals("1")) {
            System.out.println("1번");
        } else if (dice.equals("2")) {
            System.out.println("2번");
        } else if (dice.equals("3")) {
            System.out.println("3번");
        } else if (dice.equals("3")) {
            System.out.println("3번");
        } else {
            System.out.println("없는 숫자 " + dice);
        }
    }
}
