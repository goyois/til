package til.java.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write( ((A+B)%C) + "\n" );
        bw.write( ((A%C + B%C)%C) + "\n" );
        bw.write( ((A*B)%C) + "\n" );
        bw.write( ((A%C * B%C)%C) + "\n" );

        bw.flush();
        bw.close();
    }
}
/**
 * BufferReader
 * StringTokenizer
 * BufferWriter
 *
 */

