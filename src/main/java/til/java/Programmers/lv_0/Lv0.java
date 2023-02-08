package til.java.Programmers.lv_0;

public class Lv0 {
    public static void main(String[] args) {
//
//        String s = "my_string";
//
//        StringBuilder sb = new StringBuilder(s);
//
//        String reverse = sb.reverse().toString();
//
//        System.out.println(reverse);
//
//

        int[] num_list = {1,2,3,4,5};
        int count1 = 0;
        int count2 = 0;
        int[] arr = new int[0];

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                arr[i] = count1++;
            }
            for (int j = 0; j < num_list.length; j++) {
                if (num_list[i] % 2 != 0) {
                    arr[i] = count2++;
                }
            }
        }
    }
}
