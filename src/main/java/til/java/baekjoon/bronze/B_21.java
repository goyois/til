package til.java.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;
//정수 순서대로 정렬
public class B_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            arr[i] = X;
        }
        Arrays.sort(arr);
        for (int q : arr){
            System.out.println(q);
        }
    }
}
