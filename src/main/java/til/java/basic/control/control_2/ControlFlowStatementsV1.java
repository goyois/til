package til.java.basic.control.control_2;

public class ControlFlowStatementsV1 {
    public static void main(String[] args) {

        /**
         * for문: 반목횟수를 알고 있을 떄
         * while문 : 조건에 따라 반복시킬 때
         */

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;  // += -> 순회하는 과정에서의 총 합계
        }
        System.out.println(sum);



        //향상된 for문
        String[] names = {"김주원", "김짱구", "김맹구", "김훈"};
        for (String name : names) {   //   names 배열에 할당된 값들을 순차적으로 name 변수에 넣어줌
            System.out.println(name + "님은 복습중입니다.");  //차례로 순회하며 실행한 뒤 종료
        }

        //while문
        int i = 0;  //변수 초기화
        int sum1 = 0;  //변수 초기화
        while (i <= 3) {  //변수 i 가 10보다 작을때까지, 3과 같다면 종료되는 조건
            sum1 += i;  // sum1이라는 변수는 i가 위의 조건에 따라 반복되는 동안 계속 더해짐 0(초기화) -> 1(0 +1) -> 3(1 +2) -> 3(3 +3)
            i++;  //(+1)
        }
        System.out.println(sum1);  //총합 6 출력

        //do while문
    }
}
