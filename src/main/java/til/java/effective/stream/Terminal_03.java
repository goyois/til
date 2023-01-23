package til.java.effective.stream;

import java.util.Arrays;

// 스트림의 요소를 줄여나가면서 연산을 수행하고 최종적인 결과를 반환
public class Terminal_03 {
    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5};

        //sum()
        long sum = Arrays.stream(intArray).sum();
        System.out.println(sum);


        //초기값이 없는 reduce()
        int sum1 = Arrays.stream(intArray)
                .map(value -> value + 2)  //각 요소에 2 더함
                .reduce((a , b) -> a + b).getAsInt(); //2 씩 더한 a: 누적 값 b: 새로 더해질 값 1+2 -> a:3 b:3
        System.out.println(sum1);


        //초기값이 있는 reduce()
        int sum2 = Arrays.stream(intArray)
                .map(value -> value + 2)
                .reduce(5, (a , b) -> a + b); //초기값 5
        System.out.println(sum2);



    }
}
