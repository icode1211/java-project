package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 매핑 관련 퀴즈
 */
public class MappingPersonExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 28)
        );

        // 나이가 28세 이상인 사람들의 이름 [Alice, Charlie]
        List<String> peopleList = people.stream()
                .filter(p -> p.getAge() >= 28)
                .map(Person::getName)
                .collect(Collectors.toList());// = toList()
        System.out.println(peopleList);     // [Alice, Charlie]
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
