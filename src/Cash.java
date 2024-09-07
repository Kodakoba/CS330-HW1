public class Cash implements Payment {
    double amount;

    public PaymentType paymentType(){
        System.out.println("Paid Cash");
        return PaymentType.CASH;
    }

    public void setAmount(double nAmount){
        amount = nAmount;
    }
}
