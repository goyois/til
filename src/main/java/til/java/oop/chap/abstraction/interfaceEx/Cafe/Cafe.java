package til.java.oop.chap.abstraction.interfaceEx.Cafe;

public class Cafe {
    public static void main(String[] args) {
        CafeOwner cafeOwner =  new CafeOwner();
        CafeCustomerA a = new CafeCustomerA();
        CafeCustomerB b = new CafeCustomerB();

        cafeOwner.giveItem(a);
        cafeOwner.giveItem(b);
    }
}

class CafeCustomerA implements Customer {
    @Override
    public String getOrder() {
        return "콜드브루";
    }
}

class CafeCustomerB implements Customer {
    @Override
    public String getOrder() {
        return "딸기라떼";
    }
}

class CafeOwner {
    void giveItem(Customer customer) {
        System.out.println("주문하신 " + customer.getOrder() + " 나왔습니다.");
    }
}
