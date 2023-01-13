package til.java.oop.chap_01.constructor;

import org.w3c.dom.ls.LSOutput;

import javax.xml.crypto.Data;

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