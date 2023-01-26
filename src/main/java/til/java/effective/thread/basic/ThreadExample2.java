package til.java.effective.thread.basic;
//Thread 익명 하위 객체를 활용한 스레드 생성 및 활용
public class ThreadExample2 {
    public static void main(String[] args) {


        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("하위 객체를 활용한 작업 스레드 실행");
                }
            }
        };

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("메인 스레드 실행 ");
        }
    }
}
