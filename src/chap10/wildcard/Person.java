package chap10.wildcard;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {          // Object 에서 물려받은 toString() 메소드 재정의
        return name;
    }
}
