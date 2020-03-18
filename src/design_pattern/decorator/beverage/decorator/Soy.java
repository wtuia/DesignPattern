package design_pattern.decorator.beverage.decorator;

import design_pattern.decorator.beverage.component.Beverage;

/**
 * 装饰者
 */
public class Soy extends CondementDecorator {

    Beverage beverage;
    
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

}
