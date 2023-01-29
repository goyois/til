package til.java.basic.challenges;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.close();

        for (int i = num; i <= num; i++) {
            System.out.println(num + "단 입니다.");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j );
            }
        }
    }
}
