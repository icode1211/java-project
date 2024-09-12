package chap10;

/**
 * 제네릭 없는 클래스 예시
 */
public class Box {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return this.object;
    }
}
