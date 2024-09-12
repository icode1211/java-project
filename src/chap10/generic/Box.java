package chap10.generic;

/**
 * 제네릭 클래스 Box<T> 선언
 */
public class Box<T> {
    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return this.object;
    }


}
