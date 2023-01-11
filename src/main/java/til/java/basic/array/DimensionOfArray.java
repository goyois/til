package til.java.basic.array;

import java.util.Arrays;

public class DimensionOfArray {
    public static void main(String[] args) {

        /**
         *
         * 1차원 배열 = 배열의 요소가 배열이 아닌 배열
         *
         */

        //1차원 배열 초기화

        //참조 변수 temperatureOfJuly 선언
        // double 형 값을 저장할 수 있는 31개의 배열 생성되며
        //대입 연산자 (=)에 의해 생성된 배열 첫번째 요소의 주소값이 참조 변수 temperatureOfJuly 에 할당됨
        double[] temperatureOfJuly = new double[3];
        System.out.println(temperatureOfJuly);  //주수값 할당


        double[] temp = new double[]{1.1,2.2,3.3,4.4,5.5};  //실제 값 할당

        double[] temper = {1.1,2.2,3.3,4.4,5.5};  //선언과 함께 초기화

        System.out.println(temper.length); // 배열의 길이
        System.out.println(temper[3]);  // 특정 값 + 주소값 접근
        System.out.println();

        int[] num = {1,2,3};  //int
        System.out.println(num[2]);  //정수형 변수 값 접근

        String[] favoriteThings = {"음악듣기","걷기","운동하기"};  //String
        System.out.println(favoriteThings[0]);  // *인덱스값으로 조회해야함


        /**
         * 2차원 배열
         */

        int[][] kcal = {
                {1111,1112,3333},
                {1117} };
        System.out.println(Arrays.stream(kcal).count()); //배열 갯수


        /**
         * 가변 배열
         *
         */

        int[][] ages = new int[5][];  //[null,null,null,null,null]
        System.out.println(Arrays.toString(ages));  //5개의 배열 값을 반환

        //내부 배열을 생성 시

        ages[0] = new int[1];
        ages[1] = new int[2];
        ages[2] = new int[0];
        ages[3] = new int[4];
        ages[4] = new int[5];

        System.out.println(Arrays.toString(ages[0]));
        System.out.println(Arrays.toString(ages[1]));
        System.out.println(Arrays.toString(ages[2]));
        System.out.println(Arrays.toString(ages[3]));
        System.out.println(Arrays.toString(ages[4]));

        //생성과 동시에 초기화
        int[][] arr = {
                {0,1,2,3,4,5},
                {0,0,0,0,0,0,0,0},
                {2,2,2,2,2,2,2,2,2},
                {1,1,1,1,1,1,1,1,1,1,1}
        };

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));



    }
}
