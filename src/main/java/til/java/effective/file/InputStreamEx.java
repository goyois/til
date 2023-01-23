package til.java.effective.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class InputStreamEx {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("java.txt");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) { //fileInputStream.readd의 리턴값을 i에 저장한 후 값이 -1인지 확인함
                System.out.println((char) i);
            }
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e);  // = c o d e
        }


        //ufferdInputStream 보조스트림을 통한 성능 향상

        try {
            FileInputStream fileInputStream = new FileInputStream("java.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
