
public class Demo04 {
    public static void main(String[] args) {
        try{
            PaymentService ps = new PaymentService();
            Payment p = new Payment(new UPIPayment(), 499);
            System.out.println(ps.pay(p));
        } catch (RuntimeException e){
            System.err.println("No Provider");
        }
    }
}
