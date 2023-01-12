package til.java.oop.chap_02;

public class StaticTest2 {
    public static void main(String[] args) {
        StaticIv iv1 = new StaticIv();
        StaticIv iv2 = new StaticIv();

        iv1.num1 = 100;
        iv2.num1 = 1000;

        System.out.println(iv1.num1);
        System.out.println(iv2.num1);

        iv1.num2 = 200;
        iv2.num2 = 2000;
        System.out.println(iv1.num2);
        System.out.println(iv2.num2);
    }
}

class StaticIv2 {
    int num1 = 10;
    static int num2 = 20;
}
