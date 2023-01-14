package til.java.oop.chap.method;




public class ObjectMethod {
    public static void main(String[] args) {
        Method1 method1 = new Method1();
        method1.printHi();  //iv 인스턴스생성하여 힙메모리 영역의 메서드를 가져와 사용


//        printHi();  //static을 활용한 메서드

    }
}

class Method1 {
    void printHi() {
        System.out.println("하이");
    }


//   static void printHi() {  //static을 활용한 메서드
//        System.out.println("하이");
//    }
}