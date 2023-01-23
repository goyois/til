package til.java.effective.stream;


import java.util.Arrays;

//숫자와 관련된 기본적인 집계의 경우에는 대부분 최종 연산자인 경우가 많음
public class Terminal_01 {
    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5};

        //카운팅
        long count = Arrays.stream(intArray).count();
        System.out.println(count);

        //합계
        int sum = Arrays.stream(intArray).sum();
        System.out.println(sum);

        //평균
        double avg = Arrays.stream(intArray).average().getAsDouble();
        System.out.println(avg);

        //최대값
        int max = Arrays.stream(intArray).max().getAsInt();
        System.out.println(max);


        //최소값
        int min = Arrays.stream(intArray).min().getAsInt();
        System.out.println(min);

        //배열의 첫번쨰 요소
        int first = Arrays.stream(intArray).findFirst().getAsInt();
        System.out.println(first);


    }
}
