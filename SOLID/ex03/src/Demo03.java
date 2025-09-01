public class Demo03 {
    public static void main(String[] args) {
        try{
            ShippingCostCalculator calc = new ShippingCostCalculator();
            Shipment shp = new Shipment(new ExpressShippingCost(), 2.0);
            System.out.println(calc.cost(shp));
        }
        catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        // System.out.println(new ShippingCostCalculator().cost(new Shipment("EXPRESS", 2.0)));
    }
}
