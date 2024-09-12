package chap09.custom;

/**
 * 사용자 정의 오류 (deposit 예외)
 *  Checked Exception
 */
public class DepositException extends Exception {
    public DepositException(String message) {
        super(message);
    }
}
