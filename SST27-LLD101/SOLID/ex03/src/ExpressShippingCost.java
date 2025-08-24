public class ExpressShippingCost implements IShippingCost {

    @Override
    public double cost(Shipment s) {
        return 80 + 8*s.weightKg;
    }
    
}
