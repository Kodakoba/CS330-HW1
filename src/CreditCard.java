public class CreditCard implements Payment {
    double amount;
    public PaymentType paymentType(){
        System.out.println("Paid with card");
        return PaymentType.CARD;
    }
    public void setAmount(double nAmount){
        amount = nAmount;
    }
}