public class Demo01 {
    public static void main(String[] args) {
        TaxPolicy tax = new GSTTaxCalculation();
        Notifier notifier = new EmailNotifier(new EmailClient());
        OrderRepository repo = new CheckoutRepository();

        OrderService service = new OrderService(tax, notifier, repo);
        service.checkout("a@shop.com", 100.0);
    }
}
