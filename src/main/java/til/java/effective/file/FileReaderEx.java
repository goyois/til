package til.java.effective.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        try {
            String fileName = "java.txt";
            FileReader file = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(file);  //성능 향상을 위한 버퍼리더 클래스

            int data = 0;

            while ((data = file.read()) != -1) {
                System.out.println((char) data);
            }
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
