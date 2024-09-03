package chap03;

/**
 * 이항 연산자 테스트
 */
public class Sample {
    public static void main(String[] args) {
        // 사칙연산 테스트
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("-----------------------");

        // byte + byte -> int + int 자동변환 테스트
        byte x = 45;
        byte y = 67;
        int result = x + y;
        System.out.println(result);

        System.out.println("-----------------------");

        // (int) 캐스팅 위치에 따라 다른 연산 테스트
        int x2 = 40;
        double y2 = 50.34;

        int intResult3 = (int) (x2 + y2);   // (int) (40.0 + 50.34)
        int intResult4 = x2 + (int) y2;     // 40 + 50

        // int + int -> (double) 자동 캐스팅 테스트
        double doubleResult = x2 + y2;   // 40.0 + 50.34

        System.out.println(intResult3);
        System.out.println(intResult4);
        System.out.println(doubleResult);
    }
}
