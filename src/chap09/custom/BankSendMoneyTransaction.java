package chap09.custom;

/**
 * '송금' 트랜잭션 / 중간에 출금 실패시 롤백
 *  A -> B 10만원 송금
 *    만약 잔액보다 큰 금액을 송금 시도할 경우 트랜잭션 처리
 */
public class BankSendMoneyTransaction {
    public static void main(String[] args) {
        Account accountA = new Account(30000);
        Account accountB = new Account(0);

        int money = 100_000;
        try {
            accountB.deposit(money);        // B계좌 입금
            accountA.withdraw(money);       // A계좌 출금
        } catch (BalanceInsufficientException e) {
            // A 계좌 출금 실패했을 때, B계좌에 입금된 금액 차감 (롤백)
            System.out.println("송금 실패, B 계좌 롤백 합니다.");
            accountB.depositRollback(money);
        }
//        catch (DepositException e) {
//            System.out.println("입금 실패에 대한 처리");
//        }
    }
}
