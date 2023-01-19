package til.java.collection.enums;

import static til.java.collection.enums.Enums.SPRING;

public class EnumTest2 {
    public static void main(String[] args) {
        Enums enums = Enums.SUMMER;  //enums 변수에  Enum클래스의 summer를 넣어줌

        Enums[] allEnums = Enums.values();  //allEnums 변수에 Enums의 객체들의 값을 배열로 넣어줌
        for (Enums x : allEnums) {  //allEnums 이 빌 때까지 Enums x에 차례대로로 값을 넣어줌
            System.out.printf("%s = %d %n", x.name(),x.ordinal());  //객체가 가지고 있는 문자열 리턴, 순번대로 리턴
        }
        Enums findEnums = Enums.valueOf("SPRING");  // findEnums에 Enums의 문자열을 열거 객체로 리턴시킨다
        System.out.println(findEnums);  //반환
        System.out.println(SPRING.equals(Enums.valueOf("SPRING")));  //Enums안에 있는 SPRING 이 Enums.valueOf(SPRING)이랑 똑같은지 boolean타입으로 반환

        switch (enums) {
            case SPRING:
                System.out.println("봄이다.");
                break;
            case SUMMER:
                System.out.println("여름이다.");
                break;
            case FAIL:
                System.out.println("가을이다.");
                break;
            case WINTER:
                System.out.println("겨울이다.");
                break;
        }
    }
}
