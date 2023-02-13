package til.java.designpattern;

/**
 * 가독성이 좋아짐
 * 변경이 불가능한 객체를 만들 수 있음
 * 한번에 객체를 반환하므로 객체의 일관성이 깨지지 않음
 * 생성 비용이 크지않으나 성능에 민감한 경우 더 나은 패턴을 선택해야할 수 있음
 *
 */
public class Builder {
    public static void main(String[] args) {
        Member member = Member.builder()
                .name("김주원")
                .age(14)
                .role("회원").build();

        System.out.println(member.name +" " +  member.age + " " + member.role);
    }
}
@lombok.Builder
class Member {
    public String name;
    public int age;
    public String role;

    public Member(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
}