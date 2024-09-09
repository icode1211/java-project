package chap07.override;

public class Computer extends Calculator {

    @Override       // 메소드 재정의 한다. (컴파일러에게 알려줌)
    double areaCircle(double r) {
        return Math.PI * r * r;
    }
}
