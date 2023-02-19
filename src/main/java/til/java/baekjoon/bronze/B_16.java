package til.java.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class B_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt()};

        int count = 0;                                                          //배열 체크 횟수
        int max = 0;                                                            //가장 큰 값 초기화
        int index = 0;                                                          //인덱스 값 초기화

        for (int value : arr) {                                                 //value 안에 arr의 원소를 넣어준다
            count++;                                                            //체크하는 배열 값 1씩 증가
            System.out.println(count);

                                                                                //33 2 13 42 89 90 12 94 77 입력된 경우
            if (value > max) {                                                  //만약 arr에서 추출된 값이 0보다 크다면
                System.out.println("value: "+ value + "max: " + max  );
                max = value;                                                     //max에 그 가장 큰 값을 넣어주고 0 -> 33 -> 42 -> 89 -> 94
                System.out.println("max: "+ max + "value: " + value );
                index = count;                                                   //index에 반복 횟수를 넣어준다
                System.out.println("index: " + index + "count: " + count);
            }
        }
            System.out.print(max + "\n" + index);
    }
}
