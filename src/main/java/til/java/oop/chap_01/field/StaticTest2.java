package til.java.oop.chap_01.field;

public class StaticTest2 {
    public static void main(String[] args) {
        StaticIv iv1 = new StaticIv();
        StaticIv iv2 = new StaticIv();

        iv1.num1 = 100;  //각각 다른 값을 할당하면 다르 값이 출력됨
        iv2.num1 = 1000;

        System.out.println(iv1.num1);
        System.out.println(iv2.num1);

        iv1.num2 = 200;  // 각각 변수의 값을 다르게 주더라도 공유되어 2000으로 나와버린다 static 의 고유 특성
        iv2.num2 = 2000;
        System.out.println(iv1.num2);
        System.out.println(iv2.num2);
    }
}

class StaticIv2 {
    int num1 = 10;
    static int num2 = 20;
}
