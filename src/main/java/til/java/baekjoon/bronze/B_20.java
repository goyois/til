package til.java.baekjoon.bronze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B_20 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] a = new int[sc.nextInt()];
        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println(sum);

        Arrays.sort(a);


        int n = 10;

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < n; i+= 2) {


        }
    }
}
