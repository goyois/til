package til.java.baekjoon;

import java.util.Scanner;

public class Baek_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min =  60 * a + b; // min에 시와 분을 더한 값을 60으로 곱해준다.
        min += c;  // min에 앞으로의 요리시간을 추가

        int hour = (min / 60) % 24;  //hour = 시간 총 합을 60으로 나누고 24로 나눈 뒤 나머지의 값을 할당
        int minute = min % 60;  //minute = 시간 총 합을 60으로 나눈 뒤 나머지의 값을 할당

        System.out.println(hour + " " + minute);
    }
}
