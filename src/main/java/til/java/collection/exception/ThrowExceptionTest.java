package til.java.collection.exception;
//예외 전가 : 예외를 호출한 곳으로 다시 예외를 떠넘기는 방법
//메서드의 선언부 끝에 아래와 같이 throws 키워드와 발생할 수 있는 예외들을 쉼표로 구분하여 나열해주면 됨
//void Method() throws Exception{} <- 특정 메서드에서 모든 종류의 예외가 발생할 가능성이 있는 경우 사용

public class ThrowExceptionTest {
    public static void main(String[] args) {

        try {
            throwException();  //잘못된 코드작성으로 런타임에러 발생!
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    static void throwException() throws ClassNotFoundException, NullPointerException {  //throw키워드를 통해 예외가 발생한 메서드안에서 처리하지 않고 호출한 메서드로 넘겨버림
        Class.forName("java.lang.StringX");
    }
}
//throws 를 사용해 의도적 예외 만들기
class ExceptionTest {
    public static void main(String[] args) {
        try {
            Exception exception = new Exception("외도된 예외");
            throw exception;
        } catch (Exception e) {
            System.out.println("고의로 예외 발생시키기 성공 !");
        }
    }
}
