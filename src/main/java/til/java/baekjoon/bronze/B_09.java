package til.java.baekjoon.bronze;

import java.util.Scanner;

public class B_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result = "";

        for (int i = 1; i <= a; i++) {
            result += "*";

            System.out.print(result + "\n");
        }
    }
}
