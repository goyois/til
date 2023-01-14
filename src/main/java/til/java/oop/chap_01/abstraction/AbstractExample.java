package til.java.oop.chap_01.abstraction;

/**
 * 추상클래스는 상속관계일 때 새로운 클래스를 작성하는데 매우 유용합니다.
 * Why -> 메서드의 내용이 상속을 받는 클래스에 따라서 종종 달라지기때문에 상위클래스에서는 선언부만 작성,실제 구체적 내용은 하위 클래스에서 구현한다면 좀 더 유연한 설계임
 */
public abstract class AbstractExample {  //추상 메서드가 최소 하나 이상 포함돼있는 추상클래스
    abstract void run();  //메서드 바디가 없는 추상메서드


}

class Child {
    public static void run() {
        System.out.println("멍멍");
    }
}

class run {
    public static void main(String[] args) {
        Child.run();
    }
}