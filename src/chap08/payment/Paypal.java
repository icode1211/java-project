package chap08.payment;

public class Paypal implements Payment {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " using email: " + email);
        //todo 실제 PayPal 결제 로직
    }
}
