import java.util.ArrayList;
import java.util.List;
public class InvoiceBuilder {
    private List<InvoiceItem> items;

    public InvoiceBuilder() {
        this.items = new ArrayList<>();
    }

    public void addItem(InvoiceItem item) {
        this.items.add(item);
    }

    public Invoice getInvoice() {
        return new Invoice(items);
    }
}