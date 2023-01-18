package til.java.backjoon;

import java.util.Scanner;
//선택 정렬
public class world {
    public static void main(String[] args) {
        int min = 0;
        int index = 0;
        int temp = 0;  //min = 최소값, index 배열의 인덱스값,temp = 배열안에서 스워핑될 인덱스값을 넣을 보조변수
        int array[] = {1,10,5,8,7,6,4,3,2,9};  //순서가 유지되지않은 10크기의 배열 선언

        for (int i = 0; i < 10; i++) {  //10이 i보다 클 때까지
            min = 11;  //첫 for문을 수행할 최소값 9999; 배열보다 커야함 = why? = min은 최소값을 넣어야하기때문에 처음에 배열보다 큰 값을 넣어야한다

            //순서를 바꿀 전략이기때문에 반복문을 중첩해서 쓴다.
            for (int j = i; j < 10; j++) {  //j에 i 값(0)을 주고 10이 더 클때까지 돌아가는데
                if (min > array[j]) {  //만약 min(9999)가 i(0) = j(0) 배열의 0번째인 1보다 크면
                    min = array[j]; // 배열의 0번째 인덱스의 값  / 1
                    index = j;  // i = j/(0)

                }
            }
            temp = array[i];  // temp 에 1이라는 값을 넣어주고
            array[i] = array[index]; //  array[i] 에 array[0] / 1을 넣어줌 / 현재 array[index]의 인덱스는 0임 = 1
            array[index] = temp; //마지막으로 이제 array[0]의 자리에   temp 1이라는 값을 넣어준다
        }
        for (int i = 0; i <10; i++) {
            System.out.println(array[i]);
        }
    }
}
/**
 * 선택정렬이 얼마나 많은 시간을 잡아먹는가? (시간 복잡도)
 *
 * 1 2 3 4 5 6 7 8 9 10
 *
 * 10 + 9 + 8 + 7 +6 .. + 1 (등차수열)
 *
 * 10 * (10 + 1) / 2 = 55   55번의 비교연산을 해야한다..
 *
 * N * (N + 1) /2  더 간략히
 *
 * N * N /~ 의 수행시간을 가진다
 *
 * O(N * N) = 이 문제의 시간복잡도는 O(N^2) O의N제곱이다   알고리즘의 총 연산 수를 구한것
 *
 * O(N^2) 제일 비효율적임 /선택 정렬의 한계
 */