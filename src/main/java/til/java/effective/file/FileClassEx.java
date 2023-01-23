package til.java.effective.file;

import java.io.File;
import java.io.IOException;

//File 클래스란?
public class FileClassEx {
    public static void main(String[] args) throws IOException {
        File file = new File("../JuWon.txt"); //파일의 인스턴스를 생성하는 것이 곧 파일을 생성하는 것은 아니다.
        file.createNewFile();  //파일 생성 메서드를 써줘야함
        System.out.println(file.getPath());  //파일에 입력한 경로 반환
        System.out.println(file.getParent()); //파일의 조상 디렉토리를 반환
        System.out.println(file.getCanonicalPath());  //절대 경로를 반환하지만 앞에 ../을 정리하고 반환
        System.out.println(file.canWrite());  //파일에 쓰기 가 가능한지 여부




        File parentDir = new File("./");
        File[] list = parentDir.listFiles();  //list 에 parantDir의 파일 목록들을 배열형태로 넣어줌

        String prefix = "code";  //붙여줄 문자열

        for (int i = 0; i < list.length; i++) {  //list안에 배열의 길이가 클 때 까지
            String fileName = list[i].getName();  //fileName 에 list의 0번째 index 값의 파일 이름을 가져온다

            if (fileName.endsWith("txt") && !fileName.startsWith("code")) {  //만약 파일이름의 끝이 txt라면 또는 파일이름의 시작이 code가 아닐경우
                list[i].renameTo(new File(parentDir, prefix + fileName));  //리스트의 인덱스에 해당하는 값은 rename되어 새로운 파일이 생긴다.
            }
        }
    }
}
