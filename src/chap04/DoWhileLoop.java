package chap04;

/**
 * do-while 문으로 0~60 까지 숫자 중 3 배수 출력해보기
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i % 3 == 0) {
                System.out.println(i + "는 3의 배수");
            }
        } while (i < 60);
    }
}
