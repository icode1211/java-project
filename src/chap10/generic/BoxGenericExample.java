package chap10.generic;

/**
 * 제네릭 클래스 Box<T> 사용
 * 제네릭 메소드 Util.boxing 사용
 */
public class BoxGenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("문자열");
//        box.set(10);      // 다른 타입값은 입력 불가(컴파일 오류 발생)
        String str = box.get();
        System.out.println(str);

        Box<Integer> intBox = new Box<>();
        Box<Double> doubleBox = new Box<>();
        Box<Boolean> booleanBox = new Box<>();

        // 제네릭 메소드
        Box<String> value = Util.boxing("문자열값");
        Box<Integer> value2 = Util.boxing(56789);
        Box<Double> value3 = Util.boxing(567.89);
    }
}
