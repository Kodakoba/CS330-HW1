import java.util.Scanner;
public class Store extends ShavedIceStore {
    public Store() {
        System.out.println("Welcome to the Shaved Ice Store");
    }
    public double Pay(double amount){
        double change = 0;
        paymentDue.paymentType();
        paymentDue.setAmount(amount);
        switch (paymentDue.paymentType()){
            case CASH:
                if(amount != currentOrder.getOrderCost()){
                    change = amount - currentOrder.getOrderCost();
                    System.out.println("Your change is "+change+" .");
                }
                break;
            case CARD:
                System.out.println("Payment Successful :)");
                break;
            default:
                break;
        }
        return change;
    }

    public void Order(){
        System.out.println("Welcome to shaved Ice what would you like?\n RED,\n BLUE,\n GREEN,\n PURPLE\n");
        enum orderColor{
            RED,
            BLUE,
            GREEN,
            PURPLE
        }
        enum orderOption{
            YES,
            NO
        }
        int interrupt = 0;
        Scanner iceCreams = new Scanner(System.in);
        do {
            String color = iceCreams.nextLine();
            switch (color) {
                case "RED":
                    currentOrder.setOrderCost(currentOrder.getOrderCost() + 1.00);
                    currentOrder.setOrderContent(currentOrder.getOrderContent() + "RED ");
                    break;
                case "BLUE":
                    currentOrder.setOrderCost(currentOrder.getOrderCost() + 1.10);
                    currentOrder.setOrderContent(currentOrder.getOrderContent() + "BLUE ");
                    break;
                case "GREEN":
                    currentOrder.setOrderCost(currentOrder.getOrderCost() + 1.20);
                    currentOrder.setOrderContent(currentOrder.getOrderContent() + "GREEN ");
                    break;
                case "PURPLE":
                    currentOrder.setOrderCost(currentOrder.getOrderCost() + 2.10);
                    currentOrder.setOrderContent(currentOrder.getOrderContent() + "PURPLE ");
                    break;
                default:
                    System.out.println("Invalid color");
                    break;
            }
            System.out.println("Anything else? ");
            String option = iceCreams.nextLine();
            switch (option) {
                case "YES":
                    break;
                case "NO":
                    interrupt = 1;
                    break;
                default:
                    System.out.println("YES or NO\n");
                    break;
            }


        }
        while(interrupt != 1);
        System.out.println("You ordered: \n"+currentOrder.getOrderContent()+"with a total cost of: "+currentOrder.getOrderCost());
        currentOrder.setOrderNumber(1000);
        System.out.println("Your order number is: "+currentOrder.getOrderNumber()+"\n");
    }
}
