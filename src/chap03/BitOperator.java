package chap03;

/**
 * 비트 연산자 테스트 해보기
 */
public class BitOperator {
    public static void main(String[] args) {
        int x = 15;
        int y = 30;

        System.out.println(x & y);   // 14
        System.out.println(x | y);   // 31
        System.out.println(x ^ y);   // 17
        System.out.println(~x);      // -16

        // 비트 쉬프트 연산자
        int value = -8;
        System.out.println(value >>> 1);  // 2147483644
    }
}
