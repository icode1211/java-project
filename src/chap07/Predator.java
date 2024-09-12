package chap07;

/**
 * default method 선언
 */
interface Predator {
    String getFood();

    // 디폴트 메소드
    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}
