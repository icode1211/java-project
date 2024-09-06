package chap06;

/**
 * 6.3.3.5 메서드 내에서 선언된 변수의 효력 범위
 */
public class Calculator {
    int a;

    Calculator() {
        // default 생성자
    }

    Calculator(int a) {
        this.a = a;
    }

    int postfixOperator(int a) {
        a++;
        return a;
    }

    void postfixOperator() {
        this.a++;   // a++;도 가능
    }

    void postfixOperator(Calculator cal) {
        cal.a++;
    }

    public static void main(String[] args) {
        int a = 1;
        Calculator calculator = new Calculator();
        int result = calculator.postfixOperator(a); // (메소드 타입)변경
        System.out.println(result);              // 2 출력

        // 2. Calculator cal 객체를 매개변수로 전달
        Calculator cal1 = new Calculator(1);
        cal1.postfixOperator(cal1);
        System.out.println(cal1.a);

        // 3. 최종 : cal 객체안의 a값을 변경해주는 메소드 호출
        Calculator cal2 = new Calculator(1);
        cal2.postfixOperator();
        System.out.println(cal2.a);
    }
}
