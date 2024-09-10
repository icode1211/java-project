package chap08.payment;

public class CreditCard implements Payment {
    private String cardNumber;

    CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        // amount 결제 로직
        System.out.println("Processing credit card payment of $" + amount + " using card number: " + cardNumber);
    }
}
