package til.java.collection.generic;

//이버엔 클래스 내부의 특정 메서드만 제네릭으로 선언하는 방법
public class GenericMethod {
    public <T> void add (T element) { //제네릭 메서드의 타입 매개변수 선언은 반환타입 앞에 이루어지며, 메서드 내에서만 매개변수 사용가능
        System.out.println("굿");
    }
}
