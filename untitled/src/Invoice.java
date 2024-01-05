import java.util.ArrayList;
import java.util.List;
public class Invoice {
    private List<InvoiceItem> items;

    public Invoice(List<InvoiceItem> items) {
        this.items = items;
    }

    public void printInvoice() {
        double totalCost = 0;
        System.out.println("Faktura:");
        for (InvoiceItem item : items) {
            System.out.println("- " + item.getDescription() + ": " + item.getCost());
            totalCost += item.getCost();
        }
        System.out.println("Łączny koszt: " + totalCost);
    }
}