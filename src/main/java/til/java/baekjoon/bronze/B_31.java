package til.java.baekjoon.bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//기찍 N
public class B_31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            list.add(i+1);
        }

        Collections.sort(list,Collections.reverseOrder());

        for (int x : list) {
            System.out.println(x);
        }
    }
}
