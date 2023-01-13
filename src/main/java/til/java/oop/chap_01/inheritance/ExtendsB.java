package til.java.oop.chap_01.inheritance;

public class ExtendsB extends ExtendsA{
    String companyName;

    void coding() {
        System.out.println("코딩을 합니다.");
    };
}

class Dancer extends ExtendsA {
    String groupName;

    void dancing() {
        System.out.println("춤을 춘다");
    };
}

class Singer extends ExtendsA {
    String bandName;

    void singing() {
        System.out.println("노래합니다.");
    };
}

/**
 * 클래스를 상속할경우 부모클래스의 메서드 및 객체를 가져와 재사용성이 높아짐
 */


class Out {
    public static void main(String[] args) {
        ExtendsA a = new ExtendsA();
        a.name = "유재석";
        a.age = 11;
        a.learn();
        a.walk();
        System.out.println(a.name);

        Dancer d = new Dancer();
        d.groupName = "무한도전";
        d.name = "정향돈";
        d.age = 10;
        d.learn();
        d.walk();
        d.dancing();
        System.out.println(d.name);
        System.out.println(d.age);

        Singer s = new Singer();
        s.bandName = "방탄소년단";
        s.name = "진";
        s.age = 19;
        s.singing();
        s.learn();
        System.out.println(s.bandName);


    }
}