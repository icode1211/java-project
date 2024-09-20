package chap10.wildcard;

import java.util.Arrays;

/**
 * 와일드카드로 선언한 매개변수
 * 와일드카드 extends, super 키워드로 타입 제한
 */
public class WildCardExample {
    public static void registerPerson(Course<?> t) {
        System.out.println(t.getName() + ": " + Arrays.toString(t.getStudents()));
    }

//    public static void registerPerson2(Course<? extends Student> t) {
//        System.out.println(t.getName() + ": " + Arrays.toString(t.getStudents()));
//    }

    // 와일드카드 타입(?) 대신에 타입파라미터(T) 지정 가능
    // 위에서 정의한 registerPerson2와 동일한 동작.
    public static <T extends Student> void registerPerson2(Course<T> t) {
        System.out.println(t.getName() + ": " + Arrays.toString(t.getStudents()));
    }

    public static void registerPerson3(Course<? super Worker> t) {
        System.out.println(t.getName() + ": " + Arrays.toString(t.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 4);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 4);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 4);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 4);
        highStudentCourse.add(new HighStudent("고등학생"));

        registerPerson3(personCourse);
        registerPerson3(workerCourse);
//        registerPerson3(studentCourse);       // 컴파일 오류!
//        registerPerson3(highStudentCourse);

        System.out.println("=========================");
//        registerPerson2(personCourse);        // 컴파일 오류!
//        registerPerson2(workerCourse);
        registerPerson2(studentCourse);
        registerPerson2(highStudentCourse);

        System.out.println("=========================");
        registerPerson(personCourse);
        registerPerson(workerCourse);
        registerPerson(studentCourse);
        registerPerson(highStudentCourse);
    }
}
