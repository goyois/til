package til.java.oop.chap_01.polymorphism;

//한 타입의 참조변수를 통해 여러 타입의 객체를 참조할 수 있도록 만든 것
//상위 클래스 타입의 참조변수를 통해서 하위 클래스의 객체를 참조할 수 있도록 허용한 것
//객체 타입을 상위클래스로 잡은 뒤 상위클래스의 멤버 수만큼 사용가능한 멤버 수를 조정하는 것  - > 반대로 하위 클래스객체 타입으로 상위 클래스의 참조변수타입을 지정할 순 없음

class Friend {
    public void friendInfo() {
        System.out.println("나는 당신의 친구입니다.");
    }
}

class GirlFriend extends Friend {
    public void friendInfo() {
        System.out.println("나는 니 여자친구야");
    }
}

class BestFriend extends Friend {
    public void friendInfo() {
        System.out.println("나는 너의 가장 친한 친구야");
    }
}

public class FriendTest {
    public static void main(String[] args) {
        Friend f = new Friend();  //객체타입 : friend 참조변수타입 : friend  일치 ,이전에 썻던 방법
        BestFriend b = new BestFriend(); //동일함
        Friend g1 = new GirlFriend(); // 객체타입 : GirlFriend 참조변수타입 : Friend 불일치하지만 다형성으로 인해 상위 클래스의 객체타입을 지정하고 멤버의 수를 가지게되고
                                      // 상위클래스의 멤버의 수를 사용할 수 있음

        f.friendInfo();  //각 클래스의 인스턴스를 통헤 친구의 정보 호출
        b.friendInfo();
        g1.friendInfo();
    }
}
