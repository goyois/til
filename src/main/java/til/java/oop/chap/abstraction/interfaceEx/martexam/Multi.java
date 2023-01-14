package til.java.oop.chap.abstraction.interfaceEx.martexam;

public class Multi extends Item implements Mart,Customer{ //멀티 클래스는 아이템클래스를 상속받고 마트 커스토머의 인터페이스의 구현클래스역할도 함
    public static void main(String[] args) {
    Item i = new Item();
    i.sell();
    i.buy();

    }
}
