package til.java.effective.thread.basic;
//스레드 이름 설정하는 법
public class ThreadExample4 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드 이름 설정하기");
            }
        });

        thread.start();
        System.out.println("스레드의 기본 이릉은 =" + thread.getName());

        thread.setName("무한도전 재밌어");
        System.out.println("스레드의 바뀐 이름은 = " + thread.getName());
    }
}
