package til.java.oop.chap.constructor;

public class Data1 {
    public static void main(String[] args) {
        Data2 d1 = new Data2();
        Data3 d2 = new Data3(5);

        System.out.println(d1);
        System.out.println(d2);
    }
}

class Data2 {
    int value;
}

class Data3 {
    int value;

    Data3(int x) {
        value = x;
    }
}