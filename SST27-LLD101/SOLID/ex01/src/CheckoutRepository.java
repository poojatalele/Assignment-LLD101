public class CheckoutRepository implements OrderRepository{

    @Override
    public void checkout(String customerEmail, double subtotal) {
        System.out.println("Order stored (pretend DB).");
    }
    
}
