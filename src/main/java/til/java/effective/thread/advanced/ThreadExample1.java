package til.java.effective.thread.advanced;

public class ThreadExample1 {
    public static void main(String[] args) {

        Runnable runnable = new ThreadExample2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.setName("짱구");
        thread2.setName("짱아");

        thread1.start();
        thread2.start();




    }
}



class Account {

    private int balance = 1000;  //보유 잔액

    public int getBalance() {
        return balance;
    }


    public boolean withdraw(int money) {  //인출 성공 시 true 실패 시 false


        if (balance >= money) {  //인출 가능여부를 판단 : 잔액이 인출하고자하는 금액보다 커야함

            try {  //if문의 실행부 진입 시 일시 정지시키고 다른 스레드에 제어권 넘김
                Thread.sleep(1000);
            } catch (Exception e) {}

            //잔액에서 인출금을 깎아 새로운 잔액을 기록한다
            balance -= money;

            return true;
        }
        return false;
    }
}