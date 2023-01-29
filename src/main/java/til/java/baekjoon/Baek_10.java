package til.java.baekjoon;

import java.util.Scanner;

public class Baek_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i <= a; i++) {  // 입력값보다 크거나 같을때까지의 조건으로 틀을 만든다.
            for (int j = 1; j <= a - i; j++) {  // a - i의 값만큼 공백 생성
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {  // 입력값보다 크거나 같을때까지 별 추가
                System.out.print("*");
            }
            System.out.println(); //다음 줄 개행
        }
    }
}
