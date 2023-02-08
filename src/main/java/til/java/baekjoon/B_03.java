package til.java.baekjoon;

import java.util.Scanner;

public class B_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();


        //만약 모든 변수가 다른 경우
        if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
            int max;
            if (dice1 > dice2) {  //3 > 1 > 2
                if (dice3 > dice1) {
                    max = dice3;  //가장 크다면  1 순위로 dice3이 가장 큰 것
                } else {
                    max = dice1;  //위의 식이 아닐경우 dice1이 가장 큰 것
                }
            } else {
                if (dice3 > dice2) {
                    max = dice3;
                } else {
                    max = dice2;
                }
            }
            System.out.println(max * 100);
            //적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
        } else {
            if (dice1 == dice2 && dice1 == dice3) {
                System.out.println(10000 + dice1 * 1000);
                //dice1이 2 || 3 이랑만 같은 경우
            } else {
                if (dice1 == dice2 || dice1 == dice3) {
                    System.out.println(1000 + dice1 * 100);
                } else {
                    System.out.println(1000 + dice2 * 100);
                }
            }
        }
    }
}
