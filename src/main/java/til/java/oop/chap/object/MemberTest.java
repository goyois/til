package til.java.oop.chap.object;

public class MemberTest {
    public static void main(String[] args) {
        Member member = new Member("남자","한국인","청년");

        System.out.println("제 성별은 " + member.gender +"이고 " + "인종은 " + member.race + " 이며" + "현재 " + member.youth + "입니다.");
        member.meet();
        member.game();
        member.bye();
    }
}
