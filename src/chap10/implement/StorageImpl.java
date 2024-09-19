package chap10.implement;

/**
 * 인터페이스 구현클래스(제네릭)
 */
public class StorageImpl<T> implements Storage<T> {
    private T[] array;

    public StorageImpl(int capacity) {
        array = (T[]) new Object[capacity];
    }

    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}