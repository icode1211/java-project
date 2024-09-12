package chap10.generic;

/**
 * 제네릭 메소드 선언
 */
public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
}
