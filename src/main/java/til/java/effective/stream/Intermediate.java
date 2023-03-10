package til.java.effective.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Intermediate {
    public static void main(String[] args) {

        //distinct / filter 메서드
        List<String> names = Arrays.asList("김주원","유재석","정준하","하하","김주원");

        names.stream()
                .distinct()  //리스트 내의 소스 중 중복되는 값 제거
                .forEach(element -> System.out.println(element));
        System.out.println();


        names.stream()
                .distinct() //중복제거
                .filter(element -> element.startsWith("김"))  //김씨 성을 가진 사람만 필터링하여 출력
                .forEach(element -> System.out.println(element));
        System.out.println();


        //map 메서드: 스트림 내 요소들에서 언하는 필드만 추출하거나 특정형태로 변환할 때 사용하는 중간연산자 filter와 동일하게 값을 변환하기 위해 조건을 람다로 정의함

        List<String> engName = Arrays.asList("juwon","jaeseok","junha","haha","juwon");

        engName.stream()
                .map(element -> element.toUpperCase())  //대문자로 변환
                .forEach(element -> System.out.println(element));
        System.out.println();


        //요소에 값을 더하는 경우
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().map(number -> number + 3).forEach(System.out::println); // 요소들에 3씩 더하는 메서드
        System.out.println();


        //이중 배열 요소들 출력하기
        String[][] namesArray = new String[][]{{"김주원","유재석"}, {"정준하", "하하"}};

        Arrays.stream(namesArray)
                .map(inner -> Arrays.stream(inner))
                .forEach(names1 -> names1.forEach(System.out::println));
        System.out.println();


        //만약 3중 4중 5중으로 뎁스가 길어지는 경우 flatMap() 활용
        //flatMap = 중첩구조를 제거하고 단일컬렉션(String<String>)으로만들어준다. 이를 평평하게 한다고 하여 플래트닝이라고함.
        Arrays.stream(namesArray).flatMap(Arrays::stream).forEach(System.out::println);
        System.out.println();


        //정렬 sorted() 괄호안에 아무값도 없을경우 기본 정렬(오름차순)
        List<String> animals = Arrays.asList("Tiger","Lion","Monkey","Dog","Duck");
        animals.stream().sorted().forEach(System.out::println);  //기본 정렬(오름차순)
        System.out.println();
        animals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //역순(내림차순)
        System.out.println();


        //skip 스트림의 일부 요소들을 건너뜀
        IntStream int1 = IntStream.rangeClosed(1,10);
        int1.skip(5).forEach(System.out::println);  //5 이상의 값만 추출하여 반환
        System.out.println();


        //limit 스트림의 일부를 자릅니다.
        IntStream int2 = IntStream.rangeClosed(1,10); //5까지만(5 포함)
        int2.limit(5).forEach(System.out::println);
        System.out.println();


        //peek  forEach와 마찬가지로 요소들을 순회하며 특정 작업을 수행 peek은 중간연산자로 여러번 연결하여 사용가능하나 forEach는 최종연산자로 1번만 사용가능
        IntStream int3 = IntStream.of(1,2,3,4,5);

        int sum = int3.filter(element -> element % 2 == 0) //2로 떨어지는 짝수값만 필터링함
                .peek(System.out::println)
                .sum();

        System.out.println("합계 = " + sum);




    }
}
