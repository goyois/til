package til.java.collection.collectionframework.set;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {

        TreeSet<String> member = new TreeSet<String>();

        member.add("김 주원");
        member.add("유재석");
        member.add("정준하");
        member.add("박명수");

        System.out.println(member);  //자동으로 시간 편찬 순에 따라 오름차순으로 정렬(기본값)
        System.out.println(member.first());
        System.out.println(member.last());
        System.out.println(member.higher("김"));
        System.out.println(member.subSet("김","주원"));


        System.out.println(member.stream().count());  //stream 클래스의 count 메서드


    }
}
