package PaymentProject;

public class CreditCardPayment extends Payment
{
    String cardNumber;

    // constructor
    public CreditCardPayment(String paymentType,double amount, String cardNumber)
    {
        super(paymentType,amount);
        this.cardNumber=cardNumber;
    }
    // Implemented abstract method
    @Override
    public void processPayment()
    {
        System.out.println("Processing Credit card payment ...");
        System.out.println("Card Number : "+cardNumber);
        System.out.println("Payment Successful for $"+amount);
    }
}
