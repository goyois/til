package til.java.baekjoon;

import java.util.Scanner;

public class B_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();  //총 금액
        int n = sc.nextInt();  //구매 물건 갯수

        int arr[] = new int[n]; //길이가 4인 배열 생성
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {  //갯수만큼 반복
            int a = sc.nextInt();  //가격
            int b = sc.nextInt();  //수량
            sum += a * b;
        }
        System.out.println(sum == x ? "Yes" : "No");
    }
}

