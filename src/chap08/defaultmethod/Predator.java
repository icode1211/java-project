package chap08.defaultmethod;

/**
 * 디폴트 메소드 printFood() 추가
 */
public interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}
