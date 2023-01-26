package til.java.effective.thread.basic;
//스레드 이름 조회하기
public class ThreadExample3 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드의 이름은?");
            }
        });
        thread.start();

        System.out.println("thread의 이름은 = " + thread.getName());
    }
}