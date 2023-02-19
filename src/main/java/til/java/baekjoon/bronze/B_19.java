package til.java.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;
//점수 / M * 100
public class B_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double arr[] = new double[sc.nextInt()];  //입력받는 숫자만큼의 크기의 배열을 가짐

        for (int i = 0; i < arr.length; i++) {  //배열의 길이만큼 입력받음
            arr[i] = sc.nextDouble();
        }

        double sum = 0;
        Arrays.sort(arr);  //배열들 오름차순 정렬

        for (int j = 0; j < arr.length; j++) {
            sum += ((arr[j] / arr[arr.length -1]) * 100);  //sum에 arr0번째 점수 /최댓값인 arr의 마지막 점수 * 100를 순회하며 sum에 저장
        }
        System.out.println(sum / arr.length);  //누적된 합계의 평균 산출
    }
}
