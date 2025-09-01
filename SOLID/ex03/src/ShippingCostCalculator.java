public class ShippingCostCalculator {
    public double cost(Shipment s) {
        return s.type.cost(s);
    }
}
