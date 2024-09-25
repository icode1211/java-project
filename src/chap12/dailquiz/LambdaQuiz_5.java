package chap12.dailquiz;

import java.util.function.IntBinaryOperator;

public class LambdaQuiz_5 {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
                /* 최대값 얻기 구현 */
                Math::max
        );
        System.out.println("최대값 : " + max);

        int min = maxOrMin(
                /* 최소값 얻기 구현 */
                Math::min
        );
        System.out.println("최소값: " + min);
    }
}
