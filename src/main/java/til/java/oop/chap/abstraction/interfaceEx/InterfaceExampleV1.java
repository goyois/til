package til.java.oop.chap.abstraction.interfaceEx;

public class InterfaceExampleV1 {
    public static void main(String[] args) {
        User user = new User();  //User 클래스 객체 생성
        user.callProvider(new Provider()); //Provider  객체를 생성 후에 매개변수로 전달하는 메서드 선언
    }

}

class User {  //Provider 객체를 매개변수로 받는 callProvider 메서드
    void callProvider(Provider provider) {
        provider.call();
    }
}

class Provider {  //출력문을 반환하는 call 이라는 메서드 선언
    void call() {
        System.out.println("무야호");
    }
}