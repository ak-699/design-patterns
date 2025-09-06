package structural.decorator.coffee_shop;

public class SimpleCoffee implements Coffee {

    @Override
    public String getName() {
        return "Simple coffee";
    }

    @Override
    public String getDescription() {
        return "Rich aroma with flavors";
    }

    @Override
    public double getCost() {
        return 99.99;
    }

}
