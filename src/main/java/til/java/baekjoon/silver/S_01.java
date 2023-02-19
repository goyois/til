package til.java.baekjoon.silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//배열 원소 오름차순 순차 정렬
public class S_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder stringBuilder = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for (int q : list){
            stringBuilder.append(q).append('\n');
        }
        System.out.println(stringBuilder);

    }
}
