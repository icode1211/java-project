package chap10;

/**
 * 제네릭 없는 클래스 객체 생성, 사용
 */
public class BoxExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("문자열");

        String str = (String) box.get();
        System.out.println(str);
    }
}
