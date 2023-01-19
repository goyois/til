package til.java.collection.collectionframework.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ListTest {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("유재석");
        list.add("정준하");
        list.add("정형돈");
        list.add("하하");

        int size = list.size();  // 1부터 시작

        list.remove(1); //index 값

        for (String x : list) {
            System.out.println(x);
        }
    }
}

