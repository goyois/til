package til.java.collection.exception;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        System.out.println("[소문자 알파벳을 대문자로 출력하는 프로그램]");
        printMyName("abc");
        printMyName(null);  //넘겨주는 매개변수가 null 인 경우 nullPointerException 발생
        System.out.println("[프로그램 종료]");
    }
    public static void printMyName(String str) { //정적 메서드 printMyName
        String upperCase = str.toUpperCase();  //upperCase 라는 참조변수에 매개변수 str 의 값 abc 을 대문자로 변환함
        System.out.println(upperCase);
    }
}


//    Exception in thread "main" java.lang.NullPointerException
//        at til.java.collection.exception.RuntimeExceptionTest.printMyName(RuntimeExceptionTest.java:11)
//        at til.java.collection.exception.RuntimeExceptionTest.main(RuntimeExceptionTest.java:7)
//        [소문자 알파벳을 대문자로 출력하는 프로그램]
//        ABD