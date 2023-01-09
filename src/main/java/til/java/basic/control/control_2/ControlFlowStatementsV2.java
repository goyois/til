package til.java.basic.control.control_2;

public class ControlFlowStatementsV2 {
    public static void main(String[] args) {


        /**
         * break & continue문
         */


        //break
        Outer : for (int i = 3; i < 10; i++) {  //안쪽 중첩 for문의 조건이 만족할때까지 값은 그대로임
            for (int j = 5; j > 0; j--) {  //지속적으로 차감되고 다음 순회되는 j값이 0이 될경우 다시 5부터 시작
                System.out.println("i " + i + " j " + j);
                if (i == 5) {  //i 값이 5일 경우 break문을 토앻 Outer로 빠져나올 수 있음
                    break Outer;
                }
            }
        }

        //continue
        /**
         * continue문은 반복문을 종료하지 않고 다음 차례로 넘어가 계속 반복을 수행함.
         */

        for (int k = 0; k < 10; k++) {
            if (k % 2 == 0) {  //한번 순회할 떄 나머지 값이 0이라면
                continue;  //다음 반복으로 넘어감
            }
            System.out.println(k);  //짝수는 제외되고 홀수만 출력됨
        }

    }
}
