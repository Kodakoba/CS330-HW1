import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ShavedIceStore superStand = new Kiosk();
        superStand.paymentDue = new Cash();
        superStand.currentOrder = new Order();
        ShavedIceStore superIceStore = new Store();
        superIceStore.paymentDue = new Cash();
        superIceStore.currentOrder = new Order();
        System.out.println("First we are going to the Kiosk, then the Store.");
        superStand.Order();
        superStand.Pay(superStand.currentOrder.getOrderCost()+1.50);
        System.out.println("Now to the store!");
        superIceStore.Order();
        System.out.println("Will that be CASH or CARD");
        Scanner moneys = new Scanner(System.in);
        String paymentAuth = moneys.nextLine();
        switch (paymentAuth) {
            case "CARD":
                superIceStore.paymentDue = new CreditCard();
                System.out.println("Enter a card number: ");
                String cardNum = moneys.nextLine();
                BigInteger nCardNumber = BigInteger.valueOf(Long.parseLong(cardNum));
                superIceStore.Pay(superIceStore.currentOrder.getOrderCost());
                break;
            case "CASH":
                superIceStore.Pay(superIceStore.currentOrder.getOrderCost()+0.75);
                break;
            default:
                break;
        }
    }
}