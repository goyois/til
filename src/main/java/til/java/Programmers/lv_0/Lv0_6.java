package til.java.Programmers.lv_0;

import java.util.Arrays;

public class Lv0_6 {
    public static void main(String[] args) {

        int[] sides = {2,3,4};
        Arrays.sort(sides);

        if (sides[0] + sides[1] > sides[2]) {
            System.out.println("1");
            } else
            System.out.println("2");
    }
}
