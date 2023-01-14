package til.java.oop.chap_01.constructor.quiz;

public class Student {
    public static void main(String[] args) {
        Univ u = new Univ();
        u.setDepartment("컴공");
        u.setStudentId(22);

        System.out.println(u.getDepartment());
        System.out.println(u.getStudentId());


    }
}

class Univ {
    private String department;
    private int studentId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

//1. Univ 클래스의 인스턴스를 생성해서 매개변수 + this. 를 통해 값을 넣어주는 방식
//2. 캡슐화 적용 시 ) this. 제거 후 set 메서드를 통해 값 설정하기