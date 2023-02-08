package til.java.Programmers.lv_0;

import java.util.Arrays;

public class Lv0_2 {
    public static void main(String[] args) {
        String[] strlist = {"We","are","the","world!"};

        int[] arr = new int[strlist.length];

        int length = strlist.length;;
        for (int i = 0; i < length; i++) {
            arr[i] = strlist[i].length();

            System.out.println(arr[i]);
        }




    }
}
