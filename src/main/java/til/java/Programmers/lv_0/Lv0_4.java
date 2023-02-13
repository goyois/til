package til.java.Programmers.lv_0;

public class Lv0_4 {
    public static void main(String[] args) {
        int n = 10;

        int [] arr = new int[(n+1) / 2];

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                arr[i / 2] = i;
            }
        }
        for (int x : arr){
            System.out.println(x);
        }
    }
}
