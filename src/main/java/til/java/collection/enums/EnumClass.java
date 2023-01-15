package til.java.collection.enums;

public class EnumClass {
    public static void main(String[] args) {
        //호출 방법 #1
        System.out.println(Enums.SPRING);
        System.out.println(Enums.SUMMER);
        System.out.println(Enums.FAIL);
        System.out.println(Enums.WINTER);

        System.out.println("-----------------------");
        //호출 방법 #2
        Enums fav = Enums.SUMMER; // enums 타입의 fav(참조변수)에 할당
        System.out.println(fav);
    }
}

class EnumMember {
    public static void main(String[] args) {
        Member member = Member.PARK;

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