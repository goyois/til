package til.java.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class B_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int result = 0;

        for (int i = 0; i < 5; i++) {
            int N = sc.nextInt();
            arr[i] += N;
            result += N;  //평균구하기
        }
        System.out.println(result / 5);
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}
