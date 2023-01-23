package til.java.effective.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {

        //Arrays.stream()

        String[] arr = new String[] {"김주원", "유재석", "정준하"};  //문자열 타입의 arr 배열 생성

        Stream<String> stream = Arrays.stream(arr);  // Stream 클래스 객체에 arr 에 저장된 데이터값을 가져옴

        //2번째 방법
        //Stream<String> stream = Stream.of(arr);

        stream.forEach(System.out::println);  //


        int[] intArr = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArr);

        System.out.println(intStream.sum()); //배열값들의 합계
        // System.out.println(intStream.average());  스트림은 최종 연산자이므로 실행되었다가 닫히므로 에러발생



        //collection stream

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream2 = list.stream();  //리스트안에 배열값을 전부 가져옴

        stream2.forEach(System.out::print);  //배열 형식 그대로 출력 123456



        //스트림 생성의 버무이를 5개로 제한

        IntStream ints = new Random().ints().limit(5);
        ints.forEach(System.out::println);

        //특정 범위의 정수

        IntStream intStream2 = IntStream.rangeClosed(1,10); //renge 와 rangeClosed는 츌룍헐 때 두번째 매개변수가 포함되느냐 안되는냐 차이 rang 는 포함안됨
        intStream2.forEach(System.out::print);

    }
}
