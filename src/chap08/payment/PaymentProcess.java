package chap08.payment;

public class PaymentProcess {
    public static void main(String[] args) {
        // 객체 생성 (paypal, creditcard)
        CreditCard creditCard = new CreditCard("5678-5345");
        creditCard.processPayment(67000);
        Paypal paypal = new Paypal("email@aws.com");
        paypal.processPayment(67000);

        // 인터페이스 타입으로 선언 가능
        Payment creditCard2 = new CreditCard("5678-5345");
        creditCard2.processPayment(67000);
        Payment paypal2 = new Paypal("email@aws.com");
        paypal2.processPayment(67000);

    }
}
