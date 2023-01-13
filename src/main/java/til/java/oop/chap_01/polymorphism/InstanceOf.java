package til.java.oop.chap_01.polymorphism;

//타입 변환이 가능한지 여부를 boolean 타입으로확인할 수 있는 문법
//타입 캐스팅 가능 여부 : 객체를 어떤 생성자로 만들었는가/클래스 사이에 상속관게가 존재하는가
public class InstanceOf {
    public static void main(String[] args) {
        Bmw b = new Bmw();
        System.out.println(b instanceof Object); //bmw클래스로 만들어진 객체의 생성자 & 하위 클래스와 상속관계 성립되어있음
        System.out.println(b instanceof Car);  //bmw클래스로 만들어진 객체와 Car클래스를 비교하기때문에 false
        System.out.println(b instanceof Worker); //위와 동일하게 false;

        Car c = new Car();
        System.out.println(c instanceof Car);  //Car클래스로 만들어진 객체로 생성자가 일치하며 & 하위 클래스의 상속관계 성립되어있음
        System.out.println(c instanceof Bmw);  // bmw가 상위클래스이므로 타입변환 가능함 & 상위 클래스의 상속관계 성립
        //System.out.println(c instanceof Worker); //동일한 하위클래스의 경우 타입변환 불가

        /**
         * A instanceof B
         * A가 B로 다형적 선언이 가능한가 == 타입변환이 가능한가 == 객체타입을 상위클래스로 바꿔 사용이 가능한가
         */



    }

}

class Bmw {
};

class Car extends Bmw {
};

class Worker extends Bmw {
};