package til.java.Programmers.lv_1;

public class Lv1_04 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int result = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                result += i;
            }
        }else if(a > b){
                for (int i = b; i <= a; i++) {
                    result += i;
                }
            } else {
            result = a;
        }
        System.out.println(result);
    }
}
