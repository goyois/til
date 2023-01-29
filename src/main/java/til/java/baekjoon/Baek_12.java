package til.java.baekjoon;


import java.util.Scanner;

public class Baek_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //입력 값
        int temp = N;  //식의 합계
        int count = 0;  //사이클 횟수

        while (true) {
            int left = temp / 10;  // 입력값 / 10
            int right = temp % 10;  //입력값 10으로 나눈 나머지 값;
            temp = right * 10 + (right + left) % 10;  //합계 : 10으로 나눈 뒤 나머지값으로 합계 할당 26일경우 68->84->42->26 (4)
            count++;  //사이클 횟수 추가
            if (N == temp) {  //만약 입력값과 합계가 같다면 break
                break;
            }
        }
        System.out.println(count);
    }
}
