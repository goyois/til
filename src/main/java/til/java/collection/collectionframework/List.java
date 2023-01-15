package til.java.collection.collectionframework;

import java.util.ArrayList;

/**
 * ArrayList
 * 특징
 * 1.객체가 인덱스로 관리
 * 2.저장용량 초과 시 자동으로 저장용량을 늘림
 * 3.데이터의 순서를 유지함
 *
 * LinkedList
 *  * 특징
 *  * 불연속적 존재
 *  * 만약 데이터 삭제 시 A,B,C가 있을 경우 B를 삭제하려고 할 때에는 A와 C를 연결해주어야함 추가 또한 동일한 동작방식이 적용됨
 */
public class List {
    //ex) ArrayList<타입 매개변수> 객체명 = new ArrayList<타입 매개변수>(초기 저장 용량);
    //ex) LinkedList<타입 매개변수> 객체명 = new LinkedList<타입 매개변수>(초기 저장 용량)

    ArrayList<String> container1 = new ArrayList<String>();
    //String 타입의 객체를 저장하는 List 생성, 기본 저장 공간 10

    ArrayList<String> getContainer2 = new ArrayList<>(50); //저장공간 50


    public static void main(String[] args) {

        ArrayList<String> basket = new ArrayList<String>();

        //String 타입의 데이터를 List 에 추가
        basket.add("상의");
        basket.add("하의");
        basket.add("신발");

        //저장된 총 객체 수 얻는 메서드
        int size = basket.size();
        System.out.println("basket list 의 총 객체 수: " + basket.size());

        //2번 인덱스 요소 얻는 메서드
        String skill = basket.get(2);
        System.out.println("2번 인덱스의 객체: " + basket.get(2));

        //저장된 총 객체의 인덱스와 해당 데이터 얻기
        for (int i = 0; i < basket.size(); i++) {  //i 가 basket 객체 수보다 작을때까지 반복
            String str = basket.get(i);  //참조변수 str에 basket list의 요소를 가져온 뒤 {i의 값 = 인덱스}순서대로 넣어줌
            System.out.println(i + ":" + str);
        }

        //for-each 활용
        for (String str : basket) {
            System.out.println(str);
        }

        //0번 인덱스 삭제
        basket.remove(0);

        for (int j = 0; j < basket.size(); j++) {
            String str2 = basket.get(j);
            System.out.println(j + " : " + str2);

        }


    }
}
