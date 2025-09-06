package structural.decorator.coffee_shop;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return decoratedCoffee.getName();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ",Sugar";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 4.9;
    }

}
