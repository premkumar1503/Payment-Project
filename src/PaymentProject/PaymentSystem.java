package PaymentProject;

import java.util.Scanner;

public abstract class PaymentSystem
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the payment type : ");
        String paymentType = scanner.nextLine();

        System.out.print("Enter the Amount : ");
        double Amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Pin number : ");
        String card = scanner.nextLine();

        Payment payment1 = new CreditCardPayment(paymentType,Amount,card);
        payment1.paymentDetails();
        payment1.processPayment();

        System.out.println();

        System.out.print("Enter the payment type : ");
        String paymentType1 = scanner.nextLine();

        System.out.print("Enter the Amount : ");
        double Amount1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the Email ID: ");
        String email1 = scanner.nextLine();


        Payment payment2 = new PayPalPayment(paymentType1, Amount1 ,email1);
        payment2.paymentDetails();
        payment2.processPayment();
    }
}
