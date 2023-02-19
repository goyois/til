package til.java.baekjoon.bronze;

import java.util.Scanner;

public class B_32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String s = sc.next();

        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += s.charAt(i) - '0'; //charAt()은 해당 문자의 아스키코드값을 반환하므로 숫자그대로일경우 -48 0 선언
        }
        System.out.println(sum);
    }
}
