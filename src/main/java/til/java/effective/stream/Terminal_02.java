package til.java.effective.stream;

import java.util.Arrays;

//매칭 match() 메서드를 사용하면 조건식 람다 predicate 를 매개변수로 넘겨 스트림의 각 데이터 요소들이 특정한 조건을 충족하는지/충족시키지않는지 검사하면 결과는 boolean값으로 반환
public class Terminal_02 {
    public static void main(String[] args) {
        int[] intArray = {2,4,6,8,10};

        //allMatch()
        boolean result = Arrays.stream(intArray).allMatch(value -> value % 2 ==0);  //모든 요소가
        System.out.println("요소 모두 2의 배수인가? " + result);

        result = Arrays.stream(intArray).anyMatch(value -> value % 3 == 0);  //요소 중 몇가지가
        System.out.println("요소 중에 3의 배수가 하나라도 잇는가 " + result);

        result = Arrays.stream(intArray).noneMatch(value -> value % 3 == 0);  //하나도 없는가
        System.out.println("요소 중 3의 배수가 하나도 없나요? " + result);
    }
}
