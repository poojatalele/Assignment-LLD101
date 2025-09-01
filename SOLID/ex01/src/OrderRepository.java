public interface OrderRepository {
    void checkout(String customerEmail, double subtotal);
} 
