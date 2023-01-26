package til.java.effective.thread.easy;

//Runnable 구현체에서 run()을 구현해 스레드를 생성 및 실행하는 방법
public class ThreadEx1 {
    public static void main(String[] args) {

        //Runnable 인터페이스를 구현한 객체 생성
        //Runnable runnable = new ThreadEx1();

        //Runnable 구현 객체를 인자로 전달하면서 Thread 클래스를 인스턴스화 하여 스레드 생성
        //Thread thread = new Thread(runnable);

        //Thread 클래스의 인스턴스를 만든 후 runnable 인터페이스의 구현체를 인자로 받음(새로운 스레드 생성)
        Thread thread = new Thread(new ThreadEx2());

        //작업 스레드 실행을 통해 내부의 코드를 처리하도록 함
        thread.start();

        //메인 스레드 실행
        for (int i = 0; i < 100; i++) {
            System.out.println("추가 스레드");

        }


    }
}

class ThreadEx2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++);{
            System.out.println("스레드 실행");
        }
    }
}