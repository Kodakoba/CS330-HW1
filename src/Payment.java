enum PaymentType{
    CASH,
    CARD
}
public interface Payment {
    public PaymentType paymentType();
    public void setAmount(double nAmount);
}
