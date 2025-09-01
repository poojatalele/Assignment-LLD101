public class StandardShippingCost implements IShippingCost{

    @Override
    public double cost(Shipment s) {
        return 50 + 5*s.weightKg;
    }
    
}
