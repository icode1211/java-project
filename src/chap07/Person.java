package chap07;

/**
 * 부모 클래스 Person
 * 상속받은 클래스는 Student, 객체 생성하는 클래스는 StudentExample
 */
public class Person {
    String name;
    String ssn;

    Person(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
