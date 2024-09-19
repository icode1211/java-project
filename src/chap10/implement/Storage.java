package chap10.implement;

/**
 * 제네릭 인터페이스 선언
 */
public interface Storage<T> {
    void add(T item, int index);

    T get(int index);
}
