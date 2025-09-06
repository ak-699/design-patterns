package structural.decorator.coffee_shop;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return decoratedCoffee.getName();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " ,Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 9.9;
    }

}
