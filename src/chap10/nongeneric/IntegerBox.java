package chap10.nongeneric;

/**
 * 제네릭 없는 클래스 예시
 * (Integer 타입 필드만 set, get 가능)
 */
public class IntegerBox {
    private int object;

    public void set(int object) {
        this.object = object;
    }

    public int get() {
        return this.object;
    }
}
