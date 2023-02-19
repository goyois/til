package til.java.baekjoon.bronze;

import java.util.Scanner;

public class B_26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fib(N));
    }

    static int fib(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fib(N-1) + fib(N-2);
    }
}
