package til.java.effective.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {

        try {
            String fileName = "java.txt";
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String str = "good!";
            fileWriter.write(str);

            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
