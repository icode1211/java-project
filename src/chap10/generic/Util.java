package chap10.generic;

public class Util {
    public static final double PI = 3.14159;    // 클래스 변수


    /**
     * 제네릭 메소드 선언
     */
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
}
