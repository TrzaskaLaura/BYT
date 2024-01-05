public abstract class OrderHandler {
    protected OrderHandler nextHandler;

    public void setNextHandler(OrderHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleOrder(Order order);
}