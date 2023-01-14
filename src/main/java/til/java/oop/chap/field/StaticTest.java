package til.java.oop.chap.field;

public class StaticTest {
    public static void main(String[] args) {
        StaticIv iv = new StaticIv();  //인스턴스를 만들어야만 값을 가져올 수 있는 iv 변수
        System.out.println(iv.num1);
        System.out.println(StaticIv.num2);

    }
}

class StaticIv {
    int num1 = 10;
    static int num2 = 20;  // static 으로 생성 시 값이 다른 클래스와 공유되므로 타 클래스에서 인스턴스를 만들어서 값을 가져올 필요가 없음
}