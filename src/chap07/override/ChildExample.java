package chap07.override;

/**
 * 7.4 메소드 재정의 실습
 */
public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();        // child에 재정의한 메소드가 호출됨
        child.method3();

        Parent parent = new Parent();
        parent.method1();
        parent.method2();       // parent의 메소드가 호출됨
    }
}
