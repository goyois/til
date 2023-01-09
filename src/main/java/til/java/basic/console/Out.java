package til.java.basic.console;

public class Out {
    public static void main(String[] args) {

        //단순 출력
        System.out.print("Hello World");
        System.out.print(3+5);
        System.out.print(2022 + 1 + " year");

        System.out.println("-------");

        //출력하고 줄 바꿈
        System.out.println("Hello World");
        System.out.println(3+5);
        System.out.println(2022 + 1 + " year");

        System.out.println("-------");

        //형식대로 출력하기
        System.out.printf("%s%n", "Hello World");
        System.out.printf("%s%n", "Kim" + "JuWon");
        System.out.printf("%d%n", 3 + 6);
        System.out.printf("지금은 %s입니다.", 2023 + "year");  //자동 타입변환
        System.out.printf("나는 %c%s입니다.", '김',"주원");

    }
}
