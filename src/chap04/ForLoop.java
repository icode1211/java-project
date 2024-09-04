package chap04;

/**
 * 1. for문을 이용해서 1~50까지 출력해보기 => 스레드에 코드 올리기
 * 2. 1~50 범위 안에서 짝수만 출력해보기
 */
public class ForLoop {
    public static void main(String[] args) {
        // 코드 작성해보기
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
