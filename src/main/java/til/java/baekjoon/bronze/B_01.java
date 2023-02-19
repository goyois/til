package til.java.baekjoon.bronze;

import java.util.Scanner;

public class B_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        if (M < 45) {  //만약 입력된 분값이 45분 보다 작으면
            H--; //시간을 한시간 차감
            M = 60 - (45 - M);  //분값은 입력값에서 45를 차감  ex 1시 30분 입력했을경우 60 (45 - 30) = 0 시 45분
            if (H < 0) { //만약 시값이 0보다 작으면  ex) 0시 30분
                H = 23; //시 값은 23
            }
            System.out.println(H + " " + M);  //위 식이 참일경우
        } else {
            System.out.println(H + " " + (M - 45));  //45분보다 클 경우
        }
    }
}
