package til.java.baekjoon.silver;

import java.util.Scanner;
// 설탕 배달 [그리디 알고리즘]
public class S_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N == 4 || N == 7) {
            System.out.println(-1);
        } else if (N % 5 == 0) {
            System.out.println(N / 5);
        } else if (N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        } else if (N % 5 == 2 || N % 5 == 4){
            System.out.println((N / 5) + 2) ;
        }
    }
}
//주어진 N에서 5kg의 설탕을 많이 가져가야 가장 효율적
//5로 나누어떨어지는 수의 +3을 한 값이 최소의 개수

// N 이 4 또는 7 인 경우  = 3 || 5로 나누어 떨어질 수 없으므로 -1
// N 이 5의 배수인경우 (5로 나눈 나머지가 0인 경우)  = N/5 의 값
// N 이 5의 배수 + 1 또는 5의 배수 + 3 인 경우
// N 이 5의 배수 + 2 또는 5의 배수 + 4 인 경우