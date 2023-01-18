package til.java.oop.chap.constructor;

public class Con {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("하하하");
        Constructor c3 = new Constructor(1,2,3);
    }
}
class Constructor{
    Constructor() {
        System.out.println("1번");
    }
    Constructor(String str) {
        System.out.println("2번");
    }
    Constructor(int a, int b, int c) {
        System.out.println("3본");

    }
}
