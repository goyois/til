package til.java.oop.chap_01.polymorphism;

public class ExampleTest {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.buyCoffee(new Americano());
        c.buyCoffee(new CaffeLatte());
        System.out.println("현재 잔액은" + c.money + "원 입니다.");

    }
}

class Coffee {
    int price;

    public Coffee(int price) {
        this.price = price;
    }
}

class Americano extends Coffee {
     public Americano() {
        super(4000);
    }
    public String toString() {
        return "아메리카노";
    };
};

class CaffeLatte extends Coffee {
     public CaffeLatte() {   // -> void를 사용할 수 없는 이유: 값을 반환하지않음, coffee클래스를 상솓받기때문에 메서드가 아닌 클래스여야하고,
                             // void caffelatte로 바꿔버리면 메소드가 되어버려서 구문 오류가 발생함
        super(5000);
    }
    public String toString() {
        return "카페라떼";
    };
};


class Customer {
    int money = 50000;

      void buyCoffee(Coffee coffee) {
        if (money < coffee.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price;
        System.out.println(coffee + "를 구입했습니다.");
    }
}
