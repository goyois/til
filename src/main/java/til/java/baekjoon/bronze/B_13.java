package til.java.baekjoon.bronze;


import java.util.Scanner;

public class B_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();

        for (int j = 0; j < N; j++) {
            if (num == arr[j]) {
                count++;
            }
        }
            System.out.println(count);
    }
}

