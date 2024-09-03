package chap03;

/**
 * 삼항 연산자 Quiz
 * a, b 중에 큰 값을 반환하기 (만약에 a,b둘 다 같다면 a 반환하기)
 */
public class OperatorTestSample {
    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        // 값이 같다면 a 반환
        int result = (a >= b) ? a : b;
        System.out.println(result);
    }
}
