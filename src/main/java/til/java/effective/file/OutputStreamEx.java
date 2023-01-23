package til.java.effective.file;

import java.io.FileOutputStream;

//파일 생성
public class OutputStreamEx {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("java.txt");
            String word = "java";

            byte b[] = word.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
            ;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
