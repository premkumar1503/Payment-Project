package PaymentProject;

public abstract class Payment
{
    String paymentType;
    double amount;

    //constructor
    public Payment(String paymentType,double amount)
    {
        this.paymentType=paymentType;
        this.amount=amount;
    }
    //abstract method to be implemented by subclass
    public abstract void processPayment();

    public void paymentDetails()
    {
        System.out.println("Payment type : "+paymentType);
        System.out.println("Amount : "+amount);
    }
}
