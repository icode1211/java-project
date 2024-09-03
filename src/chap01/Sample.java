package chap01;

/**
 * inner 변수 선언 범위 확인해보기
 */
public class Sample {

    public static void main(String[] args) {
        int value = 0;
        System.out.println(value);

        if (true) {
            double inner = 1.2;
            System.out.println("조건이 참");

            for (int i = 0; i < 3; i++) {
                System.out.println(inner);
            }
        }
    }
}
