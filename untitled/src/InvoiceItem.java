import java.util.ArrayList;
import java.util.List;
public class InvoiceItem {
    private String description;
    private double cost;

    public InvoiceItem(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}