package til.java.basic.control.control_1;

import java.util.Scanner;

public class Algorithm {
    public String convertScore(int score) {
        String grade;

        if (score > 100 || score < 0) { //score가 100보다 크거나 0이 더 크면
            return "INVALID SCORE";  //잘못된 점수입니다. 출력
        }
        if (score == 100) {
            return "A+";
        }
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            grade = "F";
        }
        if (!grade.equals("F")) {  //만약 등급이 F가 아니라면 변수 extra에 점수에서 10을 나눈 후 남은 값을 저장함//등급이 F 라면 실행되지않음
            int extra = score % 10;
            if (extra <= 2) {  //extra보다 2가 크거나 같을경우
                grade = grade + "-";  //{grade} -  = B-
            } else if (extra >= 8) {  //윗 조건이 참이 아니라면 -> extra가 0보다 크거나 같을경우
                grade = grade + "+";  //{grade} + = B+
            }
        }
        return grade;
    }
}