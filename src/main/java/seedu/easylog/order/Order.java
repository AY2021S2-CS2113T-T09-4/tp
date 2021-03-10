package seedu.easylog.order;

public class Order {
    protected String orderName;

    public Order(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderName() {
        return orderName;
    }
}
