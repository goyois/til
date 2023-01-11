package til.java.basic.array;

import java.util.Arrays;

public class DimensionOfArray2 {
    public static void main(String[] args) {
        /**
         * 반복문을 통한 배열 탐색
         */

        int[] scores = {1,1,1,1,1};



        //for문
        int sum1 = 0;  //합계를 담을 변수 sum1 선언
        for (int i = 0; i <scores.length ; i++) {  // i값이 배열의 길이(5)보다 작을때까지 반복
             sum1 += scores[i];  //반복되는동안 sum1 이라는 변수에 scores 배열의 원소가 하나씩 더하며 sum1에 누적됨! 1+2+3+4+5
        }
        System.out.println(sum1); // = 5


        //while문
        int sum2 = 0;  //합계를 담을 변수 sum2 선언
        int i = 0;  //이터레이터 변수 i 선언

        while (i < scores.length) {  //i값이 배열의 길이(5)보다 작을떄까지 반복
            sum2 += scores[i++];     //반복되는동안 sum2 라는 변수에 scores 배열의 원소가 하나씩 더해지며 sum2에 누적됨
        }
        System.out.println(sum2); // = 5


        //향상된 for문
        int sum3 = 0;  //합계를 담을 변수 sum3 선언

        for (int score : scores) {  //score라는 값에 scores 안에 있는 원소값을 순차적으로 담는다.
            sum3 += score;  //순차적으로 반복하며 넘어가는동안 score값은 받은만큼 1 씩 증가되어 누적됨
        }
        System.out.println(sum3); // = 5


        //for문을 통해 배열 값 수정하기
        for (int k = 0; k < scores.length; k++) {
            scores[k] = 0;
        }
        System.out.println(Arrays.toString(scores));

        //while을 사용하여 배열 값 1로 바꾸기
        int s = 0;
        while (s < scores.length) {
            scores[s++] = 1;
        }
        System.out.println(Arrays.toString(scores));


        //향상된 for문은 불가함 xxx
        for (int score1 : scores) {
            score1 = 2;
        }
        System.out.println(Arrays.toString(scores));

    }
}
