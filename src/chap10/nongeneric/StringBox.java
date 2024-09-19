package chap10.nongeneric;

/**
 * 제네릭 없는 클래스 예시
 * (String 타입 필드만 set, get 가능)
 */
public class StringBox {
    private String object;

    public void set(String object) {
        this.object = object;
    }

    public String get() {
        return this.object;
    }
}
