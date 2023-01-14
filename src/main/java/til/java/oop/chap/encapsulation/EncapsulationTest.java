package til.java.oop.chap.encapsulation;

public class EncapsulationTest {
    private int a = 1;
    int b = 2;  //default
    protected int c = 3;
    public int d = 4;

    public void printEach() {  //같은 클래스안에서 호출하므로 전부 가능
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Test {
    public static void main(String[] args) {

        EncapsulationTest t = new EncapsulationTest();

        //System.out.println(t.a);  //private 접근자로 동일 클래스에서만 호출가능함
        System.out.println(t.b);  //default 로 같은 패키지안에 있으므로 가능 /다를 경우 불가
        System.out.println(t.c);  //protected 같은 패키지 + 하위 클래스내에 있으므로 가능 /다를 경우 불가
        System.out.println(t.d);  // public 제한없음



    }
}