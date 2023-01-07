package til.java.basic.variable;

public class TypeCasting {
    public static void main(java.lang.String[] args) {
        //형변환 시 원칙
        // byte(1) -> short(2)/char(2) -> int(4) -> long(8) -> float(4) -> double(8)
        // long < float 소수점으로 인해 조금 더 정밀하기 때문에

        System.out.println("작은 데이터타입 -> 큰 데이터타입(자동 형변환)");

        long longValue = 12345L;  //longValue라는 정수형 변수에 12345를 할당
        float floatValue = longValue;  //floatValue라는 변수를 다시 할당한뒤 longValue 변수를 할당하여 변환시킴

        System.out.println(floatValue);  //변환시킨 변수 {floatValue} 를 출력 12345.0

        System.out.println("-----------------------------");
        System.out.println("큰 데이터타입 -> 작은 데이터타입(이런 경우 수동 형변환해줘야함)");

        int intValue = 128;  //intValue 라는 정수형 변수에 128 할당
        byte byteValue = (byte) intValue;  //변환된 값을 받을 byteValue 정수형 변수 선언 후 int -> byte 으로 변환될 수 있도록
                                           //정의되는 값앞에 소괄호로 자신의 타입을 선언해줌 (byte)
                                           //그 다음 동일하게 변환대상의 변수명을 할당

        System.out.println(byteValue);     //최종 변환되어 값이 들어가는 변수 {byteValue} 를 출력 -128

        System.out.println("-----------------------------");
        System.out.println("<advanced>");
        System.out.println("String(문자열) -> int(정수형)");

        java.lang.String height = "180";
        java.lang.String weight = "70";

        int userHeight = Integer.parseInt(height);  //변환할 문자열을 Integer.parseInt 메서드의 매개변수로 넣어줌
        int userWeight = Integer.parseInt(weight);

        System.out.println(height);  //넣어준 매개변수(문자열)가 메서드를 통해 변환되어 출력됨
        System.out.println(weight);

        System.out.println("-----------------------------");
        System.out.println("int(정수형) -> String(문자열)");

        int headSize = 30;
        int hairLength = 20;

        java.lang.String userHeadSize = Integer.toString(headSize);  //변환할 정수를 Integer.toString 메서드의 매개변수로 넣어줌
        java.lang.String userHairLength = Integer.toString(hairLength);

        System.out.println(headSize);  //넣어준 매개변수가 메서드를 통해 변환되어 출력됨
        System.out.println(hairLength);
    }
}
