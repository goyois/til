package til.java.oop.chap_01;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Member {
    public String gender;  //필드 선언
    public String race;
    public String youth;

    public Member(String gender, String race, String youth) {
        this.gender = gender;
        this.race = race;
        this.youth = youth;
    }


    void meet() {
        System.out.println("만나서 반갑습니다.");
    }
    void game() {
        System.out.println("게임하시겠습니다.");
    }
    void bye() {
        System.out.println("안녕히가세요.");
    }
}