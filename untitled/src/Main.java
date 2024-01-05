public class Main {
    public static void main(String[] args) {

        OrderHandler diagnosticsHandler = new DiagnosticsHandler();
        OrderHandler partsHandler = new PartsHandler();
        OrderHandler repairHandler = new RepairHandler();

        diagnosticsHandler.setNextHandler(partsHandler);
        partsHandler.setNextHandler(repairHandler);


        Order order = new Order("Repair");
        diagnosticsHandler.handleOrder(order);


        OrderState currentState = order.getState();
        if (currentState != null) {
            System.out.println("Aktualny stan: " + currentState.processState());
        }


        InvoiceBuilder builder = new InvoiceBuilder();
        builder.addItem(new InvoiceItem("Naprawa silnika", 500));
        builder.addItem(new InvoiceItem("Części zamienne", 300));
        Invoice invoice = builder.getInvoice();
        invoice.printInvoice();
    }
}
