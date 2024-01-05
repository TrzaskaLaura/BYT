public class PartsHandler extends OrderHandler {
    @Override
    public void handleOrder(Order order) {
        if (order.getType().equals("Parts")) {
            System.out.println("Oczekiwanie na części...");
            order.setState(new PartsState());
        } else if (nextHandler != null) {
            nextHandler.handleOrder(order);
        }
    }
}