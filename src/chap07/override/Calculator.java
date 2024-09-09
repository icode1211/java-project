package chap07.override;

/**
 * areaCircle(r) 메소드 재정의 (override)
 */
public class Calculator {
    // 상수
    static final double PI = 3.14159;

    // PI * R * R
    double areaCircle(double r) {
        return PI * r * r;
    }
}
