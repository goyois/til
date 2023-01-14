package til.java.oop.chap.abstraction.interfaceEx.provider;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.callProvider(new Provider());
    }
}

class User {
    void callProvider(Cover cover) {  //매개변수의 다형성
        cover.call();

    }
}

class Provider implements Cover {

    @Override
    public void call() {
        System.out.println("하하");
    }
}

class Provider2 implements Cover {

    @Override
    public void call() {
        System.out.println("호호");
    }
}