package chap10.nongeneric;

/**
 * 제네릭 없는 클래스 예시
 * (double 타입 필드만 set, get 가능)
 */
public class DoubleBox {
    private double object;

    public void set(double object) {
        this.object = object;
    }

    public double get() {
        return this.object;
    }
}
