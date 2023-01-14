package til.java.oop.chap.abstraction;

public final class FinalEx {  //상속,확장 불가의 final 제어자 클래스
    final int x = 1;  //변경불가 상수

    final int getNum() {  //오버라이딩 불가한 메서드
        final int result = x;  //상수
        return 1;
    }
}
