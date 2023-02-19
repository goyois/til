package til.java.Programmers.lv_1;

import java.util.Arrays;
import java.util.Collections;
//정수 내림차순으로 배치하기
public class Lv1_05 {
    public static void main(String[] args) {
        long n = 118372;

        String result = "";

        String str = Long.toString(n);
        String[] arr = str.split("");

        Integer[] newArr = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(newArr, Collections.reverseOrder());

        for (int i = 0; i < newArr.length; i++) {
            result += newArr[i];
        }

        System.out.println(Long.parseLong(result));
    }
}
