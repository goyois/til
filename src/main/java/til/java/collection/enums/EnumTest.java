package til.java.collection.enums;

public class EnumTest {
    public static void main(String[] args) {

        Member member = Member.PARK;


        //향상된 for문 사용예제
        Member[] allMembers = Member.values();  //allMembers 변수 안에 Member 열거 객체들을 배열로 할당 -> values()메서드
        for (Member x :allMembers) { // 멤버의 참조 변수 x 에 열거객체배열을 순차적으로 넣어줌
            System.out.printf("%s=%d%n", x.name(), x.ordinal()); //name() = 열거객체가 가지고 있는 문자열 리턴, ordinal() = 열거 객체 순번 리
        }

        //열거 메서드사용 예제
        Member findMember = Member.valueOf("KIM");
        System.out.println(findMember);
        System.out.println(Member.KIM == Member.valueOf("KIM"));

        //switch + 열거 메서드 사용예제
        switch (member) {
            case KIM:
                System.out.println("김주원");
                break;
            case LEE:
                System.out.println("이명박");
                break;
            case PARK:
                System.out.println("박명수");
                break;
        }

    }
}
