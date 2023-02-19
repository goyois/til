package til.java.baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class B_06 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));  //출력받기
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));  //입력받기

        StringTokenizer stringTokenizer;  //문자열을 쪼개기

        int T = Integer.parseInt(bufferedReader.readLine());  //readLine()메서드는 기본 스트링형으로 리턴 값이 고정되어있으므로 형변환 필요

        for (int i = 0; i <T; i++) { //입력받는 수 만큼
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());  //입력받는 값을 문자 단위로 쪼갠 뒤 정수형으로 형변환
            bufferedWriter.write(Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken()) + "\n");
            //토크나이저를 통해 분리시킨 각각의 가공된 값을 더한 뒤 버퍼에 넣는다
        }
        bufferedReader.close();  //리더 닫기
        bufferedWriter.flush();  //버퍼에 담은 내용 출력
        bufferedWriter.close();  //버퍼 닫기
    }
}
