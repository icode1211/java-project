package chap05;

/**
 * 외부 클래스의
 * 클래스 변수, 인스턴스 변수 접근하기
 */
public class OutterClass {

    public static void main(String[] args) {
        System.out.println(ClassInstanceVariable.index); // 클래스 변수 접근

        ClassInstanceVariable object = new ClassInstanceVariable();
        System.out.println(object.index2);      // 인스턴스 변수 접근
    }
}
