package til.java.oop.chap.abstraction.interfaceEx.martexam;

public class Item implements Mart,Customer{   //인터페이스 마트의 구현클래스 아이템
                                     // 구현한다 = 인터페이스가 가진 모든 메서드를 구현체클래스에 오버라이딩하여 바디를 완성한// 여러개의 인터페이스를 구현할 수 있음
    public String melon;

    @Override  //메서드 오버라이딩 후 바디 완성
    public void sell() {
        System.out.println("melon 을 판매합니다.");
    }

    @Override  //메서드 오버라이딩 후 바디 완성
    public void buy() {
        System.out.println("구매할게요 계산해주세요.");
    }
}

class Counter {
    public static void main(String[] args) {
        Item i = new Item();  //아이템 인스턴스 생성
        i.sell();  //메서드 실행
        i.buy();
    }
}
