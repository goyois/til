package til.java.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list =  new ArrayList<Integer>();

        for (int i = 0; i < 1; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int q : list){
            System.out.println(q);
        }
    }
}
