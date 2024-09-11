package chap09.custom;

/**
 * 은행계좌 클래스
 * - 잔액 속성 (balance)
 * - 생성자
 * - 입금 기능
 * - 출금 기능 : 인출 money보다 잔액이 부족할경우 수동 예외 발생
 */
public class Account {
    long balance;

    Account(long balance) {
        this.balance = balance;
    }

    void deposit(long money) {
        this.balance += money;
    }

    void withdraw(long money) throws BalanceInsufficientException {
        if (balance < money) {  // 출금 불가!
            throw new BalanceInsufficientException("잔액이 부족합니다. 남은금액: " + balance);
        }
        balance -= money;
    }
}
