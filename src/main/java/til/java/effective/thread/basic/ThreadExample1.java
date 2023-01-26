package til.java.effective.thread.basic;
//Runnable 익명 구현체를 활용하여 스레드 생성 및 실행
public class ThreadExample1 {
    public static void main(String[] args) {


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("익명 구현 객체를 통한 작업 스레드 실행");
                }
            }
        });

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("메인스레드 실행");

        }
    }
}
