package chap04;

/**
 * while 문으로 1~5 까지 출력해보기
 *
 * while 문으로 0~60 까지 숫자 중 3 배수 출력해보기
 * (continue사용)
 */
public class WhileLoop {
    public static void main(String[] args) {
        int index = 1;
        while (index <= 5) {
            System.out.println(index);
            index++;
        }

        // while 문으로 0~60 까지 숫자 중 3 배수 출력해보기 (continue사용)
        int number = 0;
        while (number < 60) {
            number++;
            if (number % 3 !=0) {
                continue;
            }
            System.out.println(number + "는 3의 배수");
        }

    }
}
