package til.java.oop.chap_01.encapsulation;

public class EncapsulationTest2 extends EncapsulationTest{
    public void printEach() {
//        System.out.println(a);  //private
//        System.out.println(b);  //default
        System.out.println(c);  //protected 접근자로 같은 패키지의 하위 클래스 가능
        System.out.println(d); // 접근제한 없음

    }
}

class Test2 {
    public static void main(String[] args) {
        EncapsulationTest t = new EncapsulationTest();

        //System.out.println(t.a);  //private으로 불가
        System.out.println(t.b);  //default
        System.out.println(t.c);  //protected 접근자로 같은 패키지의 하위 클래스 가능
        System.out.println(t.d); //접근제한없음

    }
}