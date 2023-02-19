package til.java.algorithm.method.string;

import java.io.IOException;
//문자열 메소드 정리
public class StringMethod {

    protected static String str = "abcde";

    public static void main(String[] args) {


        str.length();  //문자열의 길이
        System.out.println("1-1. 문자열의 길이는 : "+str.length());

        str.isEmpty(); //문자열의 길이가 0이면 true 아니면 false
        System.out.println("1-2. 빈 문자열인지 : "+str.isEmpty()+"\n");


        str.charAt(2);  //인덱스로 문자 찾기
        System.out.println("2-1. 인덱스 2의 값에 해당하는 문자는 : "+str.charAt(2));
        str.indexOf("c");  //문자로 첫번째 인덱스 값 찾기
        System.out.println("2-2. 해당 문자의 첫번째 인덱스 값은 : "+str.indexOf("a"));
        str.lastIndexOf("c");  //문자로 마지막 인덱스 값 찾기
        System.out.println("2-3. 해당 문자의 마지막 인덱스 값은 : "+str.lastIndexOf("c")+"\n");


        str.substring(0,4);  //0 ~ 3까지의 위치의 문자열 찾기 4 미포함
        System.out.println("3-1. 0 ~ 3 전까지 인덱스의 값은 :"+str.substring(0,4));
        System.out.println("3-2. 3부터 끌까지 찾기 : "+str.substring(3)+"\n");  //3부터 끝까지 찾기  3포함


        str.replace('b','k');  //str의 b -> k 로 바꾸기
        System.out.println("4-1. 문자 변경 : "+str.replace('b','k')+"\n");


        str.equals("abcde"); //str과 abcde를 비교하여 같으면 true, 다르면 false
        System.out.println("5-1. 값 비교하기 :"+str.equals("abcde"));
        str.contains("bc");  //str 내에 bc가 포함될 경우 true , 아닐경우 false
        System.out.println("5-2. str 내에 포함하는지의 여부 판단 : "+str.contains("bc")+"\n");


        str.split(" "); //띄어쓰기로 구분된 문자열 str를 분리해서 String[] 배열 반환
        System.out.println("6-1. 띄어쓰기로 구분된 문자열 분리 한 뒤 배열 반환 : "+str.split(" "));
        str.split(str);  //띄어쓰기 없는 문자열 str을 한 문자씩 분리하여 String[] 배열 반환
        System.out.println("6-2. 띄어쓰기 없는 문자열 한 문자씩 분리하여 배열 반환 : "+str.split(str)+"\n");


        str.trim();  //str 앞뒤 공백 제거 문자열 사이 공백은 x
        System.out.println("7-1. str의 앞뒤 공백 제거 : "+str.trim()+"\n");


        str.toLowerCase();  //str 내의 문자열 소문자 변경
        System.out.println("8-1. str의 문자열 소문자로 변경 : "+str.toLowerCase());
        str.toUpperCase();  //str 내의 문자열 대문자 변경
        System.out.println("8-2. str의 문자열 대문자로 변경 : "+str.toUpperCase()+"\n");


        str.compareTo("abcde");  //
        System.out.println(str.compareTo("abcde")+"\n");
        /**
         * str과 abcde가 같으면 0
         * str이 abcde보다 사전순으로 앞임녀 -1
         * str이 abcde보다 사전순으로 뒤면 1
         * str과 abcde가 마지막 문자만 다르면 마지막 문자의 사전순 차이 반환 (여기선 1)
         */


        Integer.toString(350); //숫자를 문자열로 변환
        System.out.println("10-1. 숫자 -> 문자열 변환 :"+Integer.toString(350));
        Integer.parseInt("500"); //문자열을 숫자로 변환
        System.out.println("10-2. 문자열 -> 숫자 변환 :"+Integer.parseInt("500"));
    }
}
