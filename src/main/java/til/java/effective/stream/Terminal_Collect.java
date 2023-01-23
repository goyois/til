package til.java.effective.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// collect() 요소들을 수집하는 최종 처리 메서드이며 스트림의 요소들을 List,Set,Map등 다른 타입의 결과로 수집하고 싶은 경우 사용
public class Terminal_Collect {
    public static void main(String[] args) {

        List<Student> total = Arrays.asList(  //Student 객체로 구성된 배열 리스트 생성
                new Student("김주원",50,Student.Gender.Male),
                new Student("우재석",60,Student.Gender.Male),
                new Student("정준하",10,Student.Gender.Male),
                new Student("박나래",50,Student.Gender.Female)
        );

        //스트림 연산 결과를 Map으로 반환
        Map<String,Integer> maleMap = total.stream()
                .filter(student -> student.getGender() == Student.Gender.Male)  //학생의 성별이 Male의 경우만 필터링
                .collect(Collectors.toMap(  // 생성은 리스트로 했지만 collect 메서드를 사용해 map 객체로 받아올 수 있음
                        student -> student.getName(),  //key
                        student -> student.getScore()  //value
                ));

        System.out.println(maleMap);
    }
}

class Student {
    public enum Gender {Male,Female};
    private String name;
    private int score;
    private Gender gender;

    public Student(String name, int score, Gender gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Gender getGender() {
        return gender;
    }
}