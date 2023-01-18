package til.java.collection.collectionframework.set;

import java.util.HashSet;

public class SetEx {
    public static void main(String[] args) {
        HashSet<String> human = new HashSet<String>();  //저장순서,중복 x

        human.add("김주원");
        human.add("유재석");
        human.add("정준하");
        human.add("정형돈");
        human.add("박명수");
        human.add("노홍철");
        human.add("전진");
        human.add("하하");
        human.add("김주원");  //중복

        for (String str : human) {
            System.out.println(str);  //중복이 발생했지만 출력값엔 중복생성되지않고 1명의 김주원이 추가됨
        }

    }
}
