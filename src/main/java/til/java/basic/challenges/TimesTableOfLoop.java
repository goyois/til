package til.java.basic.challenges;

public class TimesTableOfLoop {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단입니다.");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
