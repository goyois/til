package til.java.baekjoon.bronze;

import java.util.Scanner;

public class B_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int X = sc.nextInt();
        int arr[] = new int[A];
        int result = 0;

        for (int i = 0; i < A; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < A; j++) {
            if (arr[j] < X) {
                result = arr[j];
                System.out.println(result);
            }
        }
    }
}
