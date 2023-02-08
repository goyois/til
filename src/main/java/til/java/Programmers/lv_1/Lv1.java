package til.java.Programmers.lv_1;

import java.util.Arrays;

public class Lv1 {
    public static void main(String[] args) {
        // 원본 배열
        int[] arr = { 1,2,3,4,5 };

        // 거꾸로 배열
        int[] reverseArr = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr[i];
        }

        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("reverseArr : " + Arrays.toString(reverseArr));
    }
}

