package til.java.baekjoon;

import java.util.Scanner;

public class Baek_09 {
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
