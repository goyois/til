package til.java.baekjoon.bronze;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B_27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str," ");
        System.out.println(st.countTokens());
    }
}
