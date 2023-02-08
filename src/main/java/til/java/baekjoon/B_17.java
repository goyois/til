package til.java.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_17 {
    public static void main(String[] args) {  //총 30명의 학생중에 숙제를 내지않은 2명의 학생을 찾아라
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];  //총 30명이니 인덱스값(0)을 포함시켜 31 크기를 가지는 배열 생성

        for (int i = 1; i <= 28; i++) { //28과 크거나 같을 떄 까지
            int A = sc.nextInt(); //1. 배열에 값을 넣어줌
            arr[A] = 1;  //2. 반복하며 배열의 값을 1로 바꿔줌
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != 1)  //만약 배열을 순회하며 해당 인덱스의 값이 1이 아니면
                System.out.println(j); //입력값으로 들어오지않은 해당 인덱스를 리턴
        }
    }
}
