package til.java.Programmers.lv_0;

import java.util.Collections;

public class Lv0_5 {
    public static void main(String[] args) {

        long n = 12345;

        String s = "" + n;
        int[] arr = new int[s.length()];

        int count = 0;

        while (n > 0) {
            arr[count] = (int) (n % 10);
            n /= 10;
            count++;
        }
        for (int x : arr) {
            System.out.println(arr);
        }
    }
}
