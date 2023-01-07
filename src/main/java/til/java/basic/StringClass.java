package til.java.basic;

import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("String 타입의 변수선언과 할당");
        String name1 = "KimJuwon";
        String name2 = "KimJuwon";
        String name3 = new String("KimJuwon");
        String name4 = new String("KimJuwon");

        boolean names1 = name1 == "KimJuwon";
        boolean names2 = name1 == name2;
        boolean names3 = name3 == name4;
        boolean names4 = name4.equals(name3);
        boolean names5 = name1.equals(name4);

        System.out.println(names1);  //true
        System.out.println(names2);  //true
        System.out.println(names3);  //false . 단순 == 연산자의 경우 모두 참조타입의 변수이므로 주소값를 비교하게되므로 false /new 연산자를 통해 인스턴스 생성 시 모두 주소값이 다름
        System.out.println(names4);  //true  .equals -> 할당된 문자열값이 같은지를 체크하므로 true
        System.out.println(names5);  //true  .equals -> 할당된 문자열값이 같은지를 체크하므로 true

        /** 핵심 정리
         * new 연산자를 통해 인스턴스를 만들경우 새로운 주소값이 주어지며 할당값만 확인한다면 equals()를 비교하여 확인할 수 있으나
         * 단순 == 연산자를 사용할경우 참조변수이기때문에 서로의 주소값을 확인하므로 서로 다름
          */

        System.out.println("----------------------------");
        System.out.println("다양한 String Class Method");

        //해당 문자열의 특정 인덱스에 해당하는 문자 반환함,만약 해당 문자열의 길이보다 큰 인덱스나 음수를 전달하면 오류
        // #1
        String str1 = new String("세로드립");
        System.out.println("문자열 : " + str1);

        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(3));

        // #2
        /**
         * 문자열을 인수로 전달된 문자열과 사전 편찬 순,대소문자를 구분하여 비교
         * == -> 0 / 반환 문자열이 인수로 전달된 문자열보다 작으면 음수 / 크면 양수 반환
         */
        String str2 = new String("abcd");
        System.out.println("문자열 : " + str2);
        System.out.println(str2.compareTo("aBcd"));
        System.out.println(str2.compareTo("abcd"));
        System.out.println(str2.compareTo("hhhh"));
        System.out.println(str2.compareTo("ABESD"));
        System.out.println(str2.compareToIgnoreCase("Abcd"));  //대소문자 구분을 원하지않을경우 compareToIgnoreCase() method 를 사용하자 !

        System.out.println("----------------------------");

        // #3
        /**
         * 해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환
         * concat은 concatenate의 약자로 연결한다의 의미하며 만약 인수로 전달된 문자열의 길이가 0이면 문자열 그대로 뱉어냄
         */

        String str3 = new String("java");
        System.out.println("문자열 : + str3");
        System.out.println(str3.concat("가 정말 재밌어요"));

        System.out.println("----------------------------");

        // #4

        /**
         * 해당 문자열에서 특정 문자나 문자열이 처음으로 등장하는 위치의 인덱스를 반환
         * 만약 문자열에 전달된 문자나 문자열이 포함되이 있지 않으면 -1 반환
         */
        String str4 = new String("coding 중이야");
        System.out.println(str4.indexOf('g'));
        System.out.println(str4.indexOf("co"));
        System.out.println(str4.indexOf("중이야"));

        System.out.println("----------------------------");

        // #5

        /**
         * 해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백 문자를 제거
         * 띄어쓰기와 탭 문자 제거 메서드
         */

        String str5 = new String(" Java       ");
        System.out.println(str5.trim() + 'ㅣ');

        System.out.println("----------------------------");

        // #6

        /**
         * toLoworCase() 해당 문자열의 모든 문자를 소문자로 변환/ toUpperCase() 대문자로 변환
         */

        String str6_1 = new String("Java");
        System.out.println(str6_1.toUpperCase());  //대문자로 변환!

        String str6_2 = new String("JAVA");  //소문자로 변환!
        System.out.println(str6_2.toLowerCase());

        //https://www.javatpoint.com/understanding-toString()-method String Method Reference

    }
}
