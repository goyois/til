package til.java.collection.collectionframework.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * key & value 값으로 구성된 객체(Entry)를 저정할 때 쓰는 구조
 * Entry 객체는 키와 값을 각각 key 객체와 value 객체로 저장하는 특징이 있다.
 *
 * 키는 중복저장 x / 값은 중복저장 o
 */
public class HashMapEx {
    public static void main(String[] args) {
        //      <key>   <value>
        HashMap<String, Integer> member = new HashMap<String, Integer>();

        member.put("무한도전", 1);
        member.put("1박2일", 2);
        member.put("뜨거운형제들", 3);
        member.put("나는가수다", 4);
        member.put("아는형님", 5);

        //저장된 총 Entry 갯수
        System.out.println(member.size()); // = 5

        //객체 찾기(해당 객체 가져오기)
        System.out.println(member.get("무한도전"));  // = 1



        //순회를 위한 key 를 요소로 가지는 Set 생성
        Set<String> keySet = member.keySet();

        Iterator<String> keyIterator = keySet.iterator();  //Iterator 클래스 사용
        while (keyIterator.hasNext()) {  // 읽어올 다음 Entry 가 있을경우
            String key = keyIterator.next(); //next()를 통해 다음 Entry 를 반환해줌
            Integer value = member.get(key);  // Entry 의 키 값을 가져옴
            System.out.println(key + " : " + value); // = 뜨거운형제들 : 3 / 순서 저장x
        }

    }
}
