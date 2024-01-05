public class RepairHandler extends OrderHandler {
    @Override
    public void handleOrder(Order order) {
        if (order.getType().equals("Repair")) {
            System.out.println("Naprawa w toku...");
            order.setState(new RepairState());
        } else if (nextHandler != null) {
            nextHandler.handleOrder(order);
        }
    }
}