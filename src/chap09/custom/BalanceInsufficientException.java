package chap09.custom;

/**
 * 사용자 정의 예외(checked Exception로) 만들어보기
 */
public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {

    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}
