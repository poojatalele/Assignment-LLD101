public class OrderService {
    private final TaxPolicy tax;
    private final Notifier notifier;
    private final OrderRepository repo;

    public OrderService(TaxPolicy tax, Notifier notifier, OrderRepository repo) {
        this.tax = tax;
        this.notifier = notifier;
        this.repo = repo;
    }

    public void checkout(String customerEmail, double subtotal) {
        double total = tax.totalWithTax(subtotal);
        notifier.send(customerEmail, "Thanks! Your total is " + total);
        repo.checkout(customerEmail, total); 
    }
}