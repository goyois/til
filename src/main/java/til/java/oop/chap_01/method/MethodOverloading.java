package til.java.oop.chap_01.method;

public class MethodOverloading {
    public static void main(String[] args) {
        Dance d = new Dance();

        d.breakDance();
        d.breakDance(60);
        d.breakDance(50,50);
        d.breakDance("성공");
    }
}

class Dance {  //메서드 정의클래스 생성
    public void breakDance() {  //반환타입이 void 이므로 출력값을 그대로 보여줌
        System.out.println("윈드밀");
    }
    public void breakDance(int a) {  //메서드 오버로딩을 할경우 기존 메서드와 메서드명이 같아야하고 매개변수개수,타입이 달라야한다,반환타입은 상관없음
        System.out.println("윈드밀을 하기 위한 몸무게는 = " + a);
    }
    public void breakDance(int b,int c) {
        System.out.println("윈드밀을 하기 위한 아이큐는 = " + b + "," + c);
    }
    public void breakDance(String a) {
        System.out.println("시도 결과는 = " + a);
    }
}
//메서드 오버로딩으로 여러 경우의 수를 해결할 수 있다는 장점이 있음