public class Shipment {
    // String type; 
    IShippingCost type;
    double weightKg;
    Shipment(IShippingCost type, double w){ 
        this.type=type;
        this.weightKg=w; 
    }
}