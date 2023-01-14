package til.java.oop.chap.inheritance.sup;

public class SuperMethod2 {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

class Human {
    Human() {  //기본 생성자
        System.out.println("휴먼 클래스 생성자");
    }
}

class Student extends Human {
    Student() {  //기본 생성자
        super();  //상위 클래스 메서드  호출하며 반드시 맨윗줄에 있어야함
        System.out.println("학생 클래스 생성자");  //현재 자신의 메서드 호출
    }
}
//클래스를 만들 때는 자동으로 기본 생성자를 생성하는 습관을 들이는 것이 좋다
//why? -> super(),this()는 생성자 안에서만 사용가능하며 상위 클래스에 기본생성자가 없으면 에러가 발생