package chap09.custom;

/**
 * BalanceInsufficientException 사용자 정의 예외를 생성해서 던져보기
 * (throw, throws 각각의 키워드 사용)
 */
public class CustomExceptionSample {

    void method() throws BalanceInsufficientException {
        // 예외를 수동으로 발생시키기
        throw new BalanceInsufficientException("잔고 부족 에러 메시지");
    }
}
