package til.java.oop.chap_01.encapsulation;

public class GetSet {
    public static void main(String[] args) {
        Member m = new Member();
        m.setId(1);  //필드의 선언된 멤버변수에 값을 설정함
        m.setName("이경규");
        m.setAge(5);


        System.out.println(m.getId());  //값이 설정된 멤버변수를 가져옴
        System.out.println(m.getName());
        System.out.println(m.getAge());




    }
}

class Member {
    private String name;  //접근제어자를 private -> 변수의 은닉화를 통해 외부 접근 불가
    private int age;
    private int id;

    public String getName() {  //멤버변수의 값을 읽어오는 메서드
        return name;
    }

    public void setName(String name) {  //멤버변수의 값 변경하는 메서드
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

/**
 * 1. Member클래스를 기반으로 인스턴스를 생성한 뒤 같은 타입을 가지고 있는 참조변수 m에 담음
 * 2. m의 setter 메서드를 사용하여 데이터값을 설정한 뒤 getter메서드를 통해 데이터 값을 불러와 변수에 담았다.
 *
 */