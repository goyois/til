package til.java.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class S_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int prev = 0;
        int sum = 0;

        for (int j = 0; j < N; j++) {
            sum += prev + arr[j];

            prev += arr[j];
        }
        System.out.println(sum);
    }
}


//3 1 4 3 2
//3+4+8+11+13 = 39

//1 2 3 3 4
//1+3+6+9+13 = 30