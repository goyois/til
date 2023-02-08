package til.java.Programmers.lv_0;

public class Lv0_1 {
    public static void main(String[] args) {


        int money = 55000;

        int[] arr = new int[2];
        int coffee = 5500;



        while (money >= coffee) {
            if (money >= coffee) {
                arr[0]++;
                money = money - coffee;
                arr[1] = money % coffee;
            }
        }for (int x : arr) {
            System.out.println(x);
        }
    }
}
