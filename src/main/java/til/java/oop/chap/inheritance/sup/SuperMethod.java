package til.java.oop.chap.inheritance.sup;

//super = 상위 클래스의 객체  , super() 상위클래스의 생성자를 호출
public class SuperMethod {
    public static void main(String[] args) {
        SubClass b = new SubClass();  //하위 클래스의 인스턴스를 생성
        b.callNum();  //SubClass의 b 객체를 통해 힙메모리영역에 있는 클래스멤버의 속한 메서드 callNum() 호출
    }
}

class SuperClass {
    int count = 20;  //super.count
}

class SubClass extends SuperClass {
    int count = 15;  //this.count


    void callNum() {
        System.out.println(count);  //15  일단 현재 메서드가 정의된 클래스의 count 값을 먼저 가져온다.
        System.out.println(this.count); //15  현재 메서드가 정의된 클래스의 객체를 호출함

        System.out.println(super.count);  //20  //현재 클래스(하위 클래스)가 아닌 상위 클래스 필드의 객체를 호출함
    }
}