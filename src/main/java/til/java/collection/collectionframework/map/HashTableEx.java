package til.java.collection.collectionframework.map;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableEx {
    public static void main(String[] args) {

        Hashtable<String,String> member = new Hashtable<String,String>();

        member.put("김주원", "서버개발자");
        member.put("유재석","방송인");
        member.put("이재용","기업가");
        member.put("박정현","가수");

        System.out.println(member);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("이름과 직업을 입력해주세요");
            System.out.println("이름: ");
            String name = sc.nextLine();

            System.out.println("직업: ");
            String job = sc.nextLine();

            if (member.containsKey(name)) {  //1 만약 멤버의 name 이 있다면 (name 확인)
                if (member.get(name).equals(job)) {  //2 입력된 값이 가져온 key(name)과 job의 value가 동일하다면 (name,job확인)
                    System.out.println("환영합니다.");
                    break;
                }
                else System.out.println("다시 확인해주세요"); //1 이름은 일치하나 직업이 안맞을경우
            }
            else System.out.println("동록된 이름이 아닙니다."); //2 이름이 아예 안맞을경우
        }
    }
}
