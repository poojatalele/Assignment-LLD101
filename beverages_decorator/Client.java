package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		Beverage coffee = new Cappuccino();
        System.out.println("Coffee");
		System.out.println(coffee.cost());
		
		Beverage latte = new ChocolateDecorator(new SugarDecorator(new Latte()));
        System.out.println("Latte + Sugar + Chocolate cost: " + latte.cost());

        Beverage cappuccino = new ChocolateDecorator(new SugarDecorator(new Cappuccino()));
        System.out.println("Cappuccino + Milk + Sugar + cost: " + cappuccino.cost());
	}

}