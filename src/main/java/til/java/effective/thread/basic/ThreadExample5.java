package til.java.effective.thread.basic;
//스래드의 주소값 얻기
public class ThreadExample5 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()); //주소값과 이름을 가져온다
            }
        });

        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
