package til.java.Programmers;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        int n = 123;

        int result = 0;

        while (n > 0) {
            result += n % 10;  // 1. 123 % 10 = 3  sum3     2. 12 % 10 = 2  sum5      3. 1 % 10 = 1   sum6
            n /= 10;   // 1. 123 / 10 = 12       2. 12 / 10 = 1          3.  1 / 10 = 0; 종료
        }
        System.out.println(result);
    }
}

/**
 * 10의 자리로 나머지를 구하고 10으로 나누어서 1의 자리를 차례로 없애는 방법
 */
