package chap12;

import java.util.function.IntBinaryOperator;

/**
 * 12.5.1 메소드 참조
 */
public class MethodReferecesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메소드 호출
        operator = Calculator::staticMethod;
        System.out.println("정적 메소드 호출 결과: " + operator.applyAsInt(1, 2));

        // 인스턴스 메소드 호출
        Calculator calculator = new Calculator();
        operator = calculator::method;
        System.out.println("인스턴스 메소드 호출 결과: " + operator.applyAsInt(3, 5));
    }
}
