package chap12.dailquiz;

import java.util.function.IntSupplier;

public class LambdaQuiz_4 {
    public static int method(int x, int y) {
        IntSupplier supplier = () -> {  // final int x = ?
            int a = x * 10;
            return a + y;
        };
        return supplier.getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(method(3, 5));
    }
}
