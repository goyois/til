package til.java.oop.chap.constructor;

public class This {
    public static void main(String[] args) {

        //This()
        Example e2 = new Example();
        Example e3 = new Example(10);


    }
}

class Example {
    //This()
    public Example() {
        System.out.println("나의 기본 생성자 호출");
    }
    public Example(int x) {
        this();  //상위의 메서드를 다시 호출함
        System.out.println("두번째 생성자 호출");



    }
}