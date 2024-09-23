package PaymentProject;

public class PayPalPayment extends Payment
{
    String email;
    public PayPalPayment(String paymentType,double amount,String email)
    {
        super(paymentType,amount);
        this.email=email;
    }
    @Override
    public void processPayment()
    {
        System.out.println("Processing PayPal payment...");
        System.out.println("PayPal email : "+email);
        System.out.println("Payment successful for $"+amount);
    }
}
