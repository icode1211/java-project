package chap10.limit;

/**
 * <T extends Number> 제한된 타입 파라미터로 메소드 정의
 */
public class Util {
    // -1, 0, 1
    public static <T extends Number> int compare(T t1, T t2) {
        // 실수형 변환
        double value1 = t1.doubleValue();
        double value2 = t2.doubleValue();
        return Double.compare(value1, value2);
    }
}
