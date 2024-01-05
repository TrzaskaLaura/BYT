public class Order {
    private String type;
    private OrderState state;

    public Order(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
