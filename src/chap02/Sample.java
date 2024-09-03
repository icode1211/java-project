package chap02;

/**
 * 박싱 오토박싱 테스트
 */
public class Sample {
    public static void main(String[] args) {
        // 박싱 (int -> Integer)
        int a = 10;
        Integer a2 = Integer.valueOf(a);

        // 오토 박싱 (int -> Integer)
        Integer a3 = a;
    }
}
