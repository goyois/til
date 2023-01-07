package til.java.basic.string;

import java.util.StringTokenizer;

public class OptionalStringClass {
    public static void main(String[] args) {

        /** ToDo
         * StringTokenizer Method
         * 문자열을 우리가 지정하 구분자로 문자열을 쪼개주는 클래스
         * 그렇게 쪼개어진 문자열을 우리는 토큰이라고 부른다
         */
        System.out.println("-----------------------");
        String str1 = "이 메소드는 정말 좋은 기능이에요.";  // 이 + 메소드는 + 정말 + 좋은 + 기능이에요 = 5 꽤 편리하다.
        StringTokenizer tokenizer = new StringTokenizer(str1);
        System.out.println(str1);
        System.out.println();
        System.out.println("totla token : " +tokenizer.countTokens());  //countTokens() = 전체가 아닌 남아있는 토큰의 개수를 뱉어냄.

        // while 문 적용 사용예제
        while (tokenizer.hasMoreElements()) {  //현재 위치 뒤에 있는 문자열에서 하나 이상의 토큰을 사용할경우 true 아닐경우 false 를 뱉어냄
            System.out.println(tokenizer.nextToken());  //Object nextElemant(), String nextToken() 다음의 토큰을 반환하는데
                                                        //같은 객체를 반환하나 Object를 반환하느냐 String을 반환하느냐의 차이
        }
        System.out.println("total token : " +tokenizer.countTokens());





        /** ToDo
         *  StringBuilder Method
         *  한번 생성된 String 클래스의 인스턴스는 여러개의 문자열을 더할 때 매번 새로운 인스턴스를 생성해야 하는데,
         *  어마어마한 양의 문자열을 모두 더해야하는 상황이라면 이 메서드를 써보자.
         */

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("문자열 ").append("도킹");  //.append("연결할 문자열").append("연결한 문자열2")
        String str2 = stringBuilder.toString();  //toString Method 를 통해 변수에 문자열을 할당
        System.out.println(stringBuilder);
        System.out.println(str2);


        System.out.println("-----------------------");


        /** ToDo
         * StringBuffer Class 의 Method들을 알아보자
         * 기존에는 인스턴스를 생성하면 읽기만 할 수 있고 변경은 불가했는데 StrignBUffer클래스의 인스턴스는 변경 & 추가 가 가능해짐
         * 이 놈은 자신의 공간안에 버퍼라는 독립적 공간을 갖는데 defalte = 문자 16개를 집어넣을 수 있는 크기(soso) 이며,
         * 생성자로 크기를 별도로 설정도 할 수 있다(나중에 알아보고 추가하자).
         * + 연산자로 문자열을 결합하여 새로운 인스턴스를 조립할 수 있음(자동 형변환)
         * StringBuffer를 쓰면 비교적 공간낭비도 없으며 속도도 매우 빨라짐
         */

        // #1 .append() = 문자열 연결(추가)
        StringBuffer str = new StringBuffer("김주원");
        System.out.println(" 문자열 " + str);
        System.out.println(str.append(" 화이팅"));  //앞서 해봤음

        // #2 .capacity() = 인스턴스의 현재 버퍼 크기 반환
        StringBuffer str01 = new StringBuffer();
        StringBuffer str02 = new StringBuffer("김주원");  // +문자열 3개 추가되어 기본값 16 -> 19
        System.out.println(str01.capacity());  //16
        System.out.println(str02.capacity());  //19

        // #3 .delete() = 전달되는 인덱스의 위치부터 다음 인덱스의 지정위치까지 삭제 / deleteCharAt() 사용 시 특정 위치의 문자 한개만 제거
        StringBuffer str3 = new StringBuffer("김주원입니다.");
        System.out.println(str3.delete(1,3));  // 출력: 김입니다.
        System.out.println(str3.deleteCharAt(1)); //출력: 김니다.

        // #4 .insert() = 인수로 전달된 값을 문자열로 변환 -> 문자열의 지정된 인덱스 위치에 추가
        StringBuffer str4 = new StringBuffer("김주원은 공부중");
        System.out.println(str4.insert(4," 신나게"));  //출력 : 김주원은 신나게 공부중

        //StringBuffer Method Reference https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html
    }
}
