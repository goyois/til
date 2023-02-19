package til.java.algorithm.method.stringbuilder;

public class StringBuilderMethod {

    protected static String str = "abcde";




    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        //append("추가할 문자열")
        System.out.println(sb.append("오늘 배운 것 ") + str);
        System.out.println(sb.insert(8,"매우 쉬워요")+"\n");  //8 위치에 "매우 쉬워요" 삽입; (-> 오늘 배운 것 매우 쉬워요)


        System.out.println(sb.delete(0, 7)); //0 ~ 1 위치의 문자열 삭제
        System.out.println(sb.deleteCharAt(6)+"\n");  //6 위치의 문자 삭제


        sb.setCharAt(0, 'w');  //0위치에 문자를 w로 변경
        System.out.println(sb+"\n");


        sb.reverse();  //문자열 뒤집기
        System.out.println(sb+"\n");


        sb.setLength(2);  //문자열 길이 2로 줄임
        System.out.println(sb);

        sb.setLength(4);  //문자열 길이 4로 늘림
        System.out.println(sb + str);  //기본값은 뒤가 공백으로 채워짐
    }
}
