package til.java.basic.challenges;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요.");
        String inputValue1 = sc.nextLine();

        System.out.println("연산자를 입력하세요.");
        String op = sc.nextLine();

        System.out.println("두번째 숫자를 입력하세요.");
        String inputValue2 = sc.nextLine();

        int num1 = Integer.parseInt(inputValue1);
        int num2 = Integer.parseInt(inputValue2);
        int num3 = 0;

        if (op.equals("+")) {
            num3 = num1 + num2;
        } else if (op.equals("-")) {
            num3 = num1 - num2;
        } else if (op.equals("*")) {
            num3 = num1 * num2;
        } else if (op.equals("/")) {
            num3 = num1 / num2;
        } else if (op.equals("%")) {
            num3 = num1 % num2;
        } else {
            System.out.println("입력값을 확인해주세요");
        }
        System.out.println(inputValue1 + op + inputValue2 + "=" + num3);

    }
}
