package til.java.oop.chap_01.abstraction;

public class Pizza {  //그냥 상속이라는 기능만 사용한경우
    private String pizza;
    void pizza() {
    };
}

class Delivery extends Pizza {
    void pizza() {
        System.out.println("배달중입니다.");
    }
}

class PizzaHouse extends Pizza {

    void pizza() {
        System.out.println("5분전에 출발했습니다.");
    }
}

class Customer extends Pizza {
    void pizza() {
        System.out.println("피자 언제 오나요?");
    }
}

class News1 {
    public static void main(String[] args) {
        Customer c = new Customer();
        PizzaHouse p = new PizzaHouse();
        Delivery d = new Delivery();

        c.pizza();
        p.pizza();
        d.pizza();
    }
}


/**
 * 추상클래스에서는 추상 메서드를 선언하여 상속을 통해 자식 클래스에서 완성하도록 유도함
 *
 *
 */



//public abstract class Pizza {
//    private String pizza;
//    abstract void pizza();
//}
//
//class Delivery extends Pizza {
//
//    @Override
//    void pizza() {
//        System.out.println("배달중입니다.");
//    }
//}
//
//class PizzaHouse extends Pizza {
//    @Override
//    void pizza() {
//        System.out.println("5분전에 출발했습니다.");
//    }
//}
//
//class Customer extends Pizza {
//    @Override
//    void pizza() {
//        System.out.println("피자 언제 오나요?");
//    }
//}
//
//class News1 {
//    public static void main(String[] args) {
//        Customer c = new Customer();
//        PizzaHouse p = new PizzaHouse();
//        Delivery d = new Delivery();
//
//        c.pizza();
//        p.pizza();
//        d.pizza();
//    }
//}
///**
// * 추상클래스의 경우  상위클래스의 메소드를 사용해야함
// *
// */