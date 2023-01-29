package til.java.effective.thread.advanced;

public class ThreadExample2 implements Runnable{
    Account account = new Account();


    @Override
    public void run() {
        while (account.getBalance() > 0) {


            int money = (int)(Math.random() * 3 + 1) * 100;  //랜덤으로 100~300의 인출금을 정함

            boolean denied = !account.withdraw(money);  //withdraw 실행 동시에 인출 성공 여부를 변수에 할당


            System.out.println(String.format("Withdraw %d₩ By %s. Balance : %d %s",
                    money, Thread.currentThread().getName(), account.getBalance(), denied ? "-> DENIED" : "")
            );  //인출결과 만약 인출에 실패헀다면 DENIED 출력
        }
    }
}
