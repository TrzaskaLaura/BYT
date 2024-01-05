public class RepairState implements OrderState {
    @Override
    public String processState() {
        return "W trakcie naprawy";
    }
}