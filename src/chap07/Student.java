package chap07;

public class Student extends Person {
    int studentNo;

    Student(String name, String ssn, int studentNo) {
        super(name, ssn);       // 자식 클래스 생성자의 가장 위쪽에 있어야함
        this.studentNo = studentNo;
    }
}
