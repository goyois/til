package til.java.baekjoon.bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_34 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int x : arr) {
            sb.append(x).append("\n");
        }
        System.out.println(sb);
    }
}
