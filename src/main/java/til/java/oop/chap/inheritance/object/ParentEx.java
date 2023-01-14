package til.java.oop.chap.inheritance.object;

//모든 클래스는 object 클래스에서 확장됨

public class ParentEx {
    public static void main(String[] args) {
        int num = 1;
        String str = "king";

        /**
         * Object Class 메서드에 대해
         */
        System.out.println(str.toString()); // 할당된 값 출력
        System.out.println(str.equals("king"));  // == 등가 비교 연산자를 통해 boolean 타입의 결과값 출력
        System.out.println(str.hashCode()); //객체의 위치정보 관련하여 HashTable 또는 HashMap에서 동일 객체여부 판단



    }
}

class ChildEx extends ParentEx {

}


// 이렇게 하위클래스가 상속하고 있는경우
// 컴파일러가 마치 기본생성자처럼 자동으로 상위클래스에 extends Object 를 자동으로 추가함