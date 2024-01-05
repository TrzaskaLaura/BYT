public class DiagnosticsHandler extends OrderHandler {
    @Override
    public void handleOrder(Order order) {
        if (order.getType().equals("Diagnostics")) {
            System.out.println("Diagnostyka w toku...");
            order.setState(new DiagnosticsState());
        } else if (nextHandler != null) {
            nextHandler.handleOrder(order);
        }
    }
}