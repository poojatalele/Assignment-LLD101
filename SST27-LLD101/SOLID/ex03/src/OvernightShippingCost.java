public class OvernightShippingCost implements IShippingCost{

    @Override
    public double cost(Shipment s) {
        return 120 + 10*s.weightKg;
    }
    
}
