package til.java.baekjoon.bronze;

import java.util.Scanner;

//N 찍기
public class B_30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = i+1;
        }

        for (int x : arr) {
            System.out.println(x);
        }
    }
}
