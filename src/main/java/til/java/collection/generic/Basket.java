package til.java.collection.generic;

/**
 * 제네릭을 사용하면 타입별 여러 클래스를 정의할 필요없이 모든 데이터 타입을 저장할 수 있다.
 * 타입을 구체적으로 지정하는 것이 아니라 추후에 지정할 수 있도록 일반화해두는 것
 * 즉, 작성한 클래스 또는 메서드의 코드가 다른 데이터 타입에 얽매이지 않게 해둔 것
 * 상속된 상위클래스 & 인터페이스 또한 가능
 */

//public class Basket<T extends {class}> = 인스턴화할 경우 상속받는 하위클래스만 지정하도록 제한
//public class Basket<T extends {interface}> = 인스턴화할 경우 인터페이스를 구현한 클래스만 지정하도록 제한
public class Basket<T> {
    private T item;

    public Basket(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class Customer { //정수의 경우 wrapper 클래스 타입으로 사용해야함
    Basket<Long> basket1 = new Basket<Long>(1L);  //Basket 클래스 내의 Type 을 Long 으로 바꾼다
    Basket<String> basket2 = new Basket<String>("통기타"); //Basket 클래스 내의 Type 을 String 으로 바꾼다
    Basket<Integer> basket3 = new Basket<Integer>(10);  // Basket 클래스 내의 Type 을 Integer 로 바꾼다
    Basket<Boolean> basket4 = new Basket<Boolean>(true);
    Basket<Double> basket5 = new Basket<Double>(3.14);
}
