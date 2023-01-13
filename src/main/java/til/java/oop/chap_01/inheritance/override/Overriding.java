package til.java.oop.chap_01.inheritance.override;

//상위 클래스로부터 상속받은 메서드와 동일한 이름의 메서드를 재정의하는 것
//상위 클래스에 정의된 메서드를 하위 클래스에서 메서드의 동작을 하위 클래스에 맞게 변경하고자 할 때 사용함

/**
 * 1. 메서드의 선언부(메서드_이름,매개변수,반환타입)이 상위클래스의 그것과 완전히 일치해야한다.
 * 2. 접근 제어자의 범위가 상위 클래스의 메서드보다 같거나 넓어야한다.
 * 3. 예외는 상위 클래스의 메서드보다 많이 선언할 수 없다.
 */
public class Overriding {
    public static void main(String[] args) {
        User u = new User();
        Meet m = new Meet();
        Name n = new Name();
        Job j = new Job();

        u.hi();
        m.hi();
        n.hi();
        j.hi();


    }
}

class User {
    void hi() {
        System.out.println("안녕하세요.반갑습니다!");
    }
}
class Meet extends User{
    void hi() {
        System.out.println("처음 뵙습니다.");
    }
}
class Name extends User{
    void hi() {
        System.out.println("제 이름은 강호동이고 ");
    }
}
class Job extends User{
    void hi() {
        System.out.println("저의 직업은 서버개발자입니다.");
    }
}
