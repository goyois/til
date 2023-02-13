package til.java.Programmers.lv_0;

import java.util.Arrays;

public class Lv0_3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;

        int[] arr = Arrays.copyOfRange(numbers,num1, num2 + 1);  //arr , from , to  (to값은 포함되지않으므로 +1)

        for (int x : arr){
            System.out.println(x);
        }
    }
}
