public class GSTTaxCalculation implements TaxPolicy{
    private final double taxRate = 0.18;

    @Override
    public double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
