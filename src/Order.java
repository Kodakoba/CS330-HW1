public class Order {
    int orderNumber;
    String orderContent = "";
    double orderCost;

    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public String getOrderContent() {
        return orderContent;
    }
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }
    public double getOrderCost() {
        return orderCost;
    }
    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }
}
