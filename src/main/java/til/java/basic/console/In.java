package til.java.basic.console;

import java.util.Scanner;  //스캐너 클래스를 가져옴

public class In {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //스캐너 클래스의 인스턴스르 생성
        String inputValue = sc.nextLine();  //nextLine() 콘솔을 통해 입력받 기능을 수행하고 입력된 콘솔에 입력된 값은 변수에 할당됨

        System.out.println(inputValue);  //입력한 문자열이 출력됩니다.
    }
}
