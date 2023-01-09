package til.java.basic.console;

import java.util.Scanner;  //스캐너 클래스를 가져옴

public class In {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //스캐너 클래스의 인스턴스르 생성
        String inputValue = sc.nextLine();  //입력한 내용이 inputValue 에 저장됨

        System.out.println(inputValue);  //입력한 문자열이 출력됩니다.
    }
}
