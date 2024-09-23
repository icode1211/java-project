package chap12.custom;

/**
 * MyFunctionalInterface4 함수형 인터페이스의 구현 클래스 직접 작성
 */
public class MyFunctionalInterface4Impl implements MyFunctionalInterface4 {
    @Override
    public int method(int x, int y) {
        return x * y;
    }
}
