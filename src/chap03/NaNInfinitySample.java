package chap03;

/**
 * NaN, Infinity 테스트 해보기
 */
public class NaNInfinitySample {
    public static void main(String[] args) {
        double a = 10;
        double b = 0;

        System.out.println(a / b);  // Infinity
        System.out.println(a % b);  // NaN

        System.out.println(Double.isInfinite(a/b));  // is~ : 결과가 boolean
        System.out.println(Double.isNaN(a%b));
    }
}
