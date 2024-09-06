package chap06;

/**
 * 6.4 final 필드 초기화
 */
public class Person {
    final String nation;
    String name;

    Person(String name) {
        this.nation  = "Korea";  // 생성자에서 final 필드 초기화
        this.name = name;
    }
}
