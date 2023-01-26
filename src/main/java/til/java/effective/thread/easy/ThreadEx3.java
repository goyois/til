package til.java.effective.thread.easy;
//Thread 클래스를 상속받은 하위 클래스에서 run()을 구현하여 스레드 생성 및 실행
public class ThreadEx3 {
    public static void main(String[] args) {

        ThreadEx4 threadEx4 = new ThreadEx4();
        threadEx4.start();


        for (int i = 0; i < 100; i++) {
            System.out.println("메인 스레드 싫행");
        }

    }
}

class ThreadEx4 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("작업 스레드 실행");

        }
    }
}