package til.java.collection.exception;


//try-catch 사용

public class RuntimeExceptionTestV2 {
    public static void main(String[] args) {

        try {
            System.out.println("[소문자 알배펫을 대문자로 출력하는 프로그램]");
            printMyName(null); //1. 예외 발생
            printMyName("abc");  //첫 메서드에서 에러가 발생해 해당 메서드는 실행되지않고 catch 문으로 이동

        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생 !"); //2. 첫번째 catch 문
        }
        catch (NullPointerException e) {  // 두번째 catch 문
            System.out.println("NullPointerException 발생 !");
            System.out.println("e.getMessage: " + e.getMessage());  //예외 정보를 얻는 방법
            System.out.println("e.toString: " + e.toString());  // 예외 정보를 얻는 방법
            e.printStackTrace();  //예외 정보를 얻는 방법
        }

        finally {
            System.out.println("[프로그램 종료]");  //finally 문
        }
    }
        static void printMyName(String str) {
        String upperCase = str.toUpperCase();
            System.out.println(upperCase);
    }
}

